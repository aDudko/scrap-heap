package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(1.1, "a");
        labels.put(2.2, "b");
        labels.put(3.3, "c");
        labels.put(4.4, "d");
        labels.put(5.5, "e");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
