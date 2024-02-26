package com.leetcode.task.easy.find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1})); // [5,6]
        System.out.println(findDisappearedNumbers(new int[]{1,1}));             // [2]
        System.out.println(findDisappearedNumbers(new int[]{1,2}));             // [3]
        System.out.println(findDisappearedNumbers(new int[]{1,7}));             // [2,3,4,5,6]
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }

//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> result = new ArrayList<>();
//        int N = Arrays.stream(nums).max().getAsInt();
//        int[] temp = new int[N + 1];
//        for (int num : nums) {
//            temp[num] = num;
//        }
//        for (int i = 1; i < temp.length; i++) {
//            if (temp[i] == 0) {
//                result.add(i);
//            }
//        }
//        if (result.isEmpty()) {
//            result.add(N + 1);
//        }
//        return result;
//    }
}