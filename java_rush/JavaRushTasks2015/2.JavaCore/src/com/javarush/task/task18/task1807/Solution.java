package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

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
        int count = 0;
        while (inputStream.available() > 0) {
            int temp = inputStream.read();
            //System.out.print(temp);
            if (temp == 44) count++;
        }
        //System.out.println();
        inputStream.close();

        System.out.println(count);
    }
}