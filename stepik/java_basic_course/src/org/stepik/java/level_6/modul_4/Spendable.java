package org.stepik.java.level_6.modul_4;
/*
В приведенном коде используется оператор assert. Этот оператор используется для того, чтобы проверять определенные
инварианты в коде. С помощью него возможно писать небольшие тесты и следить за корректностью своей программы (в обычной
ситуации предпочтительно для этих целей использовать библиотеки для модульного тестирования, которые выходят за рамки
базового курса).

Оператор выглядит следующим образом: 
assert предикат: сообщение;
Предикат – выражение с типом boolean. Если выражение является ложным, то в программе возникает исключение AssertionError
с соответствующим сообщением.

По-умолчанию данная функциональность отключена. Чтобы ее включить, необходимо передать специальный ключ -ea в параметры
виртуальной машины. Сделать это можно прямо при запуске в консоли с помощью программы java, либо указав этот ключ в
настройках запуска программы в вашей IDE. В случае IntellijIDEA, например, эта опция указывается в поле
Run -> Edit Configurations... -> конфигурация запуска вашей программы -> VM Options.

Код, который необходимо заставить успешно работать:

// Random variables
String randomFrom = "..."; // Некоторая случайная строка. Можете выбрать ее самостоятельно. 
String randomTo = "...";  // Некоторая случайная строка. Можете выбрать ее самостоятельно.
int randomSalary = 100;  // Некоторое случайное целое положительное число. Можете выбрать его самостоятельно.

// Создание списка из трех почтовых сообщений.
MailMessage firstMessage = new MailMessage(
        "Robert Howard",
        "H.P. Lovecraft",
        "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
);

assert firstMessage.getFrom().equals("Robert Howard"): "Wrong firstMessage from address";
assert firstMessage.getTo().equals("H.P. Lovecraft"): "Wrong firstMessage to address";
assert firstMessage.getContent().endsWith("Howard!"): "Wrong firstMessage content ending";

MailMessage secondMessage = new MailMessage(
        "Jonathan Nolan",
        "Christopher Nolan",
        "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!"
);

MailMessage thirdMessage = new MailMessage(
        "Stephen Hawking",
        "Christopher Nolan",
        "Я так и не понял Интерстеллар."
);

List<MailMessage> messages = Arrays.asList(
        firstMessage, secondMessage, thirdMessage
);

// Создание почтового сервиса.
MailService<String> mailService = new MailService<>();

// Обработка списка писем почтовым сервисом
messages.stream().forEachOrdered(mailService);

// Получение и проверка словаря "почтового ящика",
//   где по получателю можно получить список сообщений, которые были ему отправлены
Map<String, List<String>> mailBox = mailService.getMailBox();

assert mailBox.get("H.P. Lovecraft").equals(
        Arrays.asList(
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
        )
): "wrong mailService mailbox content (1)";

assert mailBox.get("Christopher Nolan").equals(
        Arrays.asList(
                "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
                "Я так и не понял Интерстеллар."
        )
): "wrong mailService mailbox content (2)";

assert mailBox.get(randomTo).equals(Collections.<String>emptyList()): "wrong mailService mailbox content (3)";


// Создание списка из трех зарплат.
Salary salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
Salary salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
Salary salary3 = new Salary(randomFrom, randomTo, randomSalary);

// Создание почтового сервиса, обрабатывающего зарплаты.
MailService<Integer> salaryService = new MailService<>();

// Обработка списка зарплат почтовым сервисом
Arrays.asList(salary1, salary2, salary3).forEach(salaryService);

// Получение и проверка словаря "почтового ящика",
//   где по получателю можно получить список зарплат, которые были ему отправлены.
Map<String, List<Integer>> salaries = salaryService.getMailBox();
assert salaries.get(salary1.getTo()).equals(Arrays.asList(1)): "wrong salaries mailbox content (1)";
assert salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)): "wrong salaries mailbox content (2)";
assert salaries.get(randomTo).equals(Arrays.asList(randomSalary)): "wrong salaries mailbox content (3)";
В конечном итоге, вам нужно реализовать классы MailService, MailMessage и Salary (и, вероятно, вспомогательные классы и интерфейсы) и отправить их код в форму. Все классы должны быть публичными и статическими (ваши классы подставятся во внешний класс для тестирования).

В идеологически правильном решении не должно фигурировать ни одного оператора instanceof.

В классе для тестирования объявлены следующие импорты:

import java.util.*;
import java.util.function.*;
*/

import java.util.*;
import java.util.function.Consumer;

interface Spendable<T> {
    String getFrom();
    String getTo();
    T getContent();
}

class SimpleSendable<T> implements Spendable<T> {
    private String from, to;
    private T content;

    public SimpleSendable(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public T getContent() {
        return content;
    }
}

class MailMessage extends SimpleSendable<String> {
    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }
}

class Salary extends SimpleSendable<Integer> {
    public Salary(String from, String to, Integer content) {
        super(from, to, content);
    }
}

class MailService<T> implements Consumer<Spendable<T>> {
    private Map<String, List<T>> messagesMap = new HashMap<String, List<T>>(){
        @Override
        public List<T> get(Object key) {
            if (this.containsKey(key)) {
                return super.get(key);
            } else {
                return Collections.emptyList();
            }
        }
    };

    @Override
    public void accept(Spendable<T> sendable) {
        List<T> ts = messagesMap.get(sendable.getTo());
        if (ts.size() == 0) {
            ts = new ArrayList<>();
        }
        ts.add(sendable.getContent());
        messagesMap.put(sendable.getTo(), ts);
    }

    public Map<String, List<T>> getMailBox() {
        return messagesMap;
    }
}