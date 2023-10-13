package com.udemy.java.multithreading.cuncurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Example_ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        // Пул потоков, состоящий из 2 потоков
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i)); // В submit() передается класс реализующий Runnable
        }

        executorService.shutdown(); // Прекращает передачу заданий и приступает к выполнению
        System.out.println("All tasks submitted");
        executorService.awaitTermination(1, TimeUnit.DAYS); // Ожидание окончания
    }
}

class Work implements Runnable {
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ru.dudko.multithreading.cuncurrent.Work " + id + " was completed");
    }
}
