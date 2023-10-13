package com.udemy.pattern.behavioral;
/**
 Позволяет уменьшить связанность множества классов между собой,
 благодаря перемещению этих связей в один класс-посредник.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Intermediary, Controller, Посредник

 ПРИМЕНИМОСТЬ:
 * Когда вам сложно менять некоторые классы из-за того, что они
 имеют множество хаотичных связей с другими классами.
 * огда вы не можете повторно использовать класс, поскольку он
 зависит от уймы других классов.
 * Когда вам приходится создавать множество подклассов компонентов,
 чтобы использовать одни и те же компоненты в разных контекстах.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Устраняет зависимости между компонентами, позволяя повторно их использовать.
 + Упрощает взаимодействие между компонентами.
 + Централизует управление в одном месте.
 - Посредник может сильно раздуться.
*/

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    public static void main(String[] args) {
        Chat chat = new ChatMediator();
        Collegue mike = new CollegueImpl(chat, "Mike");
        chat.addCollegue(mike);
        chat.addCollegue(new CollegueImpl(chat, "Tom"));
        chat.addCollegue(new CollegueImpl(chat, "Jack"));
        chat.addCollegue(new CollegueImpl(chat, "Mari"));
        mike.sendMessage("Hello");
    }
}

// Mediator
interface Chat {
    void sendMessage(String message, Collegue collegue);
    void addCollegue(Collegue collegue);
}

class ChatMediator implements Chat {
    List<Collegue> list = new ArrayList<>();

    @Override
    public void sendMessage(String message, Collegue me) {
        list.forEach(collegue -> {
            // Посылаем сообщение всем, кроме себя
            if (collegue != me) {
                collegue.printMessage(message);
            }
        });
    }

    @Override
    public void addCollegue(Collegue collegue) {
        list.add(collegue);
    }
}

abstract class Collegue {
    Chat chat;
    String name;

    public Collegue(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    abstract void sendMessage(String message);

    abstract void printMessage(String message);
}

class CollegueImpl extends Collegue {
    public CollegueImpl(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    void printMessage(String message) {
        System.out.println(name + " " + message);
    }
}