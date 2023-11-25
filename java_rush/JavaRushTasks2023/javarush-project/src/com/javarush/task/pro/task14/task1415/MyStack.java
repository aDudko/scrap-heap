package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        this.storage.add(0, s);
    }

    public String pop() {
        return storage.remove(0);

    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        if (storage.contains(s)) {
            return storage.indexOf(s);
        }
        return -1;
    }
}
