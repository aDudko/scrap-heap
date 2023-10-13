package com.leetcode.task.easy.search_insert_position;

public class Solution {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int ans = 0;
        while (start <= end){
            int mid = (start + end)/2;
            if (nums[mid] < target){
                start = ans = mid + 1;
            }
            else if (nums[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return ans;
    }
}
