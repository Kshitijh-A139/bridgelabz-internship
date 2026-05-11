package Day8;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scan.nextInt();

        if(year < 0000 && year > 9999) {
            System.out.print("Try again\nEnter a valid year: ");
            return;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It is a leap year.");
        } else {
            System.out.println("Not a leap year.");
        }
    }
}