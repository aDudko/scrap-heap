package com.leetcode.task.easy.find_numbers_with_even_number_of_digits;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12, 345, 2, 6, 7896}));    // 2
        System.out.println(findNumbers(new int[]{555, 901, 482, 1771}));    // 1
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int value : nums) {
            count += ((int) Math.log10(value) + 1) % 2 == 0 ? 1 : 0;
        }
        return count;
    }
}