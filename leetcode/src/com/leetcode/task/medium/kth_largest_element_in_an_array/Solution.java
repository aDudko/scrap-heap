package com.leetcode.task.medium.kth_largest_element_in_an_array;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));             // 5
        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));    // 4
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            pq.add(num);
        }
        while (--k > 0) {
            pq.poll();
        }
        return pq.peek();
    }

//    public static int findKthLargest(int[] nums, int k) {
//        int max = nums[0], index = 0;
//        for (int i = 1; i < k; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[j] > max) {
//                    max = nums[j];
//                    index = j;
//                }
//            }
//            nums[index] = Integer.MIN_VALUE;
//            max = Integer.MIN_VALUE;
//        }
//        return Arrays.stream(nums).max().getAsInt();
//    }
}