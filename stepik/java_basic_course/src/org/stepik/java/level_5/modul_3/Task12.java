package org.stepik.java.level_5.modul_3;
/*
Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.

Пример

InputStream последовательно возвращает четыре байта: 48 49 50 51.

Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".
*/

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class Task12 {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        String str = "";
        int i;
        while ((i = reader.read()) != -1) {
            str += (char) i;
        }
        return str;
    }
}