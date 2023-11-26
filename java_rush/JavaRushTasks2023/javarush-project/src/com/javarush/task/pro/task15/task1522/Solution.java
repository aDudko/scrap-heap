package com.javarush.task.pro.task15.task1522;

import java.io.IOException;
import java.net.URL;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        String str = new String(url.openStream().readAllBytes());
        System.out.println(str);
    }
}