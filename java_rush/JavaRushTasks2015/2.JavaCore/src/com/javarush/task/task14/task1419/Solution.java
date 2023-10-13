package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            List<Integer> list = new LinkedList<>();
            list.get(1);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new InstantiationException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NegativeArraySizeException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NumberFormatException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ReflectiveOperationException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new UnsupportedOperationException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new TypeNotPresentException("test", new Throwable());
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new StringIndexOutOfBoundsException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new SecurityException();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}