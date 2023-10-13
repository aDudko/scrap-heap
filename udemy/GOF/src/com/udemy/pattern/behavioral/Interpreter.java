package com.udemy.pattern.behavioral;
/**
 Позволяет интерпретировать любые выражения
*/

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Interpreter {
    public static void main(String[] args) {
        String expression = "a / b";
        Expression parse = parseExpression(expression);
        Map<String, Integer> context = new HashMap<>();
        context.put("a", 10);
        context.put("b", 3);
        System.out.println(parse.interpret(context));
    }

    private static Expression parseExpression(String exp) {
        ArrayDeque<Expression> stack = new ArrayDeque<>();
        // Переменные
        Arrays.stream(exp.split(" ")) // [a, +, b]
                .filter(token -> Character.isLetter(token.charAt(0)))
                .forEach(token -> {
                    stack.push(parseToken(token, stack));
                });
        // Операции
        Arrays.stream(exp.split(" ")) // [a, +, b]
                .filter(token -> !Character.isLetter(token.charAt(0)))
                .forEach(token -> {
                    stack.push(parseToken(token, stack));
                });
        return stack.pop();
    }

    private static Expression parseToken(String token, ArrayDeque<Expression> stack) {
        Expression left, right;
        switch (token) {
            case "+":
                right = stack.pop();
                left = stack.pop();
                return Expression.plus(left, right);
            default:
                return Expression.variable(token);
        }
    }
}

interface Expression {
    int interpret(Map<String, Integer> context);

    static Expression plus(Expression left, Expression right) {
        return context -> left.interpret(context) + right.interpret(context);
    }

    static Expression variable(String name) {
        return context -> context.getOrDefault(name, 0);
    }
}
