package org.stepik.java.level_2.modul_1;

public class Task12 {
    public boolean doubleExpression(double a, double b, double c) {
        double temp = a + b;
        boolean q = Math.abs(temp - c) <= (1E-4);
        return q;
    }
}