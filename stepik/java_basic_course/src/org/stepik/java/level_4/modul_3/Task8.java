package org.stepik.java.level_4.modul_3;
/*
В этой задаче вам нужно реализовать метод, настраивающий параметры логирования. Конфигурирование в коде позволяет
выполнить более тонкую и хитрую настройку, чем при помощи properties-файла.

Требуется выставить такие настройки, чтобы:

Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
Все сообщения, пришедшие от нижестоящих логгеров на уровень "org.stepic.java", независимо от серьезности сообщения
печатались в консоль в формате XML (*) и не передавались вышестоящим обработчикам на уровнях "org.stepic", "org" и "".
Не упомянутые здесь настройки изменяться не должны.

(*) В реальных программах мы бы конечно печатали XML не в консоль, а в файл. Но проверяющая система не разрешает создавать
файлы на диске, поэтому придется так.

Подсказки:
1. Level есть не только у Logger, но и у Handler.
2. Передача сообщения на обработку родительскому Handler'у регулируется свойством useParentHandlers.
*/

import java.util.logging.*;

public class Task8 {
    private static void configureLogging() {
        Handler handlerA = new ConsoleHandler();
        Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        Logger loggerC = Logger.getLogger("org.stepic.java");
        loggerC.addHandler(handlerA);
        loggerC.setLevel(Level.ALL);
        loggerA.setLevel(Level.ALL);
        loggerB.setLevel(Level.WARNING);
        loggerC.setUseParentHandlers(false);
        handlerA.setLevel(Level.ALL);

        handlerA.setFormatter(new XMLFormatter());
    }
}