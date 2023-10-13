package com.udemy.pattern.generative.abstract_factory;
/**
 Позволяет создавать семейства связанных объектов,
 не привязываясь к конкретным классам создаваемых объектов.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Абстрактная фабрика

 ПРИМЕНИМОСТЬ:
 * Когда бизнес-логика программы должна работать с разными видами связанных
 друг с другом продуктов, не завися от конкретных классов продуктов.
 * Когда в программе уже используется
 {@link ru.dudko.patterns.generative.factory_method.FactoryMethod},
 но очередные изменения предполагают введение новых типов продуктов.

 ПРИЕМУЩЕСТВА И НЕДОСТАТКИ:
 + Гарантирует сочетаемость создаваемых продуктов.
 + Избавляет клиентский код от привязки к конкретным классам продуктов.
 + Выделяет код производства продуктов в одно место, упрощая поддержку кода.
 + Упрощает добавление новых продуктов в программу.
 + Реализует принцип открытости/закрытости.
 - Усложняет код программы из-за введения множества дополнительных классов.
 - Требует наличия всех типов продуктов в каждой вариации.
*/

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractFactory mercedesFactory = new MercedesFactory();
        Car car = mercedesFactory.getCar();
        Bike bike = mercedesFactory.getBike();
        car.drive();
        bike.drive();
    }
}

interface AbstractFactory {
    Car getCar();
    Bike getBike();
}

class MercedesFactory implements AbstractFactory {
    @Override
    public Car getCar() {
        return new MercedesCar();
    }

    @Override
    public Bike getBike() {
        return new MercedesBike();
    }
}

class BmwFactory implements AbstractFactory {
    @Override
    public Car getCar() {
        return new BmwCar();
    }

    @Override
    public Bike getBike() {
        return new BmwBike();
    }
}

interface Car {
    void drive();
}

interface Bike {
    void drive();
}

class MercedesCar implements Car {
    @Override
    public void drive() {
        System.out.println("drive Mercedes car");
    }
}

class BmwCar implements Car {
    @Override
    public void drive() {
        System.out.println("drive BMW car");
    }
}

class MercedesBike implements Bike {
    @Override
    public void drive() {
        System.out.println("drive Mercedes bike");
    }
}

class BmwBike implements Bike {
    @Override
    public void drive() {
        System.out.println("drive BMW bike");
    }
}

