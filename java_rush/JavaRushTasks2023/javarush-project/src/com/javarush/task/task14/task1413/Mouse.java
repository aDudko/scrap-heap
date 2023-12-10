package com.javarush.task.task14.task1413;

public class Mouse implements CompItem {
    @Override
    public String getName() {
        String[] split = this.getClass().getName().split("\\.");
        return split[split.length-1];
    }
}
