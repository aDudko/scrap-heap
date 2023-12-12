package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] params = url.substring(url.lastIndexOf("?") + 1).split("&");
        StringBuilder result = new StringBuilder();
        String obj = "";
        for (String param : params) {
            String[] split = param.split("=");
            result.append(split[0]).append(" ");
            if (split[0].equals("obj")) {
                obj = split[1];
            }
        }
        System.out.println(result.toString().trim());
        if (!obj.isEmpty()) {
            try {
                alert(Double.parseDouble(obj));
            } catch (NumberFormatException e) {
                alert(obj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
