package org.stepik.java.level_5.modul_2;
/*
Напишите метод, читающий входной поток и вычисляющий контрольную сумму прочитанных данных.

Контрольная сумма данных вычисляется по следующему алгоритму:

Контрольная сумма представляет собой число типа int. Контрольная сумма пустого набора данных равна нулю.
Контрольная сумма непустого набора данных вычисляется по следующей рекуррентной формуле: Cn+1=rotateLeft(Cn) xor
bn+1Cn+1=rotateLeft(Cn) xor bn+1 , где CnCn — контрольная сумма первых n байт данных, rotateLeft — циклический сдвиг бит
числа на один бит влево (чтобы не изобретать велосипед, используйте Integer.rotateLeft), bnbn — n-ный байт данных.

Поскольку метод не открывал данный InputStream, то и закрывать его он не должен. Выброшенное из методов InputStream
исключение должно выбрасываться из метода.


Пример
На вход подан InputStream, последовательно возвращающий три байта: 0x33 0x45 0x01. В качестве контрольной суммы должно
быть возвращено число 71.
*/

import java.io.IOException;
import java.io.InputStream;

public class Task8 {
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int res = 0;
        int c = 0;
        while ((c = inputStream.read()) != -1) {
            res = Integer.rotateLeft(res, 1) ^ c;
        }
        return res;
    }
}