package com.udemy.java.multithreading.cuncurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example_ReentantLock {
    public static void main(String[] args) throws InterruptedException {
        RLTask task = new RLTask();
        Thread thread1 = new Thread(() -> task.firstThread());
        Thread thread2 = new Thread(() -> task.secondThread());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        task.showCount();
    }
}

class RLTask {
    private int count;
    // Для синхронизации потоков. Исключение возможных DeadLock-ов
    private Lock lock = new ReentrantLock();

    private void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public void firstThread() {
        lock.lock();
        try {
            increment();
        } finally {
            /*
             unlock обрабатывается только в блоке finaly
             т.к если случиться ошибка, то lock никогда
             не разблокируется
             */
            lock.unlock();
        }
    }

    public void secondThread() {
        lock.lock();
        try {
            increment();
        } finally {
            lock.unlock();
        }
    }

    public void showCount() {
        System.out.println(count);
    }
}

