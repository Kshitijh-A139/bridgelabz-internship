import java.util.*;

class Contact {
  String firstName, lastName, address, city, state, email;
  int zip;
  long phoneNumber;

  Contact(String firstName, String lastName, String address, String city,
      String state, int zip, long phoneNumber, String email) {

    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  void display() {
    System.out.println("\nFirst Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Address: " + address);
    System.out.println("City: " + city);
    System.out.println("State: " + state);
    System.out.println("Zip: " + zip);
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("Email: " + email);
  }
}

class AddressBook {
  ArrayList<Contact> contacts = new ArrayList<>();

  void addContact(Contact person) {
    contacts.add(person);
    System.out.println("Contact Added Successfully!");
  }

  void displayContacts() {
    if (contacts.isEmpty()) {
      System.out.println("No Contacts Found!");
      return;
    }

    for (Contact person : contacts) {
      person.display();
    }
  }

  void editContact(String firstName, Scanner scan) {

    for (Contact person : contacts) {

      if (person.firstName.equalsIgnoreCase(firstName)) {

        System.out.print("Enter New Last Name: ");
        person.lastName = scan.nextLine();

        System.out.print("Enter New Address: ");
        person.address = scan.nextLine();

        System.out.print("Enter New City: ");
        person.city = scan.nextLine();

        System.out.print("Enter New State: ");
        person.state = scan.nextLine();

        System.out.print("Enter New Zip: ");
        person.zip = scan.nextInt();

        System.out.print("Enter New Phone Number: ");
        person.phoneNumber = scan.nextLong();

        scan.nextLine();

        System.out.print("Enter New Email: ");
        person.email = scan.nextLine();

        System.out.println("Contact Updated Successfully!");
        return;
      }
    }

    System.out.println("Contact Not Found!");
  }

  void deleteContact(String firstName) {

    for (Contact person : contacts) {

      if (person.firstName.equalsIgnoreCase(firstName)) {
        contacts.remove(person);
        System.out.println("Contact Deleted Successfully!");
        return;
      }
    }

    System.out.println("Contact Not Found!");
  }
}

public class AddressBookMain2 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    HashMap<String, AddressBook> addressBookMap = new HashMap<>();
    int choice;

    System.out.println("Welcome To Address Book Program");

    do {
      System.out.println("\n1.Create Address Book");
      System.out.println("2.Add Contact");
      System.out.println("3.Display Contacts");
      System.out.println("4.Edit Contact");
      System.out.println("5.Delete Contact");
      System.out.println("6.Exit");

      System.out.print("Enter Your Choice: ");
      choice = scan.nextInt();
      scan.nextLine();

      if (choice == 1) {

        System.out.print("Enter Address Book Name: ");
        String bookName = scan.nextLine();

        if (addressBookMap.containsKey(bookName)) {
          System.out.println("Address Book Already Exists!");
        } else {
          addressBookMap.put(bookName, new AddressBook());
          System.out.println("Address Book Created Successfully!");
        }
      }

      else if (choice == 2) {

        System.out.print("Enter Address Book Name: ");
        String bookName = scan.nextLine();

        AddressBook book = addressBookMap.get(bookName);

        if (book == null) {
          System.out.println("Address Book Not Found!");
        }

        else {
          System.out.print("Enter First Name: ");
          String firstName = scan.nextLine();

          System.out.print("Enter Last Name: ");
          String lastName = scan.nextLine();

          System.out.print("Enter Address: ");
          String address = scan.nextLine();

          System.out.print("Enter City: ");
          String city = scan.nextLine();

          System.out.print("Enter State: ");
          String state = scan.nextLine();

          System.out.print("Enter Zip: ");
          int zip = scan.nextInt();

          System.out.print("Enter Phone Number: ");
          long phoneNumber = scan.nextLong();

          scan.nextLine();

          System.out.print("Enter Email: ");
          String email = scan.nextLine();

          book.addContact(new Contact(firstName, lastName, address,
              city, state, zip, phoneNumber, email));
        }
      }

      else if (choice == 3) {

        System.out.print("Enter Address Book Name: ");
        String bookName = scan.nextLine();

        AddressBook book = addressBookMap.get(bookName);

        if (book == null) {
          System.out.println("Address Book Not Found!");
        } else {
          book.displayContacts();
        }
      }

      else if (choice == 4) {

        System.out.print("Enter Address Book Name: ");
        String bookName = scan.nextLine();

        AddressBook book = addressBookMap.get(bookName);

        if (book == null) {
          System.out.println("Address Book Not Found!");
        } else {
          System.out.print("Enter First Name To Edit: ");
          book.editContact(scan.nextLine(), scan);
        }
      }

      else if (choice == 5) {

        System.out.print("Enter Address Book Name: ");
        String bookName = scan.nextLine();

        AddressBook book = addressBookMap.get(bookName);

        if (book == null) {
          System.out.println("Address Book Not Found!");
        } else {
          System.out.print("Enter First Name To Delete: ");
          book.deleteContact(scan.nextLine());
        }
      }

      else if (choice == 6) {
        System.out.println("Exiting Program...");
      }

      else {
        System.out.println("Invalid Choice!");
      }

    } while (choice != 6);

    scan.close();
  }
}