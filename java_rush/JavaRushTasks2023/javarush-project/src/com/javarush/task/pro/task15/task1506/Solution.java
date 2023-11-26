package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> strings = Files.readAllLines(Paths.get(scanner.nextLine()));
            strings.forEach(s -> {
                for (char c : s.toCharArray()) {
                    if (c != ' ' && c != '.' && c != ',') {
                        System.out.print(c);
                    }
                }
                System.out.println();
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

