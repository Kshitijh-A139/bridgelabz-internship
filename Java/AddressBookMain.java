import java.util.*;

public class AddressBookMain {
  public static String firstName;
  public static String lastName;
  public static String address;
  public static String city;
  public static String state;
  public static int zip;
  public static long phoneNumber;
  public static String email;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to Address book program.");

    ArrayList<Contact> contactList = new ArrayList<>();
    int choice;

    do {
      System.out.println("Enter number to perform operations:");
      System.out.println("1. Add contact");
      System.out.println("2. Edit contact");
      System.out.println("3. Delete contact");
      System.out.println("4. Display contact");
      System.out.println("5. Exit");
      choice = scan.nextInt();

      switch (choice) {
        case 1: // ADD CONTACT

          System.out.print("Enter first name: ");
          firstName = scan.next();

          System.out.print("Enter last name: ");
          lastName = scan.next();

          scan.nextLine();

          System.out.print("Enter address: ");
          address = scan.nextLine();

          System.out.print("Enter city: ");
          city = scan.nextLine();

          System.out.print("Enter state: ");
          state = scan.nextLine();

          System.out.print("Enter zip: ");
          zip = scan.nextInt();

          System.out.print("Enter email: ");
          email = scan.next();

          System.out.print("Enter phone number: ");
          phoneNumber = scan.nextLong();

          Contact person = new Contact(
              firstName,
              lastName,
              address,
              city,
              state,
              zip,
              email,
              phoneNumber);

          contactList.add(person);
          System.out.println("Contact added successfully.");
          break;

        case 2: // EDIT CONTACT
          System.out.print("Enter first name: ");
          String editFirstName = scan.next();

          boolean found = false;
          for (Contact contact : contactList) {
            if (contact.firstName.equals(editFirstName)) {
              found = true;
              System.out.print("Enter new last name: ");
              String editLastName = scan.next();

              System.out.print("Enter new address: ");
              String editAddress = scan.nextLine();

              System.out.print("Enter new city: ");
              String editCity = scan.nextLine();

              System.out.print("Enter new state: ");
              String editState = scan.nextLine();

              System.out.print("Enter new zip: ");
              int editZip = scan.nextInt();

              System.out.print("Enter new email: ");
              String editEmail = scan.next();

              System.out.print("Enter new phone number: ");
              long editPhoneNumber = scan.nextLong();
            }
          }

          if (!found) {
            System.out.println("Contact not found.");
          }

          break;

        case 3: // DELETE CONTACT
          System.out.print("Enter first name: ");
          String deleteFirstName = scan.next();

          boolean isDeleted = false;
          Iterator<Contact> iterator = contactList.iterator();
          while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.firstName.equals(deleteFirstName)) {
              iterator.remove();
              isDeleted = true;
              System.out.println("Contact deleted successfully.");
              break;
            }
          }

          if (!isDeleted) {
            System.out.println("Contact not found.");
          }

          break;

        case 4: // DISPLAY CONTACT
          System.out.print("Enter first name: ");
          String displayFirstName = scan.next();

          boolean isDisplayed = false;

          for (Contact contact : contactList) {

            if (contact.firstName.equals(displayFirstName)) {

              contact.displayContact();
              isDisplayed = true;
              break;
            }
          }

          if (!isDisplayed) {
            System.out.println("Contact not found.");
          }

          break;

        case 5: // EXIT
          System.out.println("Exiting the program.");
          break;

        default:
          System.out.println("Invalid choice. Please try again.");
          break;
      }
    } while (choice != 5);
  }
}

class Contact {
  String firstName;
  String lastName;
  String address;
  String city;
  String state;
  int zip;
  long phoneNumber;
  String email;

  public Contact(String firstName, String lastName, String address, String city, String state, int zip, String email,
      long phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public void displayContact() {
    System.out.println("Contact Details: ");
    System.out.println("First Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Address: " + address);
    System.out.println("City: " + city);
    System.out.println("State: " + state);
    System.out.println("Zip: " + zip);
    System.out.println("Email: " + email);
    System.out.println("Phone Number: " + phoneNumber);
  }
}