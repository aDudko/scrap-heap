package com.javarush.task.task02.task0202;

/* 
Откуда берутся Person?
В классе Person объяви следующие переменные: name типа String, age типа int, weight типа int, money типа int.
В методе main создай объект Person, занеси его ссылку в переменную person.

Требования:
1.В классе Person объяви переменную name типа String.
2.В классе Person объяви переменную age типа int.
3.В классе Person объяви переменную weight типа int.
4.В классе Person объяви переменную money типа int.
5.В методе main создай объект Person, присвой ссылку на него переменной person.
6.Должно быть объявлено 5 переменных.
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
    }

    public static class Person {
        String name;
        int age;
        int weight;
        int money;
    }
}