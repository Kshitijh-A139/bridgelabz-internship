package Day3;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scan.next().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u':
            case 'A', 'E', 'I', 'O', 'U':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
        }
    }
}
