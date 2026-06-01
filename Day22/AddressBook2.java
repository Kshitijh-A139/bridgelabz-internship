import java.util.ArrayList;

public class AddressBook2 {
    private String name;
    private ArrayList<Person> contacts;
    public AddressBook2(String name) {
        this.name = name;
        contacts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Person> getContacts() {
        return contacts;
    }

    public void addContact(Person person) {
        for (Person p : contacts) {
            if (p.getFirstName().equalsIgnoreCase(person.getFirstName())
                    && p.getLastName().equalsIgnoreCase(person.getLastName())) {
                System.out.println("Duplicate Contact Found");
                return;
            }
        }
        contacts.add(person);
    }

    public void editContact(String firstName, String lastName, Person updatedPerson) {
        for (Person person : contacts) {
            if (person.getFirstName().equalsIgnoreCase(firstName)
                    && person.getLastName().equalsIgnoreCase(lastName)) {

                person.setAddress(updatedPerson.getFullName());
                person.setCity(updatedPerson.getCity());
                person.setState(updatedPerson.getState());
                System.out.println("Contact Updated");
                return;
            }
        }
        System.out.println("Contact Not Found");
    }

    public void deleteContact(String firstName, String lastName) {
        for (int i = 0; i < contacts.size(); i++) {
            Person person = contacts.get(i);
            if (person.getFirstName().equalsIgnoreCase(firstName)
                    && person.getLastName().equalsIgnoreCase(lastName)) {
                contacts.remove(i);
                System.out.println("Contact Deleted");
                return;
            }
        }
    }

    public void displayContacts() {
        for (Person person : contacts) {
            System.out.println(person);
        }
    }
}