package com.udemy.pattern.behavioral.observer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumer {
    // Потокобезопасная очередь
    private static ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        // Поток производителя
        Thread threadProduce = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Поток потребителя
        Thread threadConsume = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadProduce.start();
        threadConsume.start();

        threadProduce.join();
        threadConsume.join();

    }

    // Производитель
    private static void produce() throws InterruptedException {
        Random random = new Random();

        while (true) {
            /*
            Заполнение очереди
            put() - если очереди заполнена, то метод будет ждать чтобы записать следующий элемент
             */
            queue.put(random.nextInt(100));
        }
    }

    // Потребитель
    private static void consumer() throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
            /*
            Чтение из очереди
             */
            Integer take = queue.take();
            // junk
            System.out.println(take);
            System.out.println("Queue size is " + queue.size());
        }
    }
}
