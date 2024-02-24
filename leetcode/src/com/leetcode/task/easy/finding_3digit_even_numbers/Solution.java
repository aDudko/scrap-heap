package com.leetcode.task.easy.finding_3digit_even_numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findEvenNumbers(new int[]{2, 1, 3, 0})));     // [102, 120, 130, 132, 210, 230, 302, 310, 312, 320]
        System.out.println(Arrays.toString(findEvenNumbers(new int[]{2, 2, 8, 8, 2})));  // [222, 228, 282, 288, 822, 828, 882]
        System.out.println(Arrays.toString(findEvenNumbers(new int[]{3, 7, 5})));        // []
    }

    public static int[] findEvenNumbers(int[] digits) {
        int len = digits.length;
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if (digits[i] != 0) {
                for (int j = 0; j < len; j++) {
                    if (i != j) {
                        for (int k = 0; k < len; k++) {
                            if (i != k && j != k && digits[k] % 2 == 0) {
                                result.add(digits[i] * 100 + digits[j] * 10 + digits[k]);
                            }
                        }
                    }
                }
            }
        }
        return result.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
