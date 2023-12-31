package com.javarush.task.task03.task0302;

/* 
Немедленно в печать
Добавь метод public static void printString(String s), который будет выводить переданную строку на экран.

Требования:
1.Добавь метод printString, у которого аргумент имеет тип String.
2.Метод printString должен быть void.
3.Метод printString должен быть static.
4.Метод printString должен быть public.
5.Метод printString должен выводить переданный текст на экран.
6.Программа должна вывести «Hello Amigo!».
*/

public class Solution {
    public static void main(String[] args) {
        printString("Hello Amigo!");
    }

    public static void printString(String s) {
        System.out.println(s);
    }
}