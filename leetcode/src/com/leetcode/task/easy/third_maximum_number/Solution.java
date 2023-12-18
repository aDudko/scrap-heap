package com.leetcode.task.easy.third_maximum_number;

import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{3,2,1}));     // 1
        System.out.println(thirdMax(new int[]{1,2}));       // 2
        System.out.println(thirdMax(new int[]{1,1,1,2,2})); // 2
        System.out.println(thirdMax(new int[]{2,2,3,1}));   // 1
        System.out.println(thirdMax(new int[]{2,3,2,1}));   // 1
    }

    public static int thirdMax(int[] nums) {
        int k = 3;
        TreeSet<Integer> ns = new TreeSet<>();
        for (int num : nums) {
            ns.add(num);
        }
        if (ns.size() < k) return ns.last();
        while (--k > 0) {
            ns.pollLast();
        }
        return ns.last();
    }
}
