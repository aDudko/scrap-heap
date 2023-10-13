package com.udemy.java.multithreading.standart;

import java.util.Random;

public class Interrupted {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            Random random = new Random();
            for (int i = 0; i < 1_000_000_000; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread was interrupted");
                    break;
                }
                Math.sin(random.nextDouble());
            }
        });

        System.out.println("Starting thread...");
        thread.start();

        Thread.sleep(1000);
        thread.interrupt();

        thread.join();

        System.out.println("Thread has finished");
    }
}
