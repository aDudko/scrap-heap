package com.leetcode.task.easy.number_of_steps_to_reduce_a_number_to_zero;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));  // 6
        System.out.println(numberOfSteps(8));   // 4
        System.out.println(numberOfSteps(123)); // 12
    }

    public static int numberOfSteps(int num) {
        if (num == 0) return num;
        return 1 + (num % 2 == 0 ? numberOfSteps(num / 2) : numberOfSteps(num -1));
    }
}