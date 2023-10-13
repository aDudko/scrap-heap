package com.udemy.java.multithreading.standart;

public class Synchronized {
    public static void main(String[] args) throws InterruptedException {
        SunchTask task = new SunchTask();
        Thread thread1 = new Thread(() -> task.firstThread());
        Thread thread2 = new Thread(() -> task.secondThread());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        task.showCount();
    }
}

class SunchTask {
    private int count;

    private synchronized void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public void firstThread() {
        increment();
    }

    public void secondThread() {
        increment();
    }

    public void showCount() {
        System.out.println(count);
    }
}
