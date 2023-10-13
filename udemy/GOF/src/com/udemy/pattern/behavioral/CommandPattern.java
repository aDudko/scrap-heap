package com.udemy.pattern.behavioral;
/**
 Паттерн Command решает проблему между связыванием того, что мы
 вызываем какой-то метод на каком-то классе. Но мы не знаем какой
 метод и на каком классе мы вызовем.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Действие, Транзакция, Action, Команда

 ПРИМЕНИМОСТЬ:
 * Когда вы хотите параметризовать объекты выполняемым действием.
 * Когда вы хотите ставить операции в очередь, выполнять их по
 расписанию или передавать по сети.
 * Когда вам нужна операция отмены.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Убирает прямую зависимость между объектами, вызывающими операции, и объектами, которые их непосредственно выполняют.
 + Позволяет реализовать простую отмену и повтор операций.
 + Позволяет реализовать отложенный запуск операций.
 + Позволяет собирать сложные команды из простых.
 + Реализует принцип открытости/закрытости.
 - Усложняет код программы из-за введения множества дополнительных классов.
*/

public class CommandPattern {
    public static void main(String[] args) {
        Command command = new LightCommand(new Light());
        Button button = new Button(command);
        button.pressButton();
    }
}

class Button {
    Command command;

    public Button(Command command) {
        this.command = command;
    }

    void pressButton() {
        command.execute();
    }
}

interface Command {
    void execute();
}

class Light {
    boolean isOn;

    public void switchLight() {
        this.isOn = !this.isOn;
        System.out.println("Light is " + (isOn ? "on" : "off"));
    }
}

class LightCommand implements Command {
    Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchLight();
    }
}

class MusicPlayer {
    public void playMusic() {
        System.out.println("Play music");
    }
}

class MusicPlayerCommand implements Command {
    MusicPlayer musicPlayer;

    public MusicPlayerCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.playMusic();
    }
}