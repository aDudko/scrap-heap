package com.javarush.games.minigames.mini08;

import com.javarush.engine.cell.*;

import java.util.Arrays;

/* 
Работа с клавиатурой
*/

public class KeyboardGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onKeyPress(Key key) {
        switch (key) {
            case LEFT -> {
                for (int i = 0; i < 3; i++) {
                    setCellColor(0, i, Color.GREEN);
                }
            }
            case RIGHT -> {
                for (int i = 0; i < 3; i++) {
                    setCellColor(2, i, Color.GREEN);
                }
            }
            case UP -> {
                for (int i = 0; i < 3; i++) {
                    setCellColor(i, 0, Color.GREEN);
                }
            }
            case DOWN -> {
                for (int i = 0; i < 3; i++) {
                    setCellColor(i, 2, Color.GREEN);
                }
            }
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if (Arrays.asList(Key.LEFT, Key.RIGHT, Key.UP, Key.DOWN).contains(key)) {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    setCellColor(x, y, Color.WHITE);
                }
            }
        }
    }
}
