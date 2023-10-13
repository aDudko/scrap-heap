package com.udemy.pattern.behavioral;
/**
 Позволяет добавлять в программу новые операции,
 не изменяя классы объектов, над которыми эти операции
 могут выполняться.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Посетитель

 ПРИМЕНИМОСТЬ:
 * Когда вам нужно выполнить какую-то операцию над всеми элементами
 сложной структуры объектов, например, деревом.
 * Когда над объектами сложной структуры объектов надо выполнять некоторые
 не связанные между собой операции, но вы не хотите «засорять» классы такими
 операциями.
 * Когда новое поведение имеет смысл только для некоторых классов из
 существующей иерархии.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Упрощает добавление операций, работающих со сложными структурами объектов.
 + Объединяет родственные операции в одном классе.
 + Посетитель может накапливать состояние при обходе структуры элементов.
 - Паттерн не оправдан, если иерархия элементов часто меняется.
 - Может привести к нарушению инкапсуляции элементов.
*/

public class Visitor {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.accept(new SoundAnimalVisitor());
        dog.accept(new EatVisitor());
    }
}

interface Animal {
    void accept(AnimalVisitor animalVisitor);
}

class Dog implements Animal {
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.action(this);
    }
}

class Cat implements Animal {
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.action(this);
    }
}

interface AnimalVisitor {
    void action(Dog dog);
    void action(Cat cat);
    // ...
}

class SoundAnimalVisitor implements AnimalVisitor {
    @Override
    public void action(Dog dog) {
        System.out.println("гав");
    }

    @Override
    public void action(Cat cat) {
        System.out.println("мяу");
    }
}

// Если мы хотим расширить функциональность, то нужна еще
// одна имплементация AnimalVisitor
class EatVisitor implements AnimalVisitor {
    @Override
    public void action(Dog dog) {
        System.out.println("eat mean");
    }

    @Override
    public void action(Cat cat) {
        System.out.println("eat fish");
    }
}