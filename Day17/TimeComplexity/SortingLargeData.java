package TimeComplexity;

import java.util.Arrays;

public class SortingLargeData {
    public static void main(String[] args) {
        int arr[] = {45, 23, 78, 12, 89, 1, 56, 90};

        int bubbleArr[] = arr.clone();
        int mergeArr[] = arr.clone();
        int quickArr[] = arr.clone();

        long bubbleStart = System.nanoTime();
        bubbleSort(bubbleArr);
        long bubbleEnd = System.nanoTime();

        long mergeStart = System.nanoTime();
        Arrays.sort(mergeArr);
        long mergeEnd = System.nanoTime();

        long quickStart = System.nanoTime();
        quickSort(quickArr, 0, quickArr.length - 1);
        long quickEnd = System.nanoTime();

        System.out.println("Bubble Sort Time: " + (bubbleEnd - bubbleStart) + " ns");
        System.out.println("Merge Sort Time: " + (mergeEnd - mergeStart) + " ns");
        System.out.println("Quick Sort Time: " + (quickEnd - quickStart) + " ns");
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
