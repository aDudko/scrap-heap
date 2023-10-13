package com.udemy.pattern.structural;
/**
 Flyweight позволяет вместить бóльшее количество объектов в
 отведённую оперативную память. Flyweight экономит память,
 разделяя общее состояние объектов между собой, вместо хранения
 одинаковых данных в каждом объекте.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Легковес, Приспособленец, Кэш

 ПРИМЕНИМОСТЬ:
 * Когда не хватает оперативной памяти для поддержки всех нужных объектов.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Экономит оперативную память.
 - Расходует процессорное время на поиск/вычисление контекста.
 - Усложняет код программы из-за введения множества дополнительных классов.
*/

import java.util.WeakHashMap;

public class Flyweight {
    public static void main(String[] args) {
        PersonCache cache = new PersonCache();
        Person mike = cache.getPerson("Mike");
        Person mike2 = cache.getPerson("Mike");
        System.out.println(mike == mike2);
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

class PersonCache {
    // То же, что и HashMap. Но при заполнении памяти
    // GarbageCollector может удалять из нее объекты
    private static final WeakHashMap<String, Person> persons = new WeakHashMap<>();

    public Person getPerson(String name) {
        Person person = persons.get(name);
        if (person == null) {
            person = new Person(name);
            persons.put(name, person);
        }
        return person;
    }
}