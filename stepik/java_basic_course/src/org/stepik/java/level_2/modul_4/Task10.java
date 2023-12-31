package org.stepik.java.level_2.modul_4;

public class Task10 {
    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder[] textByRoles = new StringBuilder[roles.length];
        for (int i = 0; i < roles.length; i++) {
            textByRoles[i] = new StringBuilder(roles[i] + ":");
        }

        for (int i = 0; i < textLines.length; i++) {
            String[] splitLine = textLines[i].split(": ", 2);
            String role = splitLine[0];
            String text = splitLine[1];

            int j = 0;
            while (!roles[j].equals(role)) {
                j++;
            }
            textByRoles[j].append("\n" + (i + 1) + ") " + text);
        }

        String result = "";
        for (StringBuilder line : textByRoles) {
            result += line + "\n\n";
        }
        return result;
    }
}