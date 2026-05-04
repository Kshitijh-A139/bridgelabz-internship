import java.util.*;

public class OddNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a number: ");
      int n = scan.nextInt();

      if (n % 2 != 0) {
        System.out.println("Odd Number");
        break;
      } else {
        System.out.println("Even Number, try again...");
      }
    }
  }
}
