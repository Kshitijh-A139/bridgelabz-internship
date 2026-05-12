package Day8;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter start time: ");
        int startTime = scan.nextInt();

        System.out.print("Enter end time: ");
        int endTime = scan.nextInt();

        int timeElapsed = endTime - startTime;

        System.out.println("Time elapsed: " + timeElapsed + " seconds.");

    }
}
