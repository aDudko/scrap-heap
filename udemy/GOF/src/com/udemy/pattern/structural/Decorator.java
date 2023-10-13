package com.udemy.pattern.structural;
/**
 Decorator позволяет динамически добавлять объектам новую функциональность,
 оборачивая их в полезные «обёртки».

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Wrapper, Обёртка

 ПРИМЕНИМОСТЬ:
 * Когда вам нужно добавлять обязанности объектам на лету, незаметно для кода,
 который их использует.
 * Когда нельзя расширить обязанности объекта с помощью наследования.

 ПРИЕМУЩЕСТВА И НЕДОСТАТКИ:
 + Большая гибкость, чем у наследования.
 + Позволяет добавлять обязанности на лету.
 + Можно добавлять несколько новых обязанностей сразу.
 + Позволяет иметь несколько мелких объектов вместо одного объекта на все случаи жизни.
 - Трудно конфигурировать многократно обёрнутые объекты.
 - Обилие крошечных классов.
*/

public class Decorator {
    public static void main(String[] args) {
        Pizza pizza = new PepperoniPizza(new CheesePizza(new DoughPizza()));
        System.out.println(pizza.makePizza());
    }
}

interface Pizza {
    String makePizza();
}

class DoughPizza implements Pizza {
    @Override
    public String makePizza() {
        return "Pizza with ";
    }
}

class CheesePizza implements Pizza {
    Pizza pizza;

    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "cheese ";
    }
}

class PepperoniPizza implements Pizza {
    Pizza pizza;

    public PepperoniPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "pepperoni ";
    }
}

/*
 Чтобы понять разницу, нужно добавить в закоментированный код еще несколько
 ингридиентов и написать классы чтобы ингридиенты комбинировались в разных
 вариантах.

    interface Pizza {
        void makePizza();
    }

    class PepperoniPizza implements Pizza {
        @Override
        public void makePizza() {
            System.out.println("with pepperoni");
        }
    }

    class CheesePizza implements Pizza {
        @Override
        public void makePizza() {
            System.out.println("with cheese");
        }
    }

    class CheesePepperoniPizza implements Pizza {
        @Override
        public void makePizza() {
            System.out.println("with cheese and pepperoni");
        }
    }
*/