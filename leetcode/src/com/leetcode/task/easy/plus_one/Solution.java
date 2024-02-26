package com.leetcode.task.easy.plus_one;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));       // [1, 2, 4]
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));    // [4, 3, 2, 2]
        System.out.println(Arrays.toString(plusOne(new int[]{9})));             // [1, 0]
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}