package Day3;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int original = n;
        int rev = 0;

        for(; n!= 0; n /= 10) {
            int digit = n % 10;
            rev = rev * 10 + digit;
        }

        if(original == rev) {
            System.out.println("Number is palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }

    }
}
