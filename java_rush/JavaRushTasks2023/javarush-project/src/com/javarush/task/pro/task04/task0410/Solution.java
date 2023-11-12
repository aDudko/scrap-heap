package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min1 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int temp = Math.max(min1, min2);
        min1 = Math.min(min1, min2);
        min2 = temp;
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (min1 == min2) {
                min2 = n;
            } else if (n < Math.min(min1, min2)) {
                min2 = Math.min(min1, min2);
                min1 = n;
            } else if (min1 < n && n < min2) {
                min2 = n;
            }
        }
        System.out.println(Math.max(min1, min2));
    }
}