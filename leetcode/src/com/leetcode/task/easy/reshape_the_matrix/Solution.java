package com.leetcode.task.easy.reshape_the_matrix;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] ints1 = {1, 2};
        int[] ints2 = {3, 4};
        System.out.println(Arrays.deepToString(
                matrixReshape(new int[][]{ints1, ints2}, 1, 4)
        ));   // [[1, 2, 3, 4]]
        System.out.println(Arrays.deepToString(
                matrixReshape(new int[][]{ints1, ints2}, 2, 4)
        ));   // [[1, 2], [3, 4]]
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        int n = 0;
        int m = 0;
        if (mat.length * mat[0].length == r * c) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (m == c) {
                        n++;
                        m = 0;
                    }
                    result[n][m] = mat[i][j];
                    m++;
                }
            }
            return result;
        }
        return mat;
    }
}