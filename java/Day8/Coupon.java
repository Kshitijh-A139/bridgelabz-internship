package Day8;

import java.util.Scanner;

public class Coupon {
    static int getCoupons(int N) {
        return (int)(Math.random() * N);
    }

    static int collectCoupons(int N) {
        boolean collected[] = new boolean[N];

        int distinct = 0;
        int total = 0;

        while (distinct < N) {
            int coupon = getCoupons(N);
            total++;

            if(collected[coupon] == false) {
                collected[coupon] = true;
                distinct++;

                System.out.println("Collected coupon: " + coupon);
            }
        }
        return total;


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter distinct coupon number: ");
        int N = scan.nextInt();

        int randomNumber = collectCoupons(N);

        System.out.println("Total coupon generated: " + randomNumber);
    }
}
