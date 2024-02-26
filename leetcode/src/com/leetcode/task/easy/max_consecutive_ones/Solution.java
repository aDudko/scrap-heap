package com.leetcode.task.easy.max_consecutive_ones;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));  // 3
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));  // 2
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, tempCount = 0;
        for (int num : nums) {
            tempCount = num != 0 ? tempCount + 1 : 0;
            maxCount = Math.max(maxCount, tempCount);
        }
        return maxCount;
    }
}