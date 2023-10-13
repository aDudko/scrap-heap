package com.udemy.pattern.behavioral;
/**
 Momento позволяет сохранять и восстанавливать прошлые состояния
 объектов, не раскрывая подробностей их реализации.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Хранитель, Снимок

 ПРИМЕНИМОСТЬ:
 * Когда вам нужно сохранять мгновенные снимки состояния объекта
 (или его части), чтобы впоследствии объект можно было восстановить
 в том же состоянии.
 * Когда прямое получение состояния объекта раскрывает приватные
 детали его реализации, нарушая инкапсуляцию.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Не нарушает инкапсуляции исходного объекта.
 + Упрощает структуру исходного объекта. Ему не нужно хранить историю версий своего состояния.
 - Требует много памяти, если клиенты слишком часто создают снимки.
 - Может повлечь дополнительные издержки памяти, если объекты, хранящие историю,
 не освобождают ресурсы, занятые устаревшими снимками.
 - В некоторых языках (например, PHP, Python, JavaScript) сложно гарантировать, чтобы
 только исходный объект имел доступ к состоянию снимка.
*/

import java.util.ArrayList;
import java.util.List;

public class MomentoPattern {
    public static void main(String[] args) {
        List<Originator.Momento> list = new ArrayList<>();

        Originator originator = new Originator();
        originator.setStage("one");
        list.add(originator.saveState());
        originator.setStage("two");
        list.add(originator.saveState());
        originator.setStage("three");

        System.out.println("Текущее состояние: " + originator.state);
        originator.restoreForMomento(list.get(0));
        System.out.println(originator.state);
        originator.restoreForMomento(list.get(1));
        System.out.println(originator.state);
    }
}

class Originator {
    String state;

    public void setStage(String state) {
        this.state = state;
    }

    public Originator.Momento saveState() {
        return new Momento(this.state);
    }

    public void restoreForMomento(Momento momento) {
        this.state = momento.state;
    }

    static class Momento {
        String state;

        public Momento(String state) {
            this.state = state;
        }

        public String getStage() {
            return state;
        }
    }
}