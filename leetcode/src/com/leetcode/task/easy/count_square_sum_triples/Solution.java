package com.leetcode.task.easy.count_square_sum_triples;

public class Solution {
    public static void main(String[] args) {
        System.out.println(countTriples(5));    // 2
        System.out.println(countTriples(10));   // 4
        System.out.println(countTriples(250));  // 330
    }

    public static int countTriples(int n) {
        int count = 0;
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                if (c % 1 == 0 && c <= n) {   // sqrt % 1 == 0 - check if a number is an integer
                    count++;
                }
            }
        }
        return count;
    }
}