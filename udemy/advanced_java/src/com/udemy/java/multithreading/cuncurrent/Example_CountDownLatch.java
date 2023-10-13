package com.udemy.java.multithreading.cuncurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example_CountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        // Защелка
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 9; i++) {
            executorService.submit(new Processor(countDownLatch));
        }

        executorService.shutdown();
        // Замкнуть
        countDownLatch.await();
        System.out.println("Latch has bin opened main thread is proceeding!");
    }
}

class Processor implements Runnable {
    private CountDownLatch countDownLatch;

    public Processor(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("ru.dudko.multithreading.cuncurrent.Processor " + Thread.currentThread().getName() + " start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Разомкнуть
        countDownLatch.countDown();
    }
}
