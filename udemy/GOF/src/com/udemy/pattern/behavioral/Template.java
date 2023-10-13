package com.udemy.pattern.behavioral;
/**
 Определяет скелет алгоритма, перекладывая ответственность за некоторые
 его шаги на подклассы. Паттерн позволяет подклассам переопределять шаги
 алгоритма, не меняя его общей структуры.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Template Method, Шаблонный метод

 ПРИМЕНИМОСТЬ:
 * Когда подклассы должны расширять базовый алгоритм, не меняя его структуры.
 * Когда у вас есть несколько классов, делающих одно и то же с незначительными
 отличиями. Если вы редактируете один класс, то приходится вносить такие же
 правки и в остальные классы.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Облегчает повторное использование кода.
 - Вы жёстко ограничены скелетом существующего алгоритма.
 - Вы можете нарушить принцип подстановки Барбары Лисков, изменяя базовое поведение
 одного из шагов алгоритма через подкласс.
 - С ростом количества шагов шаблонный метод становится слишком сложно поддерживать.
*/

public class Template {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        System.out.println("Make coffee");
        coffee.makeBeverage();

        Beverage tee = new Tee();
        System.out.println("Make tee");
        tee.makeBeverage();
    }
}

// Template
abstract class Beverage {
    private void boilWater() {
        System.out.println("* add water");
    }

    private void addSugar() {
        System.out.println("* add sugar");
    }

    abstract void addBeverage();
    abstract void addCondiment();

    public void makeBeverage() {
        boilWater();
        addBeverage();
        addSugar();
        addCondiment();
        hook();
    }

    /*
     * Можно добавить метод hook(), который ничего не делает.
     * Но его можно переопределить в имплементации и
     * тот кто будет имплементировать метод может прописать
     * какую-то свою логику
     */
    void hook() {}
}

class Coffee extends Beverage {
    @Override
    void addBeverage() {
        System.out.println("* add coffee");
    }

    @Override
    void addCondiment() {
        System.out.println("* add milk");
    }
}

class Tee extends Beverage {
    @Override
    void addBeverage() {
        System.out.println("* add tee");
    }

    @Override
    void addCondiment() {
        System.out.println("* add lemon");
    }
}
