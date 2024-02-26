package com.leetcode.task.easy.most_frequent_even_element;

public class Solution {
    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[]{0, 1, 2, 2, 4, 4, 1}));           // 2
        System.out.println(mostFrequentEven(new int[]{4, 4, 4, 9, 2, 4}));              // 4
        System.out.println(mostFrequentEven(new int[]{29, 47, 21, 41, 13, 37, 25, 7})); // -1
    }

    public static int mostFrequentEven(int[] nums) {
        int countMax = 0;
        int count = 0;
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == nums[i]) count++;
                }
                if (count > countMax) {
                    countMax = count;
                    temp = nums[i];
                } else if (count == countMax && temp > nums[i]) {
                    temp = nums[i];
                }
                count = 0;
            }
        }
        return temp == Integer.MAX_VALUE ? -1 : temp;
    }
}