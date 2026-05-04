import java.util.*;

public class CountAlphabets {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = scan.nextLine();

    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (Character.isLetter(ch)) {
        count++;
      }
    }
    System.out.println("Number of alphabets in the string: " + count);
  }
}
