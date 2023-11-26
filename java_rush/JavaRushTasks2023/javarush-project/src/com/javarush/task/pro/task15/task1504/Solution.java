package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            byte[] bIn = inputStream.readAllBytes();
            byte[] bOut = new byte[bIn.length];
            for (int i = 0; i < bIn.length; i += 2) {
                if (i < bIn.length - 1) {
                    bOut[i] = bIn[i + 1];
                    bOut[i + 1] = bIn[i];
                } else {
                    bOut[i] = bIn[i];
                }
            }
            outputStream.write(bOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

