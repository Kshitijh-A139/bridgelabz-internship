package Searching.BinarySearch;

import java.util.Scanner;

public class FirstLastOccurence {
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

        int first = firstOccurance(arr, target);
        int last = lastOccurence(arr, target);
        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);

    }

    public static int firstOccurance(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if(arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static int lastOccurence(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
