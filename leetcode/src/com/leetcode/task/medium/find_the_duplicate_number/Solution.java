package com.leetcode.task.medium.find_the_duplicate_number;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1, 3, 4, 2, 2})); // 2
        System.out.println(findDuplicate(new int[]{3, 1, 3, 4, 2})); // 3
        System.out.println(findDuplicate(new int[]{2, 2, 2, 2, 2})); // 2
        System.out.println(findDuplicate(new int[]{2, 5, 9, 6, 9, 3, 8, 9, 7, 1})); // 9
    }

    public static int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = nums[0];
        do {
            fast = nums[nums[fast]];
            slow = nums[slow];
        } while (fast != slow);
        slow = nums[0];
        while (fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
    }
}