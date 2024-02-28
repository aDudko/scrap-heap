package com.leetcode.task.medium.repeated_string_match;

public class Solution {
    public static void main(String[] args) {
        System.out.println(repeatedStringMatch("abcd", "cdabcdab"));    // 3
        System.out.println(repeatedStringMatch("a", "aa"));             // 2

    }

    public static int repeatedStringMatch(String a, String b) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        if (sb.indexOf(b) != -1) {
            return count;
        } else {
            sb.append(a);
            count++;
            if (sb.indexOf(b) != -1) {
                return count;
            }
        }
        return -1;
    }
}