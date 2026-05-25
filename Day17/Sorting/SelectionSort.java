package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {70, 90, 95, 85, 79, 80};
        selectionSort(arr);
        System.out.println("After selection sort: " + Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]) {
        int n =arr.length;

        for(int i=0; i<n-1; i++) {
            int min = i;
            for (int j=1+1; j<n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
