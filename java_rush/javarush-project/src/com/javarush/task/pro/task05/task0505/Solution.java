package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 0) {
            int[] array = new int[N];
            if (N % 2 != 0) {
                for (int i = 0; i < N; i++) {
                    array[i] = scanner.nextInt();
                }
            } else {
                for (int i = N-1; i >= 0; i--) {
                    array[i] = scanner.nextInt();
                }
            }

            for (int i = 0; i < N; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
