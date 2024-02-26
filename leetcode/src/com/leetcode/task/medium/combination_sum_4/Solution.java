package com.leetcode.task.medium.combination_sum_4;

public class Solution {
    public static void main(String[] args) {
        System.out.println(combinationSum4(new int[]{1, 2, 3}, 4)); // 7
        System.out.println(combinationSum4(new int[]{9}, 3));       // 0
    }

    public static int combinationSum4(int[] nums, int target) {
        int[] result = new int[target + 1];
        result[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                result[i] += i - num >= 0 ? result[i - num] : 0;
            }
        }
        return result[target];
    }
}