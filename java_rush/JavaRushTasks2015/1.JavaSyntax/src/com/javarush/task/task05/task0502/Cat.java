package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false — если нет.

Должно выполняться условие:
если cat1.fight(cat2) = true,
то cat2.fight(cat1) = false

Требования:
1.Метод fight не должен считывать данные с клавиатуры.
2.Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
3.Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
4.Метод fight не должен выводить данные на экран.
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {}

    public boolean fight(Cat anotherCat) {
        return this.strength > anotherCat.strength && this.weight > anotherCat.weight;
    }

    public static void main(String[] args) {}
}