package com.leetcode.task.hard.median_of_two_sorted_arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2}));   // 2
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4})); // 2,5
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;
        int[] mergedArrays = mergeArrays(nums1, nums2);
        int medianIndex = mergedArrays.length / 2;
        if (mergedArrays.length % 2 == 0) {
            result = (mergedArrays[medianIndex - 1] + mergedArrays[medianIndex]) / 2.0;
        } else {
            result = mergedArrays[medianIndex];
        }
        return result;
    }

    private static int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int i = 0, j = 0, r = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[r] = nums1[i];
                i++;
            } else {
                result[r] = nums2[j];
                j++;
            }
            r++;
        }
        if (i < nums1.length) {
            System.arraycopy(nums1, i, result, r, (nums1.length - i));
        }
        if (j < nums2.length) {
            System.arraycopy(nums2, j, result, r, (nums2.length - j));
        }
        return result;
    }
}
