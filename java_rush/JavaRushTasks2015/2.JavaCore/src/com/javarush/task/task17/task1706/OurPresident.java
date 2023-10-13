package com.javarush.task.task17.task1706;

public class OurPresident {
    private static OurPresident president;

    static {
        try {
            synchronized (OurPresident.class) {
                president = new OurPresident();
            }
        } catch (ExceptionInInitializerError e) {
            e.printStackTrace();
        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}