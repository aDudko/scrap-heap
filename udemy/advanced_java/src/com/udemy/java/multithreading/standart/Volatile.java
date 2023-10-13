package com.udemy.java.multithreading.standart;

import java.util.Scanner;

public class Volatile {

    public static void main(String[] args) {
        // main - пишущий поток
        // myThread - читающий поток
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread.shutdown();
    }
}

class MyThread extends Thread {
    // запрещаем кэшировать running
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
