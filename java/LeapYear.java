import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {   // loop runs continuously

            System.out.print("Enter a year: ");
            int year = scan.nextInt();

            // check valid range
            if (year < 1582) {
                System.out.println("Year should be greater or equal to 1582");
                continue; // ask again
            }

            boolean isLeap = false;

            if (year % 400 == 0) {
                isLeap = true;
            } else if (year % 100 == 0) {
                isLeap = false;
            } else if (year % 4 == 0) {
                isLeap = true;
            }

            if (isLeap) {
                System.out.println(year + " is a leap year");
                break; // stop program when leap year found
            } else {
                System.out.println(year + " is not a leap year");
                System.out.println("Try again...\n");
            }
        }

        scan.close();
    }
}