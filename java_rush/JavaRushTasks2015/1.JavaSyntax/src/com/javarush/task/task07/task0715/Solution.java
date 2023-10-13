package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Продолжаем мыть раму
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Вывести результат на экран, каждый элемент списка с новой строки.

Требования:
1.Программа не должна считывать данные с клавиатуры.
2.Объяви переменную типа список строк и сразу проинициализируй ee.
3.Добавь в список слова: «мама», «мыла», «раму».
4.После каждого слова добавь в список строку, содержащую слово «именно».
5.Выведи элементы списка на экран, каждый с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = Arrays.asList("мама", "мыла", "раму");
        ArrayList<String> newList = new ArrayList<>();

        for (String s : list) {
            newList.add(s);
            newList.add("именно");
        }

        for (String s : newList) {
            System.out.println(s);
        }
    }
}