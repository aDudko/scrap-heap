package com.leetcode.task.easy.majority_element;

public class Solution {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

//    O(1)
    public static int majorityElement(int[] nums) {
        int result = nums[0];
        int count = 1;
        for (int num : nums) {
            if (num == result) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                result = num;
            }
        }
        return result;
    }

//    O(n)
//    public static int majorityElement(int[] nums) {
//        int times = Math.round((float)nums.length / 2);
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                    if (count == times) return nums[i];
//                }
//            }
//        }
//        return -1;
//    }
}
