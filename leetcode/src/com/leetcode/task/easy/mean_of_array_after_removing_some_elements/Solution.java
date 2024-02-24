package com.leetcode.task.easy.mean_of_array_after_removing_some_elements;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(trimMean(new int[]{1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3}));   // 2.00000
        System.out.println(trimMean(new int[]{6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0}));  // 4.00000
        System.out.println(trimMean(new int[]{6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,
                1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4}));                                 // 4.77778
    }

    public static double trimMean(int[] arr) {
        int len = (int) (arr.length * 0.05);
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        for (int i = len; i < arr.length - len; i++) {
            sum += arr[i];
            count++;
        }
        return (double) sum / count;
    }
}
