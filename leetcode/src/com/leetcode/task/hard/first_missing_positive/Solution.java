package com.leetcode.task.hard.first_missing_positive;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1,2,0}));       // 3
        System.out.println(firstMissingPositive(new int[]{3,4,-1,1}));    // 2
        System.out.println(firstMissingPositive(new int[]{7,8,9,11,12})); // 1
    }

    public static int firstMissingPositive(int[] nums) {
        nums = Arrays.stream(nums).filter(n -> n > 0).sorted().distinct().toArray();
        if (nums.length == 0 || nums[0] != 1) {
            return 1;
        }
        int N = nums.length - 1;
        for (int i = 0; i < N; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
        }
        return nums[N] + 1;
    }

//    public static int firstMissingPositive(int[] nums) {
//        int N = Arrays.stream(nums).max().getAsInt();
//        int[] temp = new int[N + 1];
//        for (int num : nums) {
//            if (num > 0) {
//                temp[num] = num;
//            }
//        }
//        for (int i = 1; i < temp.length; i++) {
//            if (temp[i] == 0) return i;
//        }
//        return temp.length;
//    }
}
