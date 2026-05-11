package Day8;

import java.util.Scanner;

class PrimeFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        System.out.println("Prime Factors:");

        for (int i = 2; i * i <= n; i++) {

            while (n % i == 0) {

                System.out.println(i);

                n = n / i;
            }
        }

        if (n > 2) {
            System.out.println(n);
        }

        sc.close();
    }
}