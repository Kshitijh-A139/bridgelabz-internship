package Day8;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        // Check command-line argument
        int N = Integer.parseInt(args[0]);

        // Check valid range
        if (N < 0 || N >= 31) {
            System.out.println("Enter value between 0 and 30");
            return;
        }

        int power = 1;

        System.out.println("Powers of 2:");

        for (int i = 1; i <= N; i++) {

            System.out.println("2 * " + i + " = " + power);

            power = power * 2;
        }
    }
}
