package Sorting;

import java.util.Arrays;

public class InsertionSrt {
    public static void main(String[] args) {
        int arr[] = {70, 90, 95, 85, 79, 80};
        insertionSort(arr);
        System.out.println("After insertion sort: " + Arrays.toString(arr));
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
