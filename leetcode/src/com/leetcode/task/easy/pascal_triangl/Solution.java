package com.leetcode.task.easy.pascal_triangl;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(generate(5));    // [[1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1]]
        System.out.println(generate(1));    // [[1]]
    }

    public static List<List<Integer>> generate(int numRows) {
        var row = new ArrayList<>(List.of(1));
        List<List<Integer>> result = new ArrayList<>(List.of(row));
        if (numRows == 1) return result;
        row = new ArrayList<>(List.of(1, 1));
        result.add(row);
        for (var i = 2; i < numRows; i++) {
            var newRow = new ArrayList<>(List.of(1));
            for (var j = 0; j + 1 < row.size(); j++) {
                newRow.add(row.get(j) + row.get(j + 1));
            }
            newRow.add(1);
            result.add(newRow);
            row = newRow;
        }
        return result;
    }
}