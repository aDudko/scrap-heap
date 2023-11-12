package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;
    public static int N = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < N; i++) {
            String index = strings[i];
            for (int j = i + 1; j < N; j++) {
                if (strings[j] != null && strings[j].equals(index)) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
