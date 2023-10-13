package com.udemy.pattern.generative;
/**
 Позволяет копировать объекты, не вдаваясь в подробности их реализации.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Клон, Прототип

 ПРИМЕНИМОСТЬ:
 * Когда ваш код не должен зависеть от классов копируемых объектов.
 * Когда вы имеете уйму подклассов, которые отличаются начальными значениями
 полей. Кто-то мог создать все эти классы, чтобы иметь возможность легко
 порождать объекты с определённой конфигурацией.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Позволяет клонировать объекты, не привязываясь к их конкретным классам.
 + Меньше повторяющегося кода инициализации объектов.
 + Ускоряет создание объектов.
 + Альтернатива созданию подклассов для конструирования сложных объектов.
 - Сложно клонировать составные объекты, имеющие ссылки на другие объекты.
*/

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Street", 54);
        User user1 = new User("Mike", 22, address);
        User user2 = new User(user1);

        // Обьекты разные
        System.out.println(user1 != user2);
        // Поля одинаковые
        System.out.println(user1);
        System.out.println(user2);
    }
}

class Address {
    private String street;
    private int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public Address(Address address) {
        this.street = address.street;
        this.number = address.number;
    }

    @Override
    public String toString() {
        return "Address: " + this.street + " " + this.number;
    }
}

class User {
    private String name;
    private int age;
    private Address address;

    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public User(User user) {
        this.name = user.name;
        this.age = user.age;
        this.address = new Address(user.address);
    }

    @Override
    public String toString() {
        return "User: " + this.name + " " + this.age + ". " + this.address;
    }
}

// Плохая практика: есть проблемы с вложенными объектами и финальными полями
/**
 * Поддержка паттерна в JDK
 */
//class User implements Cloneable {
//    String name;
//    int age;
//
//    public User(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    protected User clone() throws CloneNotSupportedException {
//        return (User) super.clone();
//    }
//}
/**
 * Реализация вручную
 */
//class User {
//    String name;
//    int age;
//
//    public User(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public User copy(User user) {
//        return new User(user.name, user.age);
//    }
//}
