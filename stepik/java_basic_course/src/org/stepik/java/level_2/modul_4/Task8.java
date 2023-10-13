package org.stepik.java.level_2.modul_4;

import java.math.BigInteger;

public class Task8 {
    public static BigInteger factorial(int value) {
        BigInteger fact = BigInteger.ONE;
        if (value == 1 || value == 1) return fact;
        else {
            for (int i = 2; i <= value; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            return fact;
        }
    }
}