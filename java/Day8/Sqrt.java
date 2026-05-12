package Day8;

import java.util.Scanner;

class SqrtUtil {

    static void sqrt(double c) {

        double t = c;

        double epsilon = 0.0001;

        while((t - c/t) > epsilon || (c/t - t) > epsilon) {

            t = (c/t + t) / 2;
        }

        System.out.println("Square Root: " + t);
    }
}

public class Sqrt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number: ");

        double c = scan.nextDouble();

        SqrtUtil.sqrt(c);

        scan.close();
    }
}