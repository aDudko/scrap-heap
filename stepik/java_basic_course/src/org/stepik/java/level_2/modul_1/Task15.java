package org.stepik.java.level_2.modul_1;

public class Task15 {
    public static int flipBit(int value, int bitIndex) {
        int temp = 1;
        if (bitIndex == 0) return value;
        else {
            temp = temp << bitIndex-1;
            value = value ^ temp;
        }
        return value;
    }
}