package com.javarush.task.task03.task0311;

/* 
Печатаем строки
Реализуй метод public static void writeToConsole(String s), который добавляет к началу строки выражение «printing: »
и выводит измененную строку на экран.

Пример вывода для «Hello world!»:
printing: Hello world!

Требования:
1.Добавь метод writeToConsole, у которого аргумент имеет тип String.
2.Метод writeToConsole должен быть void.
3.Метод writeToConsole должен быть static.
4.Метод writeToConsole должен быть public.
5.Метод writeToConsole должен добавлять к началу строки "printing: " и выводить полученный результат на экран.
6.Программа должна вывести "printing: Hello world!".
*/

public class Solution {
    public static void main(String[] args) {
        writeToConsole("Hello world!");
    }

    public static void writeToConsole(String s) {
        System.out.println("printing: " + s);
    }
}