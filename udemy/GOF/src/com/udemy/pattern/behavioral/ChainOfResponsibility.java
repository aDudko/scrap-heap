package com.udemy.pattern.behavioral;
/**
 Паттерн Chain Of Responsibility применяется когда мы вызываем
 некоторый метод и он проходит через целую цепочку вызовов.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 CoR, Chain of Command, Цепочка обязанностей

 ПРИМЕНИМОСТЬ:
 * Когда программа должна обрабатывать разнообразные запросы несколькими
 способами, но заранее неизвестно, какие конкретно запросы будут приходить
 и какие обработчики для них понадобятся.
 * Когда важно, чтобы обработчики выполнялись один за другим в строгом порядке.
 * Когда набор объектов, способных обработать запрос, должен задаваться динамически.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Уменьшает зависимость между клиентом и обработчиками.
 + Реализует принцип единственной обязанности.
 + Реализует принцип открытости/закрытости.
 - Запрос может остаться никем не обработанным.
*/

public class ChainOfResponsibility {
    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageAddHandler(
                new MessageVerifyHandler(new MessagePrintHandler(null)));
        messageHandler.handle("Hello World");
    }
}

abstract class MessageHandler {
    MessageHandler messageHandler;

    public MessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    abstract void handle(String message);
}

class MessagePrintHandler extends MessageHandler {
    public MessagePrintHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String message) {
        System.out.println(message);
    }
}

class MessageVerifyHandler extends MessageHandler {
    public MessageVerifyHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String message) {
        if (!message.matches(".*\\d.*")) {
            messageHandler.handle(message);
        }
    }
}

class MessageAddHandler extends MessageHandler {
    public MessageAddHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String message) {
        messageHandler.handle(message + "!");
    }
}
