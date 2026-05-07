package Day3;

import java.util.Scanner;

public class Equations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = scan.nextInt();

        System.out.print("Enter number b: ");
        int b = scan.nextInt();

        System.out.print("Enter number c: ");
        int c = scan.nextInt();

        int result1 = a + b * c;
        int result2 = c + a / b;
        int result3 = a % b + c;
        int result4 = a * b + c;

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);

        int max = Math.max(Math.max(result1, result2), Math.max(result3, result4));

        int min = Math.min(Math.min(result1, result2), Math.min(result3, result4));

        System.out.println("Maximum: "+ max);
        System.out.println("Minimum: " + min);


    }
}
