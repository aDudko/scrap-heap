package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private String work;
        private int age;
        private int income;
        private String address;

        public Human() {}

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, String address) {
            this.name = name;
            this.surname = surname;
            this.address = address;
        }

        public Human(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, String work, int age) {
            this.name = name;
            this.surname = surname;
            this.work = work;
            this.age = age;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, String surname, String work, int age, int income) {
            this.name = name;
            this.surname = surname;
            this.work = work;
            this.age = age;
            this.income = income;
        }

        public Human(String name, String surname, String work, int age, int income, String address) {
            this.name = name;
            this.surname = surname;
            this.work = work;
            this.age = age;
            this.income = income;
            this.address = address;
        }

        public Human(String work, int age, int income) {
            this.work = work;
            this.age = age;
            this.income = income;
        }
    }
}