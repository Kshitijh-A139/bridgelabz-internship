package Day3;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter month: ");
        int m = scan.nextInt();

        System.out.print("Enter day: ");
        int d = scan.nextInt();

        boolean isSpring = false;

        if((m == 3 && d == 20) || (m == 4) || (m == 5) || (m == 6 && d == 20)) {
            isSpring = true;
        }

        System.out.println(isSpring);
    }
}
