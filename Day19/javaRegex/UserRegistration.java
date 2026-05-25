package javaRegex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    static Scanner sc = new Scanner(System.in);
    static String firstNameRegex = "^[A-Z][a-z]{2,}$";
    static String lastNameRegex = "^[A-Z][a-z]{2,}$";
    static String emailRegex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z]+\\.[a-zA-Z]+(\\.[a-zA-Z]+)?$";
    static String mobileRegex = "^[0-9]{2}\\s[0-9]{10}$";
    static String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}$";

    static String validate(String message, String regex, String error) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine();

            if (Pattern.matches(regex, input)) {
                return input;
            }

            System.out.println("Invalid Input.. try again");
            System.out.println(error);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String firstName = validate("Enter First Name: ", firstNameRegex, "First letter must be Capital and minimum 3 letters.");
        String lastName = validate("Enter Last Name: ", lastNameRegex, "First letter must be Capital and minimum 3 letters.");
        String email = validate("Enter Email: ", emailRegex, "Email format should be like abc@gmail.com");
        String mobile = validate("Enter Mobile Number: ", mobileRegex, "Format should be: 91 9876543210");
        String password = validate("Enter Password: ", passwordRegex, "Password must contain:\n" + "- Minimum 8 characters\n" +
                        "- At least 1 Uppercase\n" +
                        "- At least 1 Number\n" +
                        "- Exactly 1 Special Character"
        );

        System.out.println("\nRegistration Successful");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("Password: " + password);
    }
}