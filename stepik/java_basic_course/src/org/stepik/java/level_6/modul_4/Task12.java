package org.stepik.java.level_6.modul_4;
/*
Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.

Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:

minMaxConsumer.accept(min, max);
Если стрим не содержит элементов, то вызовите
minMaxConsumer.accept(null, null);
*/

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Task12 {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        MinMaxFinder<T> minMaxFinder = new MinMaxFinder<>(order);
        stream.forEach(minMaxFinder);
        minMaxConsumer.accept(minMaxFinder.min, minMaxFinder.max);
    }
}

class MinMaxFinder<T> implements Consumer<T> {
    private final Comparator<? super T> order;
    T min;
    T max;

    MinMaxFinder(Comparator<? super T> order) {
        this.order = order;
    }

    @Override
    public void accept(T t) {
        if (min == null || order.compare(t, min) < 0) {
            min = t;
        }
        if (max == null || order.compare(max, t) < 0) {
            max = t;
        }
    }
}