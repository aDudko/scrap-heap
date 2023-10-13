package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        String path;
        String str;
        boolean flag = true;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            path = reader.readLine();

            while (flag) {
                str = reader.readLine();
                if (str.equals("exit")) flag = false;
                list.add(str);
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for (String s : list) {
                writer.write(s + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}