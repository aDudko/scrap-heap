package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

import java.util.Arrays;
import java.util.Collections;

public class MinMaxUtil {
    public static int min(int a, int b) {
        return Collections.min(Arrays.asList(a, b));
    }

    public static int min(int a, int b, int c) {
        return Collections.min(Arrays.asList(a, b, c));
    }

    public static int min(int a, int b, int c, int d) {
        return Collections.min(Arrays.asList(a, b, c, d));
    }

    public static int min(int a, int b, int c, int d, int f) {
        return Collections.min(Arrays.asList(a, b, c, d, f));
    }

    public static int max(int a, int b) {
        return Collections.max(Arrays.asList(a, b));
    }

    public static int max(int a, int b, int c) {
        return Collections.max(Arrays.asList(a, b, c));
    }

    public static int max(int a, int b, int c, int d) {
        return Collections.max(Arrays.asList(a, b, c, d));
    }

    public static int max(int a, int b, int c, int d, int f) {
        return Collections.max(Arrays.asList(a, b, c, d, f));
    }
}
