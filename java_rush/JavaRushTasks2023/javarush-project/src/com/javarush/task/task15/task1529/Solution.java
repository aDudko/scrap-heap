package com.javarush.task.task15.task1529;

import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {

    public static CanFly result;

    static {
        Solution.reset();
    }

    public static void main(String[] args) {
//        System.out.println(result);
    }

    public static void reset() {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        if (nextLine.equals("helicopter")) {
            result = new Helicopter();
        } else if (nextLine.equals("plane")) {
            result = new Plane(Integer.parseInt(scanner.nextLine()));
        }
    }
}
