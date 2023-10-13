package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде «21 02 2014«.

Требования:
1.Дата должна содержать день, месяц и год, разделенные пробелом.
2.День должен соответствовать текущему.
3.Месяц должен соответствовать текущему.
4.Год должен соответствовать текущему.
5.Вся дата должна быть выведена в одной строке.
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date currentTime = new Date();

        int day = currentTime.getDay()-1;
        int month = currentTime.getMonth() + 1;
        int year = currentTime.getYear() + 1900;

        System.out.println((day<10?"0"+day:day) + " "+ (month<10?"0"+month:month) + " " + year);
    }
}