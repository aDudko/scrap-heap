package com.leetcode.task.easy.pascal_triangl_2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getRow(7));
    }

//    public static List<Integer> getRow(int rowIndex) {
//        var row = new ArrayList<>(List.of(1));
//        List<List<Integer>> triangle = new ArrayList<>(List.of(row));
//
//        row = new ArrayList<>(List.of(1, 1));
//        triangle.add(row);
//        if (rowIndex == 1) return triangle.get(rowIndex);
//
//        for (var i = 2; i < rowIndex + 1; i++) {
//            var newRow = new ArrayList<>(List.of(1));
//
//            for (var j = 0; j + 1 < row.size(); j++) {
//                newRow.add(row.get(j) + row.get(j + 1));
//            }
//
//            newRow.add(1);
//            triangle.add(newRow);
//            row = newRow;
//        }
//        return triangle.get(rowIndex);
//    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        int num = 0;

        for (int i = 1; i <= rowIndex; i++) {
            num = (int) ((long) row.get(i - 1) * (rowIndex - i + 1) / i);
            row.add(num);
        }

        return row;
    }
}
