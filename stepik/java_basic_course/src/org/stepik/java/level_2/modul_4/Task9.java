package org.stepik.java.level_2.modul_4;

public class Task9 {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] rez = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                rez[k] = a1[i];
                i++;
            } else {
                rez[k] = a2[j];
                j++;
            }
            k++;
        }

        while (i < a1.length) {
            rez[k] = a1[i];
            k++;
            i++;
        }
        while (j < a2.length) {
            rez[k] = a2[j];
            k++;
            j++;
        }
        return rez;
    }
}