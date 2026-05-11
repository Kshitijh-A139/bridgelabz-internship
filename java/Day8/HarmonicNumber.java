package Day8;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scan.nextInt();

        double harmonic = 0.0;

        for(int i=1; i<=n; i++) {
            harmonic = harmonic + (1.0 / i);
        }
        System.out.println("Harmonic value: " + harmonic);
    }
}
