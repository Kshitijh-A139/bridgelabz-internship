public class Main {
    public static void main(String[] args) {
        AddressBookSystem system = new AddressBookSystem();
        system.addAddressBook("Family");
        system.addAddressBook("Friends");
        AddressBook2 family = system.getAddressBook("Family");

        family.addContact(
                new Person(
                        "Kshitijh",
                        "Agarwal",
                        "MG Road",
                        "Bangalore",
                        "Karnataka",
                        "560001",
                        "9876543210",
                        "kshitijh@gmail.com"));

        family.addContact(
                new Person(
                        "Rahul",
                        "Sharma",
                        "BTM",
                        "Bangalore",
                        "Karnataka",
                        "560076",
                        "9876543200",
                        "rahul@gmail.com"));

        family.displayContacts();
        System.out.println("\nSearch By City");
        system.searchByCity("Bangalore");
        System.out.println("\nSearch By State");
        system.searchByState("Karnataka");
        System.out.println("\nCount By City");
        system.countByCity("Bangalore");
        System.out.println("\nCount By State");
        system.countByState("Karnataka");
    }
}