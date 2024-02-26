package com.leetcode.task.easy.repeated_substring_pattern;

public class Solution {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));           // true
        System.out.println(repeatedSubstringPattern("aba"));            // false
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));   // true
        System.out.println(repeatedSubstringPattern("bb"));             // true
    }

    public static boolean repeatedSubstringPattern(String str) {
        int len = str.length();
        for (int i = len / 2; i > 0; i--) {
            if (len % i == 0 && str.charAt(i - 1) == str.charAt(len - 1)) {
                String subStr = str.substring(0, i);
                int repeat = len / i;
                if (subStr.repeat(repeat).equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

//    public static boolean repeatedSubstringPattern(String s) {
//        if (s.length() == 2 && s.getBytes()[0] == s.getBytes()[1]) return true;
//        for (Integer len : primeFactors(s.length())) {
//            int count = s.length() / len;
//            StringBuilder test = new StringBuilder();
//            for (int i = 0; i < count; i++) {
//                test.append(s.substring(len));
//            }
//            if (s.contentEquals(test)) return true;
//        }
//        return false;
//    }
//
//    private static Set<Integer> primeFactors(int n) {
//        Set<Integer> result = new HashSet<>();
//        int a = 2;
//        while (a <= n) {
//            if ((n % a) == 0) {
//                if (a != n) {
//                    result.add(a);
//                    primeFactors(n / a);
//                } else {
//                    result.add(a);
//                }
//            }
//            a++;
//        }
//        return result;
//    }
}