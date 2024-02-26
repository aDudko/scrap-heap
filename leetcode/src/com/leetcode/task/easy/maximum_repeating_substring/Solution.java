package com.leetcode.task.easy.maximum_repeating_substring;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxRepeating("ababc", "ab"));  // 2
        System.out.println(maxRepeating("ababc", "ba"));  // 1
        System.out.println(maxRepeating("ababc", "ac"));  // 0
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));  // 5
    }

    public static int maxRepeating(String sequence, String word) {
        int result = 0;
        StringBuilder temp = new StringBuilder(word);
        while (sequence.contains(temp)) {
            result++;
            temp.append(word);
        }
        return result;
    }

//    public int maxRepeating(String sequence, String word) {
//        int result = 0;
//        String temp = word;
//        while (sequence.contains(temp)) {
//            result++;
//            temp += word;
//        }
//        return result;
//    }
}