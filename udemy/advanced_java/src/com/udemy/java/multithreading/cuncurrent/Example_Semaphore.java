package com.udemy.java.multithreading.cuncurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Example_Semaphore {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Connection connection = Connection.getConnection();

        for (int i = 0; i < 200; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

class Connection {
    private int connectionsCount;
    // Ограничение на одновременное использование ресурса потоками
    private Semaphore semaphore = new Semaphore(10); // Количество разрешенных потоков

    //Singleton
    private static Connection connection = new Connection();
    private Connection() {}
    public static Connection getConnection() {
        return connection;
    }

    // Обертка с Semaphore
    public void work() throws InterruptedException {
        semaphore.acquire();
        doWork();
        semaphore.release();
    }

    private void doWork() throws InterruptedException {
        // Какая-то бизнес-логика
        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }
        Thread.sleep(5000);
        synchronized (this) {
            connectionsCount--;
            System.out.println(connectionsCount);
        }
    }
}
