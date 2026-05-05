import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter 2nd string: ");
        String str2 = scan.nextLine();

        if(str1.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}
