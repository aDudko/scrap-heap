package com.leetcode.task.easy.consecutive_characters;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxPower("leetcode"));            // 2
        System.out.println(maxPower("abbcccddddeeeeedcba")); // 5
        System.out.println(maxPower("abc"));                 // 1
    }

    public static int maxPower(String s) {
        char[] charArray = s.toCharArray();
        int maxCount = 1;
        int tempCount = 1;
        for (int i = 1; i < charArray.length; i++) {
            tempCount = charArray[i - 1] == charArray[i] ? tempCount + 1 : 1;
            maxCount = Math.max(maxCount, tempCount);
        }
        return maxCount;
    }
}