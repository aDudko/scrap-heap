package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                " Моя страна - " + getCountry() +
                ". Я несу " + getCountOfEggsPerMonth() +
                " яиц в месяц.";
    }

    private String getCountry() {
        return Country.RUSSIA;
    }
}