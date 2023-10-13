package com.javarush.task.task04.task0428;

import java.io.*;

/*
Положительное число
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.

Пример для чисел -4 6 6:
2

Пример для чисел -6 -6 -3:
0

Требования:
1.Программа должна считывать числа c клавиатуры.
2.Программа должна выводить число на экран.
3.Программа должна выводить количество положительных чисел в исходном наборе.
4.Если положительных чисел нет, программа должна вывести "0".
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (int i = 0; i < 3; i++) {
            int tmp = Integer.parseInt(reader.readLine());
            if (tmp > 0) count++;
        }
        System.out.println(count);
    }
}