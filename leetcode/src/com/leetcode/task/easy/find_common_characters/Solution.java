package com.leetcode.task.easy.find_common_characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"bella","label","roller"})); // ["e","l","l"]
        System.out.println(commonChars(new String[]{"cool","lock","cook"}));     // ["c","o"]
        System.out.println(commonChars(new String[]{"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"})); // []
    }

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : words[0].toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (String word : words) {
            Map<Character, Integer> temp = new HashMap<>();
            for (char c : word.toCharArray()) {
                temp.put(c, temp.getOrDefault(c, 0) + 1);
            }
            map.keySet().retainAll(temp.keySet());
            for (Character c : map.keySet()) {
                if (!Objects.equals(map.get(c), temp.get(c)))
                    map.put(c, Math.min(map.get(c), temp.get(c)));
            }
        }

        for (Character c : map.keySet()) {
            if (map.get(c) != 1) {
                for (int i = 0; i < map.get(c) - 1; i++) {
                    result.add(String.valueOf(c));
                }
            }
            result.add(String.valueOf(c));
        }

        return result;
    }
}
