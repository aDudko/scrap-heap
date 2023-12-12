package com.javarush.task.task15.task1530;

public abstract class DrinkMaker {
    // выбрать подходящую чашку;
    abstract void getRightCup();

    // положить ингредиенты;
    abstract void putIngredient();

    // залить жидкость
    abstract void pour();

    void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
