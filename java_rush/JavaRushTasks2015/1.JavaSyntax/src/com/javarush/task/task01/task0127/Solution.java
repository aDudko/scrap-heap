package com.javarush.task.task01.task0127;

/* 
Число в квадрате
Напиши программу, которая выводит на экран квадрат числа 5.

Требования:
1.Программа должна выводить текст.
2.Метод main должен вызывать метод sqr с параметром 5.
3.Метод main должен выводить результат метода sqr.
4.Метод sqr изменять нельзя.
5.Выводимый текст должен соответствовать заданию.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sqr(5));
    }

    public static int sqr(int a) {
        return a * a;
    }
}