package com.javarush.task.task13.task1318;

import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args)  {
        String path = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            path = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream inStream = new FileInputStream(path)) {
            while (inStream.available() > 0) {
                System.out.print((char)inStream.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}