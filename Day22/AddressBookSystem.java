import java.util.HashMap;

public class AddressBookSystem {
    private HashMap<String, AddressBook2> addressBooks;

    public AddressBookSystem() {
        addressBooks = new HashMap<>();
    }

    public void addAddressBook(String name) {
        if (addressBooks.containsKey(name)) {
            System.out.println("Address Book Already Exists");
            return;
        }
        addressBooks.put(name, new AddressBook2(name));
    }

    public AddressBook2 getAddressBook(String name) {
        return addressBooks.get(name);
    }

    public void searchByCity(String city) {
        for (AddressBook2 book : addressBooks.values()) {
            for (Person person : book.getContacts()) {
                if (person.getCity().equalsIgnoreCase(city)) {
                    System.out.println(person);
                }
            }
        }
    }

    public void searchByState(String state) {
        for (AddressBook2 book : addressBooks.values()) {
            for (Person person : book.getContacts()) {
                if (person.getState().equalsIgnoreCase(state)) {
                    System.out.println(person);
                }
            }
        }
    }

    public void countByCity(String city) {
        int count = 0;
        for (AddressBook2 book : addressBooks.values()) {
            for (Person person : book.getContacts()) {
                if (person.getCity().equalsIgnoreCase(city)) {
                    count++;
                }
            }
        }
        System.out.println("Count : " + count);
    }

    public void countByState(String state) {
        int count = 0;
        for (AddressBook2 book : addressBooks.values()) {
            for (Person person : book.getContacts()) {
                if (person.getState().equalsIgnoreCase(state)) {
                    count++;
                }
            }
        }
        System.out.println("Count : " + count);
    }
}