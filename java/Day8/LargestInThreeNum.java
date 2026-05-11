package Day8;

import java.util.Scanner;

public class LargestInThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter first number : ");
        a = sc.nextInt();

        System.out.print("Enter second number : ");
        b = sc.nextInt();

        System.out.print("Enter third number : ");
        c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is largest");
        }
        else if (b >= a && b >= c) {
            System.out.println(b + " is largest");
        }
        else {
            System.out.println(c + " is largest");
        }
    }
}
