package Day8;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input x and y
        System.out.print("Enter x value : ");
        int x = sc.nextInt();

        System.out.print("Enter y value : ");
        int y = sc.nextInt();

        // Calculate squares manually
        int xSquare = x * x;
        int ySquare = y * y;

        int sum = xSquare + ySquare;

        // Finding square root manually
        double distance = 0;

        for (double i = 0; i <= sum; i = i + 0.1) {

            if (i * i <= sum) {
                distance = i;
            }
        }

        System.out.println("Euclidean Distance = " + distance);

    }
}
