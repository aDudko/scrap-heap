package com.javarush.task.task04.task0427;

import java.io.*;

/*
Описываем числа
Ввести с клавиатуры целое число в диапазоне 1 — 999. Вывести его строку-описание следующего вида:
«четное однозначное число» — если число четное и имеет одну цифру,
«нечетное однозначное число» — если число нечетное и имеет одну цифру,
«четное двузначное число» — если число четное и имеет две цифры,
«нечетное двузначное число» — если число нечетное и имеет две цифры,
«четное трехзначное число» — если число четное и имеет три цифры,
«нечетное трехзначное число» — если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 — 999, в таком случае ничего не выводить на экран.

Пример для числа 100:
четное трехзначное число

Пример для числа 51:
нечетное двузначное число

Требования:
1.Программа должна считывать одно число c клавиатуры.
2.Программа должна использовать команду System.out.println() или System.out.print().
3.Если число четное и имеет одну цифру, вывести "четное однозначное число".
4.Если число нечетное и имеет одну цифру, вывести "нечетное однозначное число".
5.Если число четное и имеет две цифры, вывести "четное двузначное число".
6.Если число нечетное и имеет две цифры, вывести "нечетное двузначное число".
7.Если число четное и имеет три цифры, вывести "четное трехзначное число".
8.Если число нечетное и имеет три цифры, вывести "нечетное трехзначное число".
9.Если введенное число не попадает в диапазон 1 - 999, ничего не выводить на экран
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a < 1 || a > 999) return;

        if (parity(a)) {
            System.out.println("четное " + accuracy(a));
        } else {
            System.out.println("нечетное " + accuracy(a));
        }
    }

    private static boolean parity(int a) {
        return a % 2 == 0;
    }

    private static String accuracy(int a) {
        if (a < 10) {
            return "однозначное число";
        } else if ((a / 10) < 10) {
            return "двузначное число";
        } else {
            return "трехзначное число";
        }
    }
}