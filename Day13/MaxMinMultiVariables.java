import java.util.Arrays;
import java.util.Scanner;

public class MaxMinMultiVariables {
    public static <T extends Comparable<T>> T findMax(T[] values) {
        T max = values[0];

        for(int i=1; i< values.length; i++) {
            if(values[i].compareTo(max) > 0) {
                max = values[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {37, 59, 22, 86, 67};
        System.out.println("Maximum Integer: " + findMax(arr1));

        Float[] arr2 = {25.4f, 96.3f, 39.5f, 73.9f, 59.1f};
        System.out.println("Maximum Float: " + findMax(arr2));
    }
}
