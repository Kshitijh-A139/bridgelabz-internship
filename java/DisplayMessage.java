import java.util.Scanner;

public class DisplayMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String str = scan.nextLine();
        System.out.println("You have entered: " + str);
    }
}
