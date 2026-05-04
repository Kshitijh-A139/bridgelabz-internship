import java.util.*;

public class VowelConsonant {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = scan.nextLine();

    int vowels = 0;
    int consonants = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
          ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        vowels++;
      } else if (Character.isLetter(ch)) {
        consonants++;
      }
    }
    System.out.println("Number of vowels: " + vowels);
    System.out.println("Number of consonants: " + consonants);
  }

}
