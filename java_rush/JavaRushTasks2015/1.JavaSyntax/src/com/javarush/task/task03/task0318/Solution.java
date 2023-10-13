package com.javarush.task.task03.task0318;

import java.io.*;

/*
План по захвату мира
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.

Требования:
1.Программа должна выводить текст.
2.Программа должна считывать данные с клавиатуры.
3.Выведенный текст должен содержать введенное имя.
4.Выведенный текст должен содержать введенное число.
5.Выведенный тест должен полностью соответствовать заданию.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer age = Integer.parseInt(reader.readLine());
        String name = reader.readLine();
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}