package com.leetcode.task.medium.range_sum_query_2d_immutable;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        NumMatrix numMatrix = new NumMatrix(new int[][]{
                {3, 0, 4, 1, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        });
        System.out.println(numMatrix.sumRegion(2, 1, 4, 3)); //  8
        System.out.println(numMatrix.sumRegion(1, 1, 2, 2)); // 11
        System.out.println(numMatrix.sumRegion(1, 2, 2, 4)); // 12
    }

    static class NumMatrix {
        private final int[][] matrix;

        public NumMatrix(int[][] matrix) {
            this.matrix = matrix;
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int sum = 0;
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    sum += this.matrix[i][j];
                }
            }
            return sum;
        }

        private void printMatrix(int[][] matrix) {
            for (int[] ints : matrix) {
                System.out.println(Arrays.toString(ints));
            }
        }
    }
}
