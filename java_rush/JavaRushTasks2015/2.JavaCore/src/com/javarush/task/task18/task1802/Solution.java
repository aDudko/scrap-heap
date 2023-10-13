package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        try {
            fileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Validation
        if (fileName.isEmpty()) return;

        // Logic
        FileInputStream inputStream = new FileInputStream(fileName);
        int max = inputStream.read();
        while (inputStream.available() > 0) {
            int temp = inputStream.read();
            //System.out.print(temp + " ");
            if (temp < max) max = temp;
        }
        //System.out.println();
        inputStream.close();

        System.out.println(max);
    }
}