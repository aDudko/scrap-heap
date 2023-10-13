package com.javarush.task.task03.task0320;

import java.io.*;

/*
Скромность украшает программиста
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!

Пример:
Тимур зарабатывает $5,000. Ха-ха-ха!

Требования:
1.Программа должна выводить текст.
2.Программа должна считывать данные с клавиатуры.
3.Выведенный текст должен содержать введенное имя.
4.Выведенный тест должен полностью соответствовать заданию.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(reader.readLine() + " зарабатывает $5,000. Ха-ха-ха!");
    }
}