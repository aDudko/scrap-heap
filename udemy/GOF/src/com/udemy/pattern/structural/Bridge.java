package com.udemy.pattern.structural;
/**
 Паттерн Bridge позволяет отделить абстракцию от имплементации,
 что позволяет сократить колличество классов-имплементаций

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Мост

 ПРИМЕНИМОСТЬ:
 * Когда вы хотите разделить монолитный класс, который содержит
 несколько различных реализаций какой-то функциональности (например,
 если класс может работать с разными системами баз данных).
 * Когда класс нужно расширять в двух независимых плоскостях.
 * Когда вы хотите, чтобы реализацию можно было бы изменять во время
 выполнения программы.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Позволяет строить платформо-независимые программы.
 + Скрывает лишние или опасные детали реализации от клиентского кода.
 + Реализует принцип открытости/закрытости.
 - Усложняет код программы из-за введения дополнительных классов.

           ----- Vehicle -----                    - Model -
         /          |          \                /     |     \
    Car(Model)  Track(Model)  Bike(Model)    Toyota  Audi  Mercedes
*/

public class Bridge {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Toyota());
        vehicle.drive();

        vehicle = new Track(new Audi());
        vehicle.drive();
    }
}

// Car, Track и т.д.
abstract class Vehicle {
    Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

    abstract void drive();
}

class Car extends Vehicle {
    public Car(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("Drive car");
    }
}

class Track extends Vehicle {
    public Track(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("Drive track");
    }
}

// Audi, Toyota, Mercedes и т.д.
interface Model {
    void drive(String str);
}

class Audi implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + " Audi");
    }
}

class Toyota implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + " Toyota");
    }
}

/*
                     ---------- Vehicle ----------
                   /                               \
      --------- Car -------                   ----- Track -----
    /            |          \               /         |         \
    AudiCar  ToyotaCar  MercedesCar   AudiTrack  ToyotaTrack  MercedesTrack

    interface Car {}
    interface Track {}
    interface Bike {}

    Далее получается слишком дофига вариантов!
    С добавлением нового интерфейса, количество
    классов ростет в гиперболической прогрессии

    class AudiCar {}
    class AudiTrack {}
    class ToyotaCar {}
    class ToyotaTrack {}
    class MercedesCar {}
    class MercedesTrack {}
*/