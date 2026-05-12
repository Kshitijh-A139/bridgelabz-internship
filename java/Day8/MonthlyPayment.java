package Day8;

import java.util.Scanner;

class PaymentUtil {

    static void monthlyPayment(double P, double Y, double R) {

        double n = 12 * Y;

        double r = R / (12 * 100);

        double power = 1;

        for(int i = 1; i <= n; i++) {

            power = power * (1 + r);
        }

        double payment = (P * r * power) / (power - 1);

        System.out.println("Monthly Payment: " + payment);
    }
}

public class MonthlyPayment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double P = scan.nextDouble();

        System.out.print("Enter Years: ");
        double Y = scan.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double R = scan.nextDouble();

        PaymentUtil.monthlyPayment(P, Y, R);

        scan.close();
    }
}
