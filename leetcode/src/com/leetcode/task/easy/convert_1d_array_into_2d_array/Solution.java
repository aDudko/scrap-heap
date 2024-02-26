package com.leetcode.task.easy.convert_1d_array_into_2d_array;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3, 4}, 2, 2))); // [[1, 2], [3, 4]]
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3}, 1, 3)));    // [[1, 2, 3]]
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2}, 1, 1)));       // []
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if ((m * n < original.length) || (original.length < m * n)) return new int[][]{};
        int[][] result = new int[m][n];
        int j = 0;
        int k = 0;
        for (int value : original) {
            result[j][k++] = value;
            if (k == n) {
                j++;
                k = 0;
            }
        }
        return result;
    }
}