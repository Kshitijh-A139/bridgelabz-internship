package com.bridgelabz.mathoperation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface MathOperate {
    int operation(int a, int b);
}


public class MathOperation {
    public static int performOperation(int a, int b, MathOperate op) {
        return op.operation(a, b);
    }

    public static void addition(int a, int b) {
        MathOperate add = (x, y) -> x + y;
        System.out.println("Addition: " + add.operation(a, b));
    }

    public static void subtraction(int a, int b) {
        MathOperate sub = (x, y) -> x - y;
        System.out.println("Subtraction: " + sub.operation(a, b));
    }

    public static void multiplication(int a, int b) {
        MathOperate mul = (x, y) -> x * y;
        System.out.println("Multiplication: " + mul.operation(a, b));
    }

    public static void division(int a, int b) {
        MathOperate div = (x, y) -> x / y;
        System.out.println("Division: " + div.operation(a, b));
    }

    public static void showOperation(int a, int b, MathOperate op) {
        System.out.println("Result: " + op.operation(a, b));
    }

    public static void iterateUsingNormalClass(List<Integer> list) {
        class PrintClass implements Consumer<Integer> {
            public void accept(Integer n) {
                System.out.println("Normal Class: " + n);
            }
        }

        list.forEach(new PrintClass());
    }

    public static void iterateUsingAnonymousClass(List<Integer> list) {
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println("Anonymous Class: " + n);
            }
        });
    }

    public static void iterateUsingLambda(List<Integer> list) {list.forEach(n -> System.out.println("Lambda: " + n));}

    public static void printDoubleValues(List<Integer> list) {
        Function<Integer, Integer> doubleValue =
                n -> n * 2;
        list.forEach(n ->
                System.out.println("Double Value: " + doubleValue.apply(n)));
    }

    public static void printEvenNumbers(List<Integer> list) {
        Predicate<Integer> isEven =
                n -> n % 2 == 0;
        list.forEach(n -> {
            if (isEven.test(n)) {
                System.out.println("Even Number: " + n);
            }
        });
    }

    public static void main(String[] args) {
        addition(10, 5);
        subtraction(10, 5);
        multiplication(10, 5);
        division(10, 5);
        showOperation(20, 10, (a, b) -> a + b);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        iterateUsingNormalClass(numbers);
        iterateUsingAnonymousClass(numbers);
        iterateUsingLambda(numbers);
        printDoubleValues(numbers);
        printEvenNumbers(numbers);
    }
}