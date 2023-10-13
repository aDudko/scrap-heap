package main.java.easy.fizz_bizz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> rez = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                rez.add("FizzBuzz");
            } else if (i % 3 == 0) {
                rez.add("Fizz");
            } else if (i % 5 == 0) {
                rez.add("Buzz");
            } else {
                rez.add(String.valueOf(i));
            }
        }
        return rez;
    }
}
