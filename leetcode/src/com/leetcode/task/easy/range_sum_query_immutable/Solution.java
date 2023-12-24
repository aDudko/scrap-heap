package com.leetcode.task.easy.range_sum_query_immutable;

public class Solution {
    public static void main(String[] args) {
        NumArray obj = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(obj.sumRange(0, 2)); // 1
        System.out.println(obj.sumRange(2, 5)); // -1
        System.out.println(obj.sumRange(0, 5)); // -3
    }

    static class NumArray {
        private final int[] nums;

        public NumArray(int[] nums) {
            this.nums = new int[nums.length];
            System.arraycopy(nums, 0, this.nums, 0, nums.length);
        }

        public int sumRange(int left, int right) {
            int sum = 0;
            for (int i = left; i < right + 1; i++) {
                sum += this.nums[i];
            }
            return sum;
        }
    }
}
