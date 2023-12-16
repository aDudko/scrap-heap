package com.leetcode.task.medium.majority_element_2;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));      // 3
        System.out.println(majorityElement(new int[]{1}));          // 1
        System.out.println(majorityElement(new int[]{1,2}));        // 1, 2
        System.out.println(majorityElement(new int[]{1,2,2,3,3}));  // 2, 3
        System.out.println(majorityElement(new int[]{2,2}));        // 2
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int count;
        for (int num : nums) {
            count = map.containsKey(num) ? map.get(num) + 1 : 1;
            map.put(num, count);
            if (count == (nums.length / 3) + 1) {
                result.add(num);
            }
        }
        return result;
    }
}
