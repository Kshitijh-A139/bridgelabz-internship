package Day8;

import java.util.Scanner;

class Util {
    static int dayOfWeek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

}

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter month: ");
        int m = scan.nextInt();

        System.out.print("Enter day: ");
        int d = scan.nextInt();

        System.out.print("Enter year: ");
        int y = scan.nextInt();

        int result = Util.dayOfWeek(m, d, y);

        System.out.print("Day number: " + result);

        String day[] = {
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday"
        };

        System.out.println("Day: " + day[result]);
    }

}
