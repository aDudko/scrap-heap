package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1.
В методе finalize уменьшать на 1.

Требования:
1.Добавь в класс Cat конструктор без параметров public Cat().
2.Конструктор класса должен на 1 увеличивать значение переменной catCount.
3.Добавь в класс Cat метод finalize.
4.Метод finalize ничего не должен возвращать (тип возвращаемого значения void).
5.Метод finalize должен уменьшать переменную catCount на 1.
*/

public class Cat {
    public static int catCount = 0;

    public Cat() {
        catCount++;
    }

    @Override
    protected void finalize() throws Throwable {
        catCount--;
    }

    public static void main(String[] args) {}
}