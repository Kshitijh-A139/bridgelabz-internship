package Day3;

import java.util.Scanner;

public class ReverseForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        int rev = 0;

        for (; n != 0; n /= 10) {
            int digit = n % 10;
            rev = rev * 10 + digit;
        }

        System.out.println("Reverse number: " + rev);
    }
}
