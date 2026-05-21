package Searching.LinearSearch;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scan.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        boolean[] visited = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0 && arr[i] <= n) {
                visited[arr[i]] = true;
            }
        }

        for (int i=1; i<=n; i++) {
            if(!visited[i]) {
                System.out.print("Missing number is: " + i);
            }
        }
    }
}
