package com.javarush.task.task04.task0412;

import java.io.*;

/*
Положительное и отрицательное число
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.

Требования:
1.Программа должна считывать число c клавиатуры.
2.Программа должна выводить число на экран.
3.Если введенное число положительное, необходимо увеличить его в два раза и вывести.
4.Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
5.Если введенное число равно нулю, необходимо вывести ноль.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        if (n > 0) {
            System.out.println(n * 2);
        } else if (n == 0) {
            System.out.println();
        } else {
            System.out.println(n + 1);
        }
    }
}