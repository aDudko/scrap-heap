package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

Требования:
1.Объяви переменную типа список строк и сразу проинициализируй ee.
2.Программа должна считывать 5 строк с клавиатуры и записывать их в список.
3.Программа должна выводить самую короткую строку на экран.
4.Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = initArray(5);
        int min = minLength(list);

        for (String s : list) {
            if (s.length() == min) System.out.println(s);
        }
    }

    public static int minLength(List<String> list) {
        int minSize = list.get(0).length();
        for (String s : list) {
            if (minSize > s.length()) minSize = s.length();
        }
        return minSize;
    }

    public static ArrayList<String> initArray(int size) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            try {
                list.add(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
