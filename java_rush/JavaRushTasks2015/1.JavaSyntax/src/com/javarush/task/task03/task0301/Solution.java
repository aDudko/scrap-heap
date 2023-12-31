package com.javarush.task.task03.task0301;

/* 
Делиться полезно
Реализуй метод public static void div(int a, int b).
Метод должен делить первое число на второе, и выводить на экран результат деления а на b.
На экран должно быть выведено целое число.

Требования:
1.Функция div должна делить а на b.
2.Функция div должна выводить результат деления на экран.
3.Функция main должна вызывать функцию div 3 раза.
4.Функция main не должна вызывать команду вывода текста на экран.
5.Программа должна вывести три числа: 2 1 0.
*/

public class Solution {
    public static void main(String[] args) {
        div(6, 3);
        div(10, 6);
        div(2, 4);
    }

    public static void div(int a, int b) {
        System.out.println(a / b);
    }
}