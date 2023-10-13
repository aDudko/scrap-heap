package com.udemy.pattern.structural;
/**
 Adapter совмещает интерфейсы, которые не совместимы.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Wrapper, Обёртка, Адаптер

 ПРИМЕНИМОСТЬ:
 * Когда вы хотите использовать сторонний класс, но его интерфейс
 не соответствует остальному коду приложения.
 * Когда вам нужно использовать несколько существующих подклассов,
 но в них не хватает какой-то общей функциональности, причём расширить
 суперкласс вы не можете.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Отделяет и скрывает от клиента подробности преобразования различных
 интерфейсов.
 - Усложняет код программы из-за введения дополнительных классов.
*/

public class Adapter {
    public static void main(String[] args) {
        AmericanSocket americanSocket = new SimpleAmericanSocket();
        Radio radio = new Radio(); // Использует EuroSocket
        EuroSocket euroSocket = new SocketAdapter(americanSocket); // EuroSocket на основе AmericanSocket
        radio.listenMusic(euroSocket);
    }
}

// Несовместимый с AmericanSocket интерфейс
interface EuroSocket {
    void getPower();
}

// Несовместимый с EuroSocket интерфейс
interface AmericanSocket {
    void getPower();
}

// Адаптер
class SocketAdapter implements EuroSocket {
    AmericanSocket americanSocket;

    public SocketAdapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}

// AmericanSocket
class SimpleAmericanSocket implements AmericanSocket {
    @Override
    public void getPower() {
        System.out.println("Get 110 volt");
    }
}

// Потребитель
class Radio {
    public void listenMusic(EuroSocket euroSocket) {
        euroSocket.getPower();
    }
}