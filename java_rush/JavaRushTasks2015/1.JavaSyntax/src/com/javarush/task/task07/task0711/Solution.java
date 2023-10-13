package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Удалить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

Требования:
1.Объяви переменную типа список строк и сразу проинициализируй ee.
2.Программа должна считывать 5 строк с клавиатуры и добавлять их в список.
3.Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4.Программа должна выводить список на экран, каждое значение с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = initArray(5);

        for (int i = 0; i < 13; i++) {
            list.add(0, list.remove(list.size()-1));
        }

        printArray(list);
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

    public static <T> void printArray(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }
}
