package com.leetcode.task.easy.missing_number;

public class Solution {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));                // 2
        System.out.println(missingNumber(new int[]{0,1}));                  // 2
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));    // 8
    }

    public static int missingNumber(int[] nums) {
        int N = nums.length;
        int sum = N * (N + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}
