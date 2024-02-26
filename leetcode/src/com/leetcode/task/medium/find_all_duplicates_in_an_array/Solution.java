package com.leetcode.task.medium.find_all_duplicates_in_an_array;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));  // [2,3]
        System.out.println(findDuplicates(new int[]{1, 1, 2}));                 // [1]
        System.out.println(findDuplicates(new int[]{1}));                       // []
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int position = Math.abs(nums[i]) - 1;
            if (nums[position] < 0) {
                result.add(position + 1);
            }
            nums[position] = -nums[position];
        }
        return result;
    }
}