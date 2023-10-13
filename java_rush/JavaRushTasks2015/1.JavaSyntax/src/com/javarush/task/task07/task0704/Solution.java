package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.

Требования:
1.Программа должна создавать массив на 10 целых чисел.
2.Программа должна считывать числа для массива с клавиатуры.
3.Программа должна выводить 10 строчек, каждую с новой строки.
4.Массив должен быть выведен на экран в обратном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] inputArrayStr = new int[10];
        int[] outputArrayStr = new int[10];

        for (int i = 0; i < inputArrayStr.length; i++) {
            inputArrayStr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < outputArrayStr.length; i++) {
            outputArrayStr[i] = inputArrayStr[9 - i];
        }

        inputArrayStr = outputArrayStr;

        for (int i = 0; i < inputArrayStr.length; i++) {
            System.out.println(inputArrayStr[i]);
        }

//        Scanner scanner = new Scanner(System.in);
//        int[] list = new int[10];
//        for (int i = 0; i < 10; i++) {
//            list[i] = scanner.nextInt();
//        }
//        for (int i = 9; i >= 0; i--) {
//            System.out.println(list[i]);
//        }
    }
}

