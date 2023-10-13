package com.udemy.pattern.behavioral;
/**
 Даёт возможность последовательно обходить элементы составных
 объектов, не раскрывая их внутреннего представления.

 ПРИМЕНИМОСТЬ:
 * Когда у вас есть сложная структура данных, и вы хотите скрыть
 от клиента детали её реализации (из-за сложности или вопросов безопасности).
 * Когда вам нужно иметь несколько вариантов обхода одной и той же структуры данных.
 * Когда вам хочется иметь единый интерфейс обхода различных структур данных.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Упрощает классы хранения данных.
 + Позволяет реализовать различные способы обхода структуры данных.
 + Позволяет одновременно перемещаться по структуре данных в разные стороны.
 - Не оправдан, если можно обойтись простым циклом.
*/

public class IteratorExample {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Iterator<String> iterator = menu.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class Menu {
    String[] item = {"one", "two", "three", "for"};

    Iterator<String> getIterator() {
        return new Iterator<>() {
            int i;

            @Override
            public boolean hasNext() {
                return i < item.length;
            }

            @Override
            public String next() {
                return item[i++];
            }
        };
    }
}

interface Iterator<T> {
    boolean hasNext();
    T next();
}