package Day3;

import java.util.Scanner;

public class SumForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++) {
            sum += i;
        }
        System.out.println("Sum of " + n + " natural numbers: " + sum);
    }
}
