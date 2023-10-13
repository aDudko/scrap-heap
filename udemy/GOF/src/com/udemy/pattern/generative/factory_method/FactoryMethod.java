package com.udemy.pattern.generative.factory_method;
/**
 Определяет общий интерфейс для создания объектов в суперклассе,
 позволяя подклассам изменять тип создаваемых объектов.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Виртуальный конструктор, Фабричный метод

 ПРИМЕНИМОСТЬ:
 * Когда заранее неизвестны типы и зависимости объектов, с которыми
 должен работать ваш код.
 * Когда вы хотите дать возможность пользователям расширять части вашего
 фреймворка или библиотеки.
 * Когда вы хотите экономить системные ресурсы, повторно используя уже
 созданные объекты, вместо порождения новых.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Избавляет класс от привязки к конкретным классам продуктов.
 + Выделяет код производства продуктов в одно место, упрощая поддержку кода.
 + Упрощает добавление новых продуктов в программу.
 + Реализует принцип открытости/закрытости.
 - Может привести к созданию больших параллельных иерархий классов, так как для каждого
 класса продукта надо создать свой подкласс создателя.
*/

public class FactoryMethod {
    public static void main(String[] args) {
        CarFactory carFactory = new MercedesFactory();
        carFactory.createCar();
    }
}

abstract class CarFactory {
    // Абстрактный метод
    public void createCar() {
        Car car = getCar();
        car.drive();
        // more code...
    }

    abstract Car getCar();
}

class MercedesFactory extends CarFactory {
    @Override
    Car getCar() {
        return new Mercedes();
    }
}

class BmwFactory extends CarFactory {
    @Override
    Car getCar() {
        return new Bmw();
    }
}

interface Car {
    void drive();
}

class Mercedes implements Car {
    @Override
    public void drive() {
        System.out.println("drive Mercedes");
    }
}

class Bmw implements Car {
    @Override
    public void drive() {
        System.out.println("drive BMW");
    }
}
