package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int number = scanner.nextInt();
        int start = 1;
        do {
            System.out.println(str);
            start++;
        } while (start <= number && number < 5);
    }
}