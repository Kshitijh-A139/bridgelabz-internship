import java.util.Scanner;

public class MaxMin {
    public static <Obj extends Comparable<Obj>> Obj findMax(Obj a, Obj b, Obj c) {
        Obj max = a;

        if(b.compareTo(max) > 0) {
            max = b;
        }

        if(c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Maximum - Minimum of 3 variables:");
        System.out.println("1. Integer variables");
        System.out.println("2. float variables");
        System.out.println("3. String variables");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter 3 values: ");
                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = scan.nextInt();

                System.out.println("Maximum value: " + findMax(a, b, c));

                break;

            case 2:
                System.out.println("Enter 3 values:");
                float m = scan.nextFloat();
                float n = scan.nextFloat();
                float o = scan.nextFloat();

                System.out.println("Maximum value: " + findMax(m, n, o));

                break;

            case 3:
                System.out.println("Enter 3 values:");
                String p = scan.nextLine();
                String q = scan.nextLine();
                String r = scan.nextLine();

                System.out.println("Maximum value: " + findMax(p, q, r));

                break;

            default:
                System.out.println("Invalid choice.");

        }
    }
}
