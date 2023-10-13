package com.udemy.pattern.generative;
/**
 Паттерн Builder позволяет сконструировать объект у которого
 много полей и все они не обязательны. Позволяет не перегружать
 конструкторы несметное количество раз.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Строитель

 ПРИМЕНИМОСТЬ:
 * Когда вы хотите избавиться от «телескопического конструктора».
 * Когда ваш код должен создавать разные представления какого-то
 объекта. Например, деревянные и железобетонные дома.
 * Когда вам нужно собирать сложные составные объекты, например,
 деревья {@link ru.dudko.patterns.structural.Composite}.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Позволяет создавать продукты пошагово.
 + Позволяет использовать один и тот же код для создания различных продуктов.
 + Изолирует сложный код сборки продукта от его основной бизнес-логики.
 - Усложняет код программы из-за введения дополнительных классов.
 - Клиент будет привязан к конкретным классам строителей, так как в интерфейсе
 директора может не быть метода получения результата.
*/

public class Builder {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl().setName("Tom").setAge(17).build();
    }
}

class Person {
    private String name;
    private int age;
    private double salary;
    //...

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //...
}

interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder setSalary(double salary);
    //...
    Person build();
}

class PersonBuilderImpl implements PersonBuilder {
    Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder setSalary(double salary) {
        person.setSalary(salary);
        return this;
    }

    //...

    @Override
    public Person build() {
        return person;
    }
}
