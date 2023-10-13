package com.javarush.task.task17.task1712;

public class Cook implements Runnable {
    //Флаг завершения программы
    public boolean continueWorking = true;

    @Override
    public void run() {
        boolean needToWait; //Нужно подождать
        while (continueWorking || needToCookOrders()) {
            try {
                synchronized (this) {
                    needToWait = !needToCookOrders();
                    if (!needToWait) {
                        cook();
                    }
                }
                if (continueWorking && needToWait) {
                    System.out.println("Повар отдыхает");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {}
        }
    }

    private boolean needToCookOrders() {
        //Проверяем есть ли не приготовленные заказы
        return !Manager.getInstance().getOrderQueue().isEmpty();
    }

    private void cook() throws InterruptedException {
        Manager manager = Manager.getInstance();
        //Повар берет заказ из очереди
        Order order = manager.getOrderQueue().poll();
        System.out.println(String.format("Заказ будет готовиться %d мс для стола №%d", order.getTime(), order.getTableNumber()));
        //Повар готовит блюдо
        Thread.sleep(order.getTime());
        //Это готовое блюдо
        Dishes dishes = new Dishes(order.getTableNumber());
        manager.getDishesQueue().add(dishes);
        System.out.println(String.format("Заказ для стола №%d готов", dishes.getTableNumber()));
    }
}