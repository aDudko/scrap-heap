package com.udemy.pattern.behavioral.observer;
/**
 Cоздает механизм подписки, позволяющий одним объектам следить
 и реагировать на события, происходящие в других объектах.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Издатель-Подписчик, Producer-Consumer, Слушатель, Наблюдатель

 ПРИМЕНИМОСТЬ:
 * Когда после изменения состояния одного объекта требуется что-то
 сделать в других, но вы не знаете наперёд, какие именно объекты
 должны отреагировать.
 * Когда одни объекты должны наблюдать за другими, но только в
 определённых случаях.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Издатели не зависят от конкретных классов подписчиков и наоборот.
 + Вы можете подписывать и отписывать получателей на лету.
 + Реализует принцип открытости/закрытости.
 - Подписчики оповещаются в случайном порядке.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Observer {
    public static void main(String[] args) {
        Subject subject = new Subject();
        MyObservable subscriber1 = new Subscriber1();
        // Подписываем два подписчика
        subject.subscribe(subscriber1);
        subject.subscribe(new Subscriber2());
        // Делаем рассылку
        subject.notifySubscribers("First message");
        // Отписываем одного
        subject.unsubscribe(subscriber1);
        // Делаем рассылку
        subject.notifySubscribers("Second message");


        Subject2 subject2 = new Subject2();
        subject2.addObserver(new Subscriber3());
        subject2.addObserver(new Subscriber4());
        subject2.setChanged();
        subject2.notifyObservers("Message");
    }
}

/**
 * Поддержка паттерна в JDK
 */

class Subject2 extends Observable {
    @Override
    protected synchronized void setChanged() {
        super.setChanged(); // Пока не вызовешь работать не будет
    }
}

class Subscriber3 implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Subscriber3: " + arg);
    }
}

class Subscriber4 implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Subscriber4: " + arg);
    }
}

/**
 * Реализация вручную
 */

// Каждый подписчик должен реализовывать этот (общий) интерфейс
interface MyObservable {
    void callMe(String message);
}

// Подписчик 1
class Subscriber1 implements MyObservable {
    @Override
    public void callMe(String message) {
        System.out.println("Subscriber1: " + message);
    }
}

// Подписчик 2
class Subscriber2 implements MyObservable {
    @Override
    public void callMe(String message) {
        System.out.println("Subscriber2: " + message);
    }
}

class Subject {
    // Список сообщений
    List<MyObservable> list = new ArrayList<>();

    // Подписаться
    public void subscribe(MyObservable myObservable) {
        list.add(myObservable);
    }

    // Отписаться
    public void unsubscribe(MyObservable myObservable) {
        list.remove(myObservable);
    }

    // Отправить сообщение подписчикам
    public void notifySubscribers(String message) {
        list.forEach(item -> item.callMe(message));
    }
}