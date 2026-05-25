package Searching.BinarySearch;

import java.util.Scanner;

public class SmallestElementIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scan.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int left = 0, right = n-1;
        while(left < right) {
            int mid = (left + right) / 2;

            if(arr[mid] > arr[right]) {
                left = mid+1;
            } else if(arr[mid] < arr[right]) {
                right = mid;
            }
        }

        System.out.println("Smallest element is " + arr[left] + " at index " + left);
    }
}
