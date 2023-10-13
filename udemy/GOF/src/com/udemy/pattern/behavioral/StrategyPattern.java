package com.udemy.pattern.behavioral;
/**
 Определяет семейство схожих алгоритмов и помещает каждый из них
 в собственный класс, после чего алгоритмы можно взаимозаменять
 прямо во время исполнения программы.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Стратегия

 ПРИМЕНИМОСТЬ:
 * Когда вам нужно использовать разные вариации какого-то алгоритма
 внутри одного объекта.
 * Когда у вас есть множество похожих классов, отличающихся только
 некоторым поведением.
 * Когда вы не хотите обнажать детали реализации алгоритмов для других
 классов.
 * Когда различные вариации алгоритмов реализованы в виде развесистого
 условного оператора. Каждая ветка такого оператора представляет собой
 вариацию алгоритма.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Горячая замена алгоритмов на лету.
 + Изолирует код и данные алгоритмов от остальных классов.
 + Уход от наследования к делегированию.
 + Реализует принцип открытости/закрытости.
 - Усложняет программу за счёт дополнительных классов.
 - Клиент должен знать, в чём состоит разница между стратегиями, чтобы
 выбрать подходящую.
*/

public class StrategyPattern {
    public static void main(String[] args) {
        Car car1 = new Toyota(new FlyCar());
        Car car2 = new Tractor(new NoFly());
        car1.fly();
        car2.fly();
    }
}

interface Flyable {
    void fly();
}

class FlyCar implements Flyable {
    @Override
    public void fly() {
        System.out.println("fly");
    }
}

class NoFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("no fly");
    }
}

abstract class Car {
    Flyable flyable;

    public Car(Flyable flyable) {
        this.flyable = flyable;
    }

    abstract void run();

    public void stop() {
        System.out.println("stop");
    }

    public void fly() {
        flyable.fly();
    }
}

class Toyota extends Car {
    public Toyota(Flyable flyable) {
        super(flyable);
    }

    @Override
    void run() {
        System.out.println("run toyota");
    }
}

class Ferrari extends Car {
    public Ferrari(Flyable flyable) {
        super(flyable);
    }

    @Override
    void run() {
        System.out.println("run ferrari");
    }
}

class Tractor extends Car {
    public Tractor(Flyable flyable) {
        super(flyable);
    }

    @Override
    void run() {
        System.out.println("run tractor");
    }
}