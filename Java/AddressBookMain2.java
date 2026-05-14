import java.util.*;

class Contact {
  String firstName;
  String lastName;
  String address;
  String city;
  String state;
  int zip;
  long phoneNumber;
  String email;

  Contact(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber,
      String email) {
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
    System.out.println("First Name: " + firstName);
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
  ArrayList<Contact> contact = new ArrayList<>();

  void addContact(Contact person) {
    contact.add(person);
    System.out.println("Contact Added Successfully");
  }

  void display() {
    if (contact.isEmpty()) {
      System.out.println("No contact found.");
      return;
    }

    for (Contact person : contact) {
      person.display();
    }
  }

  void editContact(String firstName, Scanner scan) {
    for (Contact person : contact) {
      if (person.firstName.equals(firstName)) {
        scan.nextLine();

        System.out.print("Enter new Last Name: ");
        person.lastName = scan.nextLine();

        System.out.print("Enter new Address: ");
        person.address = scan.nextLine();

        System.out.print("Enter new City: ");
        person.city = scan.nextLine();

        System.out.print("Enter new State: ");
        person.state = scan.nextLine();

        System.out.print("Enter new Zip: ");
        person.zip = scan.nextInt();

        System.out.print("Enter new Phone Number: ");
        person.phoneNumber = scan.nextLong();

        scan.nextLine();

        System.out.print("Enter new Email: ");
        person.email = scan.next();

        System.out.println("Contact Updated Successfully!");
        return;

      }
    }

    System.out.println("Contact not found.");
  }

  void deleteContact(String firstName) {
    for (Contact person : contact) {
      if (person.firstName.equals(firstName)) {
        contact.remove(person);
        System.out.println("Contact Deleted Successfully!");
        return;
      }
    }

    System.out.println("Contact not found.");
  }
}

public class AddressBookMain2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    HashMap<String, AddressBook> addressBook = new HashMap<>();

    System.out.println("Welcome to Address Book Program");

    int choice;

    do {
      System.out.println("1. Create Address Book");
      System.out.println("2. Add Contact");
      System.out.println("3. Display Contacts");
      System.out.println("4. Edit Contact");
      System.out.println("5. Delete Contact");
      System.out.println("6. Exit");

      System.out.print("Enter your choice: ");
      choice = scan.nextInt();

      switch (choice) {
        case 1:
          scan.nextLine();
          System.out.print("Enter Address Book Name: ");
          String bookName = scan.nextLine();

          if (addressBook.containsKey(bookName)) {
            System.out.println("Address Book already exists.");
          } else {
            addressBook.put(bookName, new AddressBook());
            System.out.println("Address Book created successfully.");
          }
          break;

        case 2:
          scan.nextLine();
          System.out.print("Enter Address Book Name: ");
          bookName = scan.nextLine();
          AddressBook addAddressBook = addressBook.get(addressBook);

          if (addAddressBook == null) {

            System.out.println("Address Book Not Found!");
            break;
          }

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

          Contact person = new Contact(
              firstName,
              lastName,
              address,
              city,
              state,
              zip,
              phoneNumber,
              email);

          addAddressBook.addContact(person);

          break;

        // Display
        case 3:

          scan.nextLine();

          System.out.print("Enter Address Book Name: ");
          String displayBook = scan.nextLine();

          AddressBook displayAddressBook = addressBook.get(displayBook);

          if (displayAddressBook == null) {

            System.out.println("Address Book Not Found!");
          }

          else {

            displayAddressBook.display();
          }

          break;

        case 4:

          scan.nextLine();
          System.out.print("Enter Address Book Name: ");
          String editBook = scan.nextLine();
          AddressBook editAddressBook = addressBook.get(editBook);

          if (editAddressBook == null) {
            System.out.println("Address Book Not Found!");
            break;
          }

          System.out.print("Enter First Name to Edit: ");
          String editName = scan.nextLine();

          editAddressBook.editContact(editName, scan);

          break;

        // UC4
        case 5:

          scan.nextLine();

          System.out.print("Enter Address Book Name: ");
          String deleteBook = scan.nextLine();

          AddressBook deleteAddressBook = addressBook.get(deleteBook);

          if (deleteAddressBook == null) {

            System.out.println("Address Book Not Found!");
            break;
          }

          System.out.print("Enter First Name to Delete: ");
          String deleteName = scan.nextLine();

          deleteAddressBook.deleteContact(deleteName);

          break;

        case 6:

          System.out.println("Exiting Program...");
          break;

        default:

          System.out.println("Invalid Choice!");
      }

    } while (choice != 6);

    scan.close();
  }
}
