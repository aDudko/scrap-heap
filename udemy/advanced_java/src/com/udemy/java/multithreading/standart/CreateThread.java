package com.udemy.java.multithreading.standart;

public class CreateThread {
    public static void main(String[] args) {
//        ru.dudko.multithreading.standart.MyThread myThread = new ru.dudko.multithreading.standart.MyThread();
//        // start() создает новый поток и выполняет то, что описано в run()
//        myThread.start();
//        System.out.println("MAIN THREAD");
        Thread myThread = new Thread(new Runner());
        myThread.start();
    }
}

class Runner implements Runnable {
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("Hello from ru.dudko.multithreading.standart.MyThread");
        }
    }
}

//class ru.dudko.multithreading.standart.MyThread extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 500; i++) {
//            System.out.println("Hello from ru.dudko.multithreading.standart.MyThread");
//        }
//    }
//}
