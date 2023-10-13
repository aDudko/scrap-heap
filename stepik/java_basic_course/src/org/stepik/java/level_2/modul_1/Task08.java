package org.stepik.java.level_2.modul_1;

public class Task08 {
    public long longExpression(int a, int b, int c) {
        return ((100000000000L % a) >> b) | (100 / c);
    }
}