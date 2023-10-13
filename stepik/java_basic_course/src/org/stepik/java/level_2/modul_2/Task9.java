package org.stepik.java.level_2.modul_2;

public class Task9 {
    public static boolean isPowerOfTwo(int value) {
        return (Math.abs(value) != 0) && ((Math.abs(value) & (Math.abs(value) - 1)) == 0);
    }
}