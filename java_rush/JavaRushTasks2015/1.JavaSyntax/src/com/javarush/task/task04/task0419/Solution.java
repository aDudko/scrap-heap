package com.javarush.task.task04.task0419;

import java.io.*;

/*
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.

Требования:
1.Программа должна считывать числа c клавиатуры.
2.Программа должна выводить число на экран.
3.Программа должна выводить на экран максимальное из четырёх чисел.
4.Если числа равны между собой, необходимо вывести любое.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        System.out.println(max(max(a, b), max(c, d)));
    }

    public static int max(int a, int b) {
        return a >= b ? a : b;
    }
}