package com.udemy.pattern.structural;
/**
 Предоставляет простой интерфейс к сложной системе классов, библиотеке или фреймворку.

 ПРИМЕНИМОСТЬ:
 * Когда вам нужно представить простой или урезанный интерфейс к сложной подсистеме.
 * Когда вы хотите разложить подсистему на отдельные слои.

 ПРИЕМУЩЕСТВА И НЕДОСТАТКИ:
 + Изолирует клиентов от компонентов сложной подсистемы.
 - Фасад рискует стать "божественным объектом", привязанным ко всем классам программы.
*/

public class Facade {
    public static void main(String[] args) {
        Room livingRoom = new Room();
        Room badRoom = new Room();
        livingRoom.pressButton("1 TV", 24);
        badRoom.pressButton("MTV", 22);
    }
}

class Room {
    RoomFacade roomFacade = new RoomFacade();

    public void pressButton(String channel, Integer temperature) {
        roomFacade.pressButton(channel, temperature);
    }
}

class RoomFacade {
    TV tv = new TV();
    AirCondition airCondition = new AirCondition();
    Light light = new Light();

    // Прячим сложную логику за вызовом одного метода
    public void pressButton(String channel, Integer temperature) {
        tv.playChannel(channel);
        airCondition.setTemperature(temperature);
        light.turnLight();
    }
}

class TV {
    void playChannel(String channel) {
        System.out.println("play channel " + channel);
    }
}

class AirCondition {
    void setTemperature(Integer temperature) {
        System.out.println("set temperature " + temperature);
    }
}

class Light {
    void turnLight() {
        System.out.println("run light");
    }
}


