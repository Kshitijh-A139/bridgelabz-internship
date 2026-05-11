package Day8;

import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many times the coin should be flipped? ");
        int numOfTimes = scan.nextInt();

        if(numOfTimes <= 0) {
            System.out.println("Enter a valid number greater than 0");
            return;
        }
        int head = 0, tail = 0;

        for (int i = 0; i < numOfTimes; i++) {
            double randomValue = Math.random();

            if(randomValue < 0.5) {
                tail++;
            } else {
                head++;
            }
        }

        double headPercentage = (head * 100) / numOfTimes;
        double tailPercentage = (tail * 100) / numOfTimes;

        System.out.println("Total heads: " + head);
        System.out.println("Total tails: " + tail);

        System.out.println("Heads percentage: " + headPercentage);
        System.out.println("Tails percentage: " + tailPercentage);
    }
}
