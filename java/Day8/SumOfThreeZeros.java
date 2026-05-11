package Day8;

import java.util.Scanner;

public class SumOfThreeZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements :");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int count = 0;

        System.out.println("\nTriplets whose sum is zero:");

        // Cubic running time
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                for (int k = j + 1; k < n; k++) {

                    // Check sum equals zero
                    if (arr[i] + arr[j] + arr[k] == 0) {

                        System.out.println(
                                arr[i] + " "
                                        + arr[j] + " "
                                        + arr[k]);

                        count++;
                    }
                }
            }
        }

        System.out.println("\nTotal Triplets = " + count);
    }
}
