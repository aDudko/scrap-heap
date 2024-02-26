package com.leetcode.task.easy.move_zeroes;

public class Solution {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});  // [1, 3, 12, 0, 0]
        moveZeroes(new int[]{0});               // [0]
    }

    public static void moveZeroes(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
//        System.out.println(Arrays.toString(nums));
    }
}