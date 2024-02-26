package com.leetcode.task.easy.merge_sorted_array;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);   // [1, 2, 2, 3, 5, 6]
        merge(new int[]{1}, 1, new int[]{}, 0);     // [1]
        merge(new int[]{0}, 0, new int[]{1}, 1);    // [1]
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m + n - 1, j = m - 1, k = n - 1; k >= 0; i--) {
            if (j >= 0 && nums1[j] > nums2[k]) nums1[i] = nums1[j--];
            else nums1[i] = nums2[k--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}