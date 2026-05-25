package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int arr[] = {70, 90, 95, 85, 79, 80};
        countingSort(arr);
        System.out.println("After Counting Sort: " + Arrays.toString(arr));
    }

    public static void countingSort(int arr[]) {
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        int count[] = new int[max + 1];

        for (int num : arr) {
            count[num]++;
        }

        int index = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}
