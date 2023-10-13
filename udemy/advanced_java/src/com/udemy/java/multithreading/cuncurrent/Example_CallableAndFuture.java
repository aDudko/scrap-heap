package com.udemy.java.multithreading.cuncurrent;

import java.util.Random;
import java.util.concurrent.*;

public class Example_CallableAndFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Thread starting");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread finished");
                Random random = new Random();
                return random.nextInt(100);
            }
        });

        executorService.shutdown();

        try {
            int result = future.get(); // get() дожидается окончания выполнения потока
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
