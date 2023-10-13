package com.javarush.task.task04.task0442;

import java.io.*;

/*
Суммирование
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.

Требования:
1.Программа должна считывать числа c клавиатуры.
2.Программа должна выводить число на экран.
3.Программа должна посчитать сумму введенных чисел. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
4.В программе должен использоваться цикл for или цикл while.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            int i = Integer.parseInt(reader.readLine());
            sum += i;
            if (i == -1) break;
        }
        System.out.println(sum);
    }
}