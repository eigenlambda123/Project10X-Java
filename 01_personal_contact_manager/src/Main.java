import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager manager = new ContactManager(); // Acess Contact Manager
        boolean running = true;

        while (running) {
            System.out.println("\nPersonal Contact Manager:");
            System.out.println("[1] Add Contact");
            System.out.println("[2] View All Contacts");
            System.out.println("[3] Exit");
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
                    System.out.println("Exiting Contact Manager...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
