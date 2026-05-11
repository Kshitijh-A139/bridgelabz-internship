package Day8;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature : ");
        double t = sc.nextDouble();

        System.out.print("Enter wind speed : ");
        double v = sc.nextDouble();

        // Check valid range
        if (t > 50 || v > 120 || v < 3) {

            System.out.println("Invalid Input");

        } else {

            // Calculate v^0.16 manually
            double power = 1;

            for (double i = 1; i <= 16; i++) {
                power = power * v;
            }

            // Approximate 16th root
            power = power / 1000000000000000.0;

            double w = 35.74
                    + (0.6215 * t)
                    + ((0.4275 * t) - 35.75) * power;

            System.out.println("Wind Chill = " + w);
        }

    }
}
