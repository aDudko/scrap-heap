package com.leetcode.task.easy.neither_minimum_nor_maximum;

import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findNonMinOrMax(new int[]{3, 2, 1, 4})); // 2 or 3
        System.out.println(findNonMinOrMax(new int[]{1, 2}));       // -1
        System.out.println(findNonMinOrMax(new int[]{2, 1, 3}));    // 2
    }

    public static int findNonMinOrMax(int[] nums) {
        TreeSet<Integer> ns = new TreeSet<>();
        for (int num : nums) {
            ns.add(num);
        }
        if (ns.size() < 3) return -1;
        ns.pollLast();
        return ns.last();
    }
}