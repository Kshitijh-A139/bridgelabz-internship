package Searching.LinearSearch;

import java.util.Scanner;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int idx = linearSearch(arr, n);
        System.out.println("Element found at index: " + idx);
    }

    public static int linearSearch(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}
