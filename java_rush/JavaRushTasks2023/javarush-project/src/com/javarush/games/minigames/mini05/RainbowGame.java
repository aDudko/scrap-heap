package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

import java.util.ArrayList;
import java.util.List;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

    private Color[] colorList = new Color[]{
        Color.RED,
        Color.ORANGE,
        Color.YELLOW,
        Color.GREEN,
        Color.BLUE,
        Color.INDIGO,
        Color.VIOLET
    };

    @Override
    public void initialize() {
        setScreenSize(10, 7);
        for (int i = 0; i < colorList.length; i++) {
            for (int j = 0; j < 10; j++) {
                setCellColor(j, i, colorList[i]);
            }
        }
    }
}
