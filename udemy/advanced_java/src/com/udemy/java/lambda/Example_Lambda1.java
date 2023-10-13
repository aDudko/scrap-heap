package com.udemy.java.lambda;

public class Example_Lambda1 {
    public static void main(String[] args) {
        Runner runner = new Runner();
        // 1 способ. With implementation
        runner.run(new ExecutableImpl());
        // 2 способ. Anonymous class
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello");
            }
        });

        // Либо final, либо не изменять после объявления
        int a = 9;
        // 3 способ. With lambda
        // Нет своей области видимости, т.е. переопределять переменные нельзя
        runner.run(() -> {
            System.out.println("Hello" + a);
        });
    }
}

// Functional interface
// ТОЛЬКО ОДИН МЕТОД!!!
interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e) {
        e.execute();
    }
}

class ExecutableImpl implements Executable {
    @Override
    public void execute() {
        System.out.println("Hello");
    }
}