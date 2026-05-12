package Day8;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("It is a prime number.");
        } else {
            System.out.println("It is not a prime number.");
        }
    }
}
