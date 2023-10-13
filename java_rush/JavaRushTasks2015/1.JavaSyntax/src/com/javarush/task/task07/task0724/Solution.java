package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни
их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…

Требования:
1.Программа не должна считывать данные с клавиатуры.
2.Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3.Добавить в класс конструктор public Human(String name, boolean sex, int age).
4.Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5.Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6.Выведи созданные объекты на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();
        Human grandfather1 = new Human("grandfather1_name", true, 70);
        list.add(grandfather1);
        Human grandfather2 = new Human("grandfather2_name", true, 70);
        list.add(grandfather2);
        Human grandmother1 = new Human("grandmother1_name", true, 62);
        list.add(grandmother1);
        Human grandmother2 = new Human("grandmother2_name", true, 62);
        list.add(grandmother2);
        Human father = new Human("father_name", true, 40, grandfather1, grandmother1);
        list.add(father);
        Human mother = new Human("mother_name", true, 32, grandfather2, grandmother2);
        list.add(mother);
        Human chaild1 = new Human("chaild1_name", true, 19, father, mother);
        list.add(chaild1);
        Human chaild2 = new Human("chaild2_name", true, 16, father, mother);
        list.add(chaild2);
        Human chaild3 = new Human("chaild3_name", true, 12, father, mother);
        list.add(chaild3);

        for (Human human : list) {
            System.out.println(human);
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}