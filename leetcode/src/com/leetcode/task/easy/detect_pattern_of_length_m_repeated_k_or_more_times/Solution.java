package com.leetcode.task.easy.detect_pattern_of_length_m_repeated_k_or_more_times;


public class Solution {
    public static void main(String[] args) {
        System.out.println(containsPattern(new int[]{1, 2, 4, 4, 4, 4}, 1, 3));      // true
        System.out.println(containsPattern(new int[]{1, 2, 1, 2, 1, 1, 1, 3}, 2, 2));  // true
        System.out.println(containsPattern(new int[]{1, 2, 1, 2, 1, 3}, 2, 3));      // false
    }

    // two-pointer
    public static boolean containsPattern(int[] arr, int length, int repeat) {
        /* The key here is that the sequence must be repeated in a row. That is, in the first step we check
         * the first element of the first and second sequences. At step m+1, the first element of the second
         * and third sequence is checked, etc. up to the k-th sequence
         * */
        var count = 0;
        for (int i = 0, j = i + length; j < arr.length; i++, j++) {
            if (arr[i] != arr[j]) {
                count = 0;
            } else if (++count == (repeat - 1) * length) {
                /* length of the whole sequence is repeat * length, but we do (repeat - 1)
                 * as we don't take into account the first entry of a pattern
                 * */
                return true;
            }
        }
        return false;
    }
}
