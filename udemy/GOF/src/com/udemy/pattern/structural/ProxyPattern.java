package com.udemy.pattern.structural;
/**
 Позволяет подставлять вместо реальных объектов специальные объекты-заменители.
 Эти объекты перехватывают вызовы к оригинальному объекту, позволяя сделать
 что-то до или после передачи вызова оригиналу.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Заместитель

 ПРИМЕНИМОСТЬ:
 * Ленивая инициализация (виртуальный прокси). Когда у вас есть тяжёлый объект,
 грузящий данные из файловой системы или базы данных.
 * Защита доступа (защищающий прокси). Когда в программе есть разные типы пользователей,
 и вам хочется защищать объект от неавторизованного доступа. Например, если ваши объекты
 — это важная часть операционной системы, а пользователи — сторонние программы (хорошие
 или вредоносные).
 * Локальный запуск сервиса (удалённый прокси). Когда настоящий сервисный объект находится
 на удалённом сервере.
 * Логирование запросов (логирующий прокси). Когда требуется хранить историю обращений к
 сервисному объекту.
 * Кеширование объектов («умная» ссылка). Когда нужно кешировать результаты запросов клиентов
 и управлять их жизненным циклом.

 ПРИЕМУЩЕСТВА И НЕДОСТАТКИ:
 + Позволяет контролировать сервисный объект незаметно для клиента.
 + Может работать, даже если сервисный объект ещё не создан.
 + Может контролировать жизненный цикл служебного объекта.
 - Усложняет код программы из-за введения дополнительных классов.
 - Увеличивает время отклика от сервиса
*/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyPattern {
    public static void main(String[] args) {
        /*
         Reader reader = new ProxyReader(); // Вместо MyReader
         reader.read("Hello");
        */
        InvocationHandler invocationHandler = new ReaderInvocationHandler();
        Object proxyInstance = Proxy.newProxyInstance(
                ProxyPattern.class.getClassLoader(), // ClassLoader
                new Class[]{Reader.class},           // Массив нстансов на котором все вызывается
                invocationHandler
        );
        ((Reader)proxyInstance).read("Hello");
    }
}

interface Reader {
    String read(String str);
}

class MyReader implements Reader {
    @Override
    public String read(String str) {
        return str + " World!";
    }
}

/**
 * Поддержка паттерна в JDK
 */
class ReaderInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(args[0]);
        Object result = method.invoke(new MyReader(), args);
        System.out.println(result);
        return result;
    }
}

// Работает но так делать не надо
class ProxyReader extends MyReader {
    // Внедряем дополнительные действия с поступающими данными
    @Override
    public String read(String str) {
        System.out.println(str);
        String read = super.read(str);
        System.out.println(read);
        return read;
    }
}