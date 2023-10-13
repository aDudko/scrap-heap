package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.

Требования:
1.Объяви переменную типа список строк и сразу проинициализируй ee.
2.Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3.Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4.Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        String min = list.get(0);
        String max = list.get(0);

        for (String s : list) {
            if (s.length() < min.length()) min = s;
            if (s.length() > max.length()) max = s;
        }

        for (String s : list) {
            if (s.equals(max) || s.equals(min)) {
                System.out.println(s);
                break;
            }
        }
    }
}