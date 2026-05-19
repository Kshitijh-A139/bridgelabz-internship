import java.util.Scanner;

public class MaxMinGenericClass {
    public static void main(String[] args) {
        Maximum2<Integer> intObj = new Maximum2<>(20, 63, 90);
        System.out.println("Maximum Integer: " + intObj.testMaximum());

        Maximum2<Float> floatObj = new Maximum2<>(24.8f, 46.9f, 86.7f);
        System.out.println("Maximum Float: " + floatObj.testMaximum());

        Maximum2<String> stringObj = new Maximum2<>("Orange", "Pineapple", "Guava");
        System.out.println("Maximum String: " + stringObj.testMaximum());
    }
}

class Maximum2<T extends Comparable<T>> {
    T a;
    T b;
    T c;

    Maximum2(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T testMaximum() {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

}



