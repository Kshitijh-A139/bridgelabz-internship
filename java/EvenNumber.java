import java.util.*;

public class EvenNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a number: ");
      int n1 = sc.nextInt();

      if (n1 % 2 == 0) {
        System.out.println("Even Number");
        break;
      } else {
        System.out.println("Odd Number, try again...");
      }
    }

    sc.close();
  }
}