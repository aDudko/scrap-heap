package com.leetcode.task.medium.top_k_frequent_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));  // [1,2]
        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));                 // [1]
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        int count;
        for (int num : nums) {
            count = map.containsKey(num) ? map.get(num) + 1 : 1;
            map.put(num, count);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((i, j) -> map.get(j) - map.get(i));
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
