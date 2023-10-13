package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(1.0, "1d");
        labels.put(2.0, "2d");
        labels.put(3.0, "3d");
        labels.put(4.0, "4d");
        labels.put(5.0, "5d");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}