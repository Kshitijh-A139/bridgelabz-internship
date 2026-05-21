package Searching.BinarySearch;

import java.util.Scanner;

public class TargetInMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 2D array size: ");
        System.out.print("\nEnter row size: ");
        int m = scan.nextInt();
        System.out.print("Enter column size: ");
        int n = scan.nextInt();
        int arr[][] = new int[m][n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
            scan.nextLine();
        }

        System.out.print("Enter the target value: ");
        int target = scan.nextInt();

        if(binarySearch(arr, target, m, n)) {
            System.out.print(target + " is present in the matrix");
        } else {
            System.out.print(target + " is not present in the matrix.");
        }
    }

    public static boolean binarySearch(int arr[][], int target, int m, int n) {
        int left = 0, right = (m * n) - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            int row = mid / n;
            int col = mid % n;

            if(arr[row][col] == target) {
                return true;
            }

            if(arr[row][col] > target) {
                right = mid - 1;
            } else if (arr[row][col] < target) {
                left = mid + 1;
            }

            }
        return false;
    }

    }

