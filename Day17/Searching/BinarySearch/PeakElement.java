package Searching.BinarySearch;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scan.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int left = 0, right = arr.length-1;
        while (left < right) {
            int mid = (left + right) / 2;

            if((arr[mid] > arr[mid-1]) && (arr[mid] > arr[mid+1]))
            {
                System.out.println("Peak element is " + arr[mid]);
                return;
            }

            if(arr[mid] < arr[mid-1]) {
                right = mid-1;
            } else if(arr[mid] > arr[mid+1]) {
                left = mid+1;
            }
        }
    }
}
