import java.util.*;

public class Palindrome {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a word: ");
      String str = scan.nextLine();
      String rev = new StringBuilder(str).reverse().toString();
      if (str.equals(rev)) {
        System.out.println("String is palindrome");
        break;
      } else {
        System.out.println("String is not palindrome, try again..");
      }
    }
  }
}
