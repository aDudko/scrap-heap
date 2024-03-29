package com.leetcode.task.easy.running_sum_of_1d_array;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));     // [1, 3, 6, 10]
        System.out.println(Arrays.toString(runningSum(new int[]{1, 1, 1, 1, 1})));  // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(runningSum(new int[]{3, 1, 2, 10, 1}))); // [3, 4, 6, 16, 17]
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}