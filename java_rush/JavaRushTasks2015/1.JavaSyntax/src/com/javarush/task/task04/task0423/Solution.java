package com.javarush.task.task04.task0423;

import java.io.*;

/*
Фейс-контроль
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».

Требования:
1.Программа должна считывать строки c клавиатуры.
2.Программа должна использовать команду System.out.println() или System.out.print().
3.Если возраст больше 20 вывести сообщение "И 18-ти достаточно".
4.Если возраст меньше либо равно 20 ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}