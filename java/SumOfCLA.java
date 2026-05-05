import java.util.Scanner;

public class SumOfCLA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int invalidCount = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                int num = Integer.parseInt(args[i]);
                sum = sum + num;
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Sum of invalid input: " + invalidCount);
        System.out.println("Sum of valid inputs: " + sum);

    }
}
