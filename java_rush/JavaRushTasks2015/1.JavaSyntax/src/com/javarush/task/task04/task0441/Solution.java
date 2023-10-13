package com.javarush.task.task04.task0441;

import java.io.*;

/*
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вивести любое из них.

Требования:
1.Программа должна считывать числа c клавиатуры.
2.Программа должна выводить число на экран.
3.Программа должна выводить среднее из трех чисел.
4.Если все числа равны, вывести любое из них.
5.Если два числа из трех равны, вывести любое из двух.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b && b == c) {
            System.out.println(a);
        } else if (a > b && a > c) {
            if (b > c) System.out.println(b);
            else System.out.println(c);
        } else if (b > a && b > c) {
            if (a > c) System.out.println(a);
            else System.out.println(c);
        } else if (c > a && c > b) {
            if (a > b) System.out.println(a);
            else System.out.println(b);
        }
    }
}