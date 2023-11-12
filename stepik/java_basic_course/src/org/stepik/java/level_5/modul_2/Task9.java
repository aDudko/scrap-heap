package org.stepik.java.level_5.modul_2;
/*
По историческим причинам на разных платформах принят разный способ обозначения конца строки в текстовом файле.
На Unix-системах конец строки обозначается символом с кодом 10 ('\n'), на Windows — двумя последовательными символами с
кодами 13 и 10 ('\r' '\n').

Напишите программу, которая будет преобразовывать переводы строк из формата Windows в формат Unix. Данные в формате
Windows подаются программе в System.in, преобразованные данные должны выводиться в System.out. На этот раз вам надо
написать программу полностью, т.е. объявить класс (с именем Main — таково ограничение проверяющей системы), метод main,
прописать все import'ы.

Требуется заменить все вхождения пары символов '\r' и '\n' на один символ '\n'. Если на входе встречается одиночный символ
'\r', за которым не следует '\n', то символ '\r' выводится без изменения.

Кодировка входных данных такова, что символ '\n' представляется байтом 10, а символ '\r' — байтом 13. Поэтому программа
может осуществлять фильтрацию на уровне двоичных данных, не преобразуя байты в символы.

Из-за буферизации данных в System.out в конце вашей программы надо явно вызвать System.out.flush(). Иначе часть выведенных
вами данных не будет видна проверяющей системе.

Пример

Из System.in зачитаны следующие байты: 65 13 10 10 13. Внимание! Это не строка "65 13 10 10 13", а последовательность чисел,
возвращаемая методом System.in.read().

В System.out должны быть выведены байты: 65 10 10 13
*/

import java.io.*;

public class Task9 {
    public static void main(String[] args) throws IOException{
		InputStreamReader stream;
        int result;
        boolean buff = false;
        stream = new InputStreamReader(System.in);
        while ((result = stream.read()) > 0) {
        	if (result == 13 && !buff) {
        		buff = true;     
        		continue;
        	}
        	if (buff){
        			buff = false;
        			if (result != 10) {
        				System.out.write(13);
        			}
            }
        	System.out.write(result);
        }  
        System.out.flush();
    }
}