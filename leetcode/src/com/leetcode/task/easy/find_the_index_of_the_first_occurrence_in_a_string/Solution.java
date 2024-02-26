package com.leetcode.task.easy.find_the_index_of_the_first_occurrence_in_a_string;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));     // 0
        System.out.println(strStr("leetcode", "leeto"));    // -1
        System.out.println(strStr("tmamamat", "mama"));     // -1
    }

    public static int strStr(String haystack, String needle) {
        /**
         * Included funktion - Find only first index
         * */
//        return haystack.indexOf(needle);

        /**
         * Knuth-Morris-Pratt pattern matcher - Find all indexes
         * */
        int[] indexes = indexesOf(haystack.toCharArray(), needle.toCharArray());
        if (indexes.length > 0) return indexes[0];
        return -1;
    }

    private static int[] indexesOf(char[] text, char[] pattern) {
        int[] pfl = pfl(pattern);
        int[] indexes = new int[text.length];
        int size = 0;
        int k = 0;
        for (int i = 0; i < text.length; ++i) {
            while (pattern[k] != text[i] && k > 0) {
                k = pfl[k - 1];
            }
            if (pattern[k] == text[i]) {
                k = k + 1;
                if (k == pattern.length) {
                    indexes[size] = i + 1 - k;
                    size += 1;
                    k = pfl[k - 1];
                }
            } else {
                k = 0;
            }
        }
        return Arrays.copyOfRange(indexes, 0, size);
    }

    private static int[] pfl(char[] text) {
        int[] pfl = new int[text.length];
        pfl[0] = 0;
        for (int i = 1; i < text.length; ++i) {
            int k = pfl[i - 1];
            while (text[k] != text[i] && k > 0) {
                k = pfl[k - 1];
            }
            if (text[k] == text[i]) {
                pfl[i] = k + 1;
            } else {
                pfl[i] = 0;
            }
        }
        return pfl;
    }
}