import java.util.*;

public class AddressBookMain {
  String firstName;
  String lastName;
  String address;
  String city;
  String state;
  String zip;
  String phoneNumber;
  String email;

  void addContact(Scanner scan) {
    System.out.print("Enter First Name: ");
    firstName = scan.next();

    System.out.print("Enter Last Name: ");
    lastName = scan.next();

    scan.nextLine();

    System.out.print("Enter Address: ");
    address = scan.nextLine();

    System.out.print("Enter City: ");
    city = scan.nextLine();

    System.out.print("Enter State: ");
    state = scan.nextLine();

    System.out.print("Enter Zip: ");
    zip = scan.nextLine();

    System.out.print("Enter Phone Number: ");
    phoneNumber = scan.nextLine();

    System.out.print("Enter Email: ");
    email = scan.next();

    System.out.println("Contact Added Successfully!");
  }

  void displayContact() {
    if (firstName != null) {
      System.out.println("No contact found.");
    }

    System.out.println("First Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Address: " + address);
    System.out.println("City: " + city);
    System.out.println("State: " + state);
    System.out.println("Zip: " + zip);
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("Email: " + email);
  }

  void editContact(Scanner scan) {
    System.out.print("Enter new First Name: ");
    firstName = scan.next();

    System.out.print("Enter new Last Name: ");
    lastName = scan.next();

    scan.nextLine();

    System.out.print("Enter new Address: ");
    address = scan.nextLine();

    System.out.print("Enter new City: ");
    city = scan.nextLine();

    System.out.print("Enter new State: ");
    state = scan.nextLine();

    System.out.print("Enter new Zip: ");
    zip = scan.nextLine();

    System.out.print("Enter new Phone Number: ");
    phoneNumber = scan.nextLine();

    System.out.print("Enter new Email: ");
    email = scan.next();

    System.out.println("Contact Edited Successfully!");
  }

  void deleteContact() {
    firstName = null;
    lastName = null;
    address = null;
    city = null;
    state = null;
    zip = null;
    phoneNumber = null;
    email = null;

    System.out.println("Contact Deleted Successfully!");
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    AddressBookMain person = new AddressBookMain();

    int choice;

    do {
      System.out.println("Welcome to Address Book Program.");
      System.out.println("1. Add Contact");
      System.out.println("2. Display Contact");
      System.out.println("3. Edit Contact");
      System.out.println("4. Delete Contact");
      System.out.println("5. Exit");

      System.out.print("Enter your choice: ");
      choice = scan.nextInt();

      switch (choice) {
        case 1:
          person.addContact(scan);
          break;
        case 2:
          person.displayContact();
          break;
        case 3:
          person.editContact(scan);
          break;
        case 4:
          person.deleteContact();
          break;
        case 5:
          System.out.println("Exiting contact...");
          break;

        default:
          System.out.println("Invalid choice. Please try again.");
      }
    } while (choice != 5);
  }
}
