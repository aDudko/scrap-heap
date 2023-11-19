package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("LKJ", 2.5);
        grades.put("jblj", 2.6);
        grades.put("nkhv", 2.7);
        grades.put("hgv", 2.8);
        grades.put("cyucy", 2.9);
    }
}
