package com.leetcode.task.easy.make_array_zero_by_subtracting_equal_amounts;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1, 5, 0, 3, 5}));    // 3
        System.out.println(minimumOperations(new int[]{0}));                // 0
    }

    // The count of unique elements is equal to the count of operations
    public static int minimumOperations(int[] nums) {
        return (int) Arrays.stream(nums).filter(i -> i != 0).distinct().count();
    }

//    public static int minimumOperations(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            if (num != 0) {
//                set.add(num);
//            }
//        }
//        return set.size();
//    }
}