import java.util.Scanner;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager manager = new ContactManager(); // Acess Contact Manager
        manager.loadContactsFromFile("contacts.txt");   // Load contacts on startup

        boolean running = true;

        while (running) {
            System.out.println("\nPersonal Contact Manager:");
            System.out.println("[1] Add Contact");
            System.out.println("[2] View All Contacts");
            System.out.println("[3] Search Contact by Name");
            System.out.println("[4] Exit and Save");
            System.out.print("Select an option: ");

            // Input Placeholder
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    // Inputs
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(name, phone, email); // Instantiate new Contact
                    manager.addContact(contact);  // Add the data in the contact
                    System.out.println("Contact added successfully.");
                    break;

                case "2":
                    // List of Contact
                    List<Contact> contacts = manager.getAllContacts();
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts found.");
                    } else {
                        System.out.println("\n--- Contact List ---");
                        for (Contact c : contacts) {
                            System.out.println(c);
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case "3":
                    // Search Name
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    Contact result = manager.searchByName(searchName);
                    if (result != null) {
                        System.out.println("Found: " + result);
                    } else {
                        System.out.println("No contact found with that name.");
                    }
                    break;

                case "4":
                    // Save and Exit
                    manager.saveContactsToFile("contacts.txt");
                    System.out.println("Contacts saved. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");

            }
        }
        scanner.close();
    }
}
