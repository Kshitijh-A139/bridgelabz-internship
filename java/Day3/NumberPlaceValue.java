package Day3;

import java.util.Scanner;

public class NumberPlaceValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scan.nextInt();

        if(n == 1) {
            System.out.println("Unit");
        } else if (n == 10) {
            System.out.println("Ten");
        } else if (n == 100) {
            System.out.println("Hundred");
        } else if (n == 1000) {
            System.out.println("Thousand");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
