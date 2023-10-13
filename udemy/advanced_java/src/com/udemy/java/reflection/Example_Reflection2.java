package com.udemy.java.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Считаем из консоли название двух классов
 * Создадим объекты считанных классов
 * Считаем из консоли название метода
 * Вызовем метод у первого класса
 * В качестве аргумента метода передадим объект второго класса
 */
public class Example_Reflection2 {
    public static void main(String[] args) throws
            ClassNotFoundException,
            NoSuchMethodException,
            IllegalAccessException,
            InstantiationException,
            InvocationTargetException
    {
        Scanner scanner = new Scanner(System.in);
        // Название_класса1 Название_класса2 Название_метода
        // ex: Person java.lang.String setName
        Class aClass1 = Class.forName(scanner.next());
        Class aClass2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method method = aClass1.getMethod(methodName, aClass2);

        Object object1 = aClass1.newInstance();
        Object object2 = aClass2.getConstructor(String.class).newInstance("String value");

        method.invoke(object1, object2);

        System.out.println(object1);
    }
}
