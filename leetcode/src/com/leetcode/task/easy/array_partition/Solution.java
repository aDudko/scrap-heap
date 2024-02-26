package com.leetcode.task.easy.array_partition;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{1, 4, 3, 2}));        // 4
        System.out.println(arrayPairSum(new int[]{6, 2, 6, 5, 1, 2}));  // 9
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            result += nums[i];
        }
        return result;
    }
}