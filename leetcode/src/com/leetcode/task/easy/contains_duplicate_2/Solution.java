package com.leetcode.task.easy.contains_duplicate_2;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1}, 3));     // true
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1}, 1));     // true
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2)); // false
        System.out.println(containsNearbyDuplicate(new int[]{99,99}, 2));       // true
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                if(i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}