package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {
        //System.out.println(thePlanet);
    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String planet = null;

        //Get parameter
        try {
            planet = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Validation
        if (planet == null) {
            thePlanet = null;
            return;
        }

        //Logic
        if (planet.equalsIgnoreCase(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        } else if (planet.equalsIgnoreCase(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else if (planet.equalsIgnoreCase(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else {
            thePlanet = null;
        }
    }
}