package org.stepik.java.level_2.modul_1;

public class Task06 {
    public boolean booleanExpression(boolean a, boolean b, boolean c) {
        return ((c & secretFunction()) | (a ^ b));
    }
    
    public boolean secretFunction() {
        return true;
    }
}