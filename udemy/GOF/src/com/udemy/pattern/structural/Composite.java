package com.udemy.pattern.structural;
/**
 Composite позволяет сгруппировать множество объектов в древовидную структуру,
 а затем работать с ней так, как будто это единичный объект.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Дерево, Компоновщик

 ПРИМЕНИМОСТЬ:
 * Когда вам нужно представить древовидную структуру объектов.
 * Когда клиенты должны единообразно трактовать простые и составные объекты.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Упрощает архитектуру клиента при работе со сложным деревом компонентов.
 + Облегчает добавление новых видов компонентов.
 - Создаёт слишком общий дизайн классов.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Composite {
    public static void main(String[] args) {
        Folder users = new Folder("users");
        Folder etc = new Folder("etc");
        Folder root = new Folder("root");
        root.addFolder(users, etc);

        users.addFolder(new Folder("Mike"));
        root.printFolders();
    }
}

class Folder {
    private String name;
    List<Folder> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFolder(Folder folder) {
        list.add(folder);
    }

    public void addFolder(Folder... folders) {
        list.addAll(Arrays.asList(folders));
    }

    public void printFolders() {
        for (Folder folder: list) {
            System.out.println(folder.name);
            folder.printFolders();
        }
    }
}
