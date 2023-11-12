package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int medium = array.length / 2;
        if (array.length % 2 == 0) {
            Arrays.fill(array, 0, medium, valueStart);
            Arrays.fill(array, medium, array.length, valueEnd);
        } else {
            Arrays.fill(array, 0, medium + 1, valueStart);
            Arrays.fill(array, medium + 1, array.length, valueEnd);
        }
        System.out.println(Arrays.toString(array));
    }
}
