package com.leetcode.task.easy.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));              // true
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));              // false
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));  // true
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return nums.length != set.size();
    }
}
