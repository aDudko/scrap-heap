package com.javarush.task.task05.task0504;

/* 
Трикотаж
Пару задач назад студенты секретного центра JavaRush создавали класс Cat. Теперь пришла пора реализовать котов во плоти,
разумеется по образу и подобию класса Cat, а точнее — основываясь на нём, как на шаблоне. Их — котов — должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.

Требования:
1.Программа не должна считывать данные с клавиатуры.
2.Нужно создать три объекта типа Cat.
3.Класс Cat нельзя изменять.
4.Программа не должена выводить данные на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", 4, 5, 10);
        Cat marsik = new Cat("Marsik", 2, 3, 4);
        Cat timka = new Cat("Tima", 3, 6, 8);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}