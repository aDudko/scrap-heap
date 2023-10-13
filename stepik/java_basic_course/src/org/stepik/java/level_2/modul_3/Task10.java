package org.stepik.java.level_2.modul_3;

public class Task10 {
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^\\w_]", "").toLowerCase();
        int t = text.length();
        String textLeft = text.substring(0, t / 2);
        if (t % 2 == 0) t = t / 2;
        else t = t / 2 + 1;
        String textRight = text.substring(t, text.length());
        textRight = new StringBuilder(textRight).reverse().toString();
        if (textLeft.equalsIgnoreCase(textRight)) return true;
        else return false;
    }
}