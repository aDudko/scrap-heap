package com.leetcode.task.easy.keyboard_row;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    private static final Set<Character> row1 = toSet("qwertyuiopQWERTYUIOP");
    private static final Set<Character> row2 = toSet("asdfghjklASDFGHJKL");
    private static final Set<Character> row3 = toSet("zxcvbnmZXCVBNM");

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}))); // ["Alaska","Dad"]
        System.out.println(Arrays.toString(findWords(new String[]{"omk"})));                             // []
        System.out.println(Arrays.toString(findWords(new String[]{"adsdf", "sfd"})));                    // ["adsdf","sfd"]
    }

    public static String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (check(word)) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    private static Set<Character> toSet(String s) {
        return s.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
    }

    private static boolean check(String word) {
        Set<Character> wordSet = toSet(word);
        return row1.containsAll(wordSet) || row2.containsAll(wordSet) || row3.containsAll(wordSet);
    }
}