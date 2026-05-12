package Day8;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter M number for row and N number for column.");
        System.out.print("M: ");
        int M = scan.nextInt();

        System.out.print("N: ");
        int N = scan.nextInt();

        int arr[][] = new int[M][N];

        System.out.print("Enter elements of array: ");
        for(int i=0; i<M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scan.nextInt();
            }
        }


        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                pw.print(arr[i][j] + " ");
            }
            pw.println();
        }
        pw.close();
    }
}
