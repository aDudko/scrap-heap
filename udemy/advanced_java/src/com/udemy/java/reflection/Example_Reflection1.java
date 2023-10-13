package com.udemy.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Example_Reflection1 {
    public static void main(String[] args) {
        /**
         * Служебный класс Class, экземпляры которого (Java-классы), хранят
         * конкретную информацию о конкретном классе.
         * Получить доступ:
         * * Class c = MyClass.class;
         * * Class c = obj.getClass();
         * * Class c = Class.forName("полный_путь_от_src")
         */
        Class personClass = Person.class;

        /**
         * Класс Method, экземпляры которого хранят информацию о методах конкретного
         * класса, которые мы объявляем в своем классе
         */
        // Вернет все методы, даже методы родительских классов
        // Кроме приватных
        Method[] personPublicMethods = personClass.getMethods();
        for (Method method : personPublicMethods) {
            System.out.println("Method: " + method.getName() +
                    ". Return: " + method.getReturnType() +
                    ". Parameters: " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println();

        // Вернет только объявленные в нашем классе методы
        // Включая приватные
        Method[] personAllMethods = personClass.getDeclaredMethods();
        for (Method method : personAllMethods) {
            System.out.println("Method: " + method.getName() +
                    ". Return: " + method.getReturnType() +
                    ". Parameters: " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println();

        /**
         * Поля, которые мы объявляем в классе это объекты класса Field.
         * * MyClass.getFields - вернет public поля (с учетом инкапсуляции)
         * * MyClass.getDeclaredFields - вернет даже приватные поля
         */
        Field[] personFields = personClass.getDeclaredFields();
        for (Field field : personFields) {
            System.out.println("Field name: " + field.getName() + ". Field type: " + field.getType());
        }
        System.out.println();

        /**
         * Аннотации, которыми мы отметили класс это объекты класса Annotation
         * Доступны только с RetentionPolicy.RUNTIME
         */
        Annotation personAnnotation = personClass.getAnnotation(Author.class);
        System.out.println("Annotation: " + personAnnotation);
    }
}
