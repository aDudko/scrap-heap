package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random random = new Random();
        int result = random.nextInt(8);
        if (result == 0) return CERTAIN;
        if (result == 1) return DEFINITELY;
        if (result == 2) return MOST_LIKELY;
        if (result == 3) return OUTLOOK_GOOD;
        if (result == 4) return ASK_AGAIN_LATER;
        if (result == 5) return TRY_AGAIN;
        if (result == 6) return NO;
        if (result == 7) return VERY_DOUBTFUL;
        return null;
    }
}
