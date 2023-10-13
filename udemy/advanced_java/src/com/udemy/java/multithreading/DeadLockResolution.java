package com.udemy.java.multithreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockResolution {
    public static void main(String[] args) throws InterruptedException {
        RunnerBankEmulatorResolution runner = new RunnerBankEmulatorResolution();

        Thread thread1 = new Thread(() -> runner.firstThread());
        Thread thread2 = new Thread(() -> runner.secondThread());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finished();
    }
}

class RunnerBankEmulatorResolution {
    private AccountResolution account1 = new AccountResolution();
    private AccountResolution account2 = new AccountResolution();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void takeLock(Lock lock1, Lock lock2) {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        while (true) {
            try {
                firstLockTaken = lock1.tryLock(); // Возвразает true, если удалось захватить lock
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) { // Если оба lock захвачены, выходим из метода
                    return;
                }

                // Если какой-то из lock не захватился, то освобождаем второй lock
                if (firstLockTaken) {
                    lock1.unlock();
                }

                if (secondLockTaken) {
                    lock2.unlock();
                }

                // junk
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void firstThread() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            takeLock(lock1, lock2); // Все еще забираем lock в разных порядках
            try {
                AccountResolution.transfer(account1, account2, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void secondThread() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            takeLock(lock2, lock1); // Все еще забираем lock в разных порядках
            try {
                AccountResolution.transfer(account2, account1, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished() {
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance: " + (account1.getBalance() + account2.getBalance()));
    }
}

class AccountResolution {
    private int balance = 10000;

    // Пополнение
    public void deposit(int amount) {
        balance += amount;
    }

    // Списание
    public void withdraw(int amount) {
        balance -= amount;
    }

    //Запрос баланса
    public int getBalance() {
        return balance;
    }

    // Денежный перевод
    public static void transfer(AccountResolution acc1, AccountResolution acc2, int amount) {
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}
