package Day3;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        double distance = Math.sqrt(
                Math.pow(x, 2) + Math.pow(y, 2)
        );

        System.out.println("Euclidean Distance = " + distance);

        sc.close();
    }
}