package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

Требования:
1.Объяви переменную типа ArrayList (список строк) и сразу проинициализируй ee.
2.Программа должна считывать 5 строк с клавиатуры и записывать их в список.
3.Программа должна выводить самую длинную строку на экран.
4.Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = initArray(5);
        int max = maxLength(list);

        for (String s : list) {
            if (s.length() == max) System.out.println(s);
        }
    }

    public static ArrayList<String> initArray(int size) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String s;
        for (int i = 0; i < size; i++) {
            try {
                s = reader.readLine();
                list.add(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static int maxLength(List<String> list) {
        int maxSize = 0;
        for (String s : list) {
            if (maxSize < s.length()) maxSize = s.length();
        }
        return maxSize;
    }
}