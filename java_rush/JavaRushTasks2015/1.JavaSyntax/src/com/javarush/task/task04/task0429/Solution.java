package com.javarush.task.task04.task0429;

import java.io.*;

/*
Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
«количество отрицательных чисел: а», «количество положительных чисел: б»,
где а, б — искомые значения.

Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3

Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1

Требования:
1.Программа должна считывать числа c клавиатуры.
2.Программа должна выводить текст на экран.
3.Программа должна выводить количество отрицательных чисел в исходном наборе.
4.Программа должна выводить количество положительных чисел в исходном наборе.
5.Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
6.Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
7.Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countP = 0;
        int countM = 0;
        for (int i = 0; i < 3; i++) {
            int tmp = Integer.parseInt(reader.readLine());
            if (tmp > 0) countP ++;
            else if (tmp < 0) countM ++;
        }

        System.out.println("количество отрицательных чисел: " + countM);
        System.out.println("количество положительных чисел: " + countP);
    }
}