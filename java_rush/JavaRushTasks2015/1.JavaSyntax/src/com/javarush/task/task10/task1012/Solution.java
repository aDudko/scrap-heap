package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        Map<Character, Integer> result = new LinkedHashMap<>();
        for (Character ch : alphabet) {
            int n = 0;
            for (String str : list) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ch) n += 1;
                }
            }
            result.put(ch, n);
        }

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}