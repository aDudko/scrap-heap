package com.javarush.task.task03.task0319;

import java.io.*;

/*
Предсказание на будущее
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
«Имя» получает «число1» через «число2» лет.

Пример:
Коля получает 3000 через 5 лет.

Требования:
1.Программа должна выводить текст.
2.Программа должна считывать данные с клавиатуры.
3.Выведенный текст должен содержать введенное имя.
4.Выведенный текст должен содержать введенное число1.
5.Выведенный текст должен содержать введенное число2.
6.Выведенный тест должен полностью соответствовать заданию.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int zp = Integer.parseInt(reader.readLine());
        int year = Integer.parseInt(reader.readLine());
        System.out.println(name + " получает " + zp + " через " + year + " лет.");
    }
}