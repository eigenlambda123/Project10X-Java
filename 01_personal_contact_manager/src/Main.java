import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                    System.out.println("Add Contact selected.");
                    // TODO: Add contact logic
                    break;
                case "2":
                    System.out.println("View All Contacts selected.");
                    // TODO: View contact logic
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
