package Searching.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class TargetElementIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scan.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = scan.nextInt();

        Arrays.sort(arr);
        int idx = targetIndex(arr, target);
        
        if(idx != -1) {
            System.out.println(target + " is present at index " + idx);
        } else {
            System.out.println(target + " is not present.");
        }

    }

    public static int targetIndex(int arr[], int target) {
        int left = 0;
        int right = arr.length-1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid -1;
            }
        }
        return -1;
    }
}
