import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;

    // Constructor
    public ContactManager() {
        this.contacts = new ArrayList<>();
    }

    // Add a new contact
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Return all contacts
    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts); // Return a copy to prevent external modification

    }

    // Search by name
    public Contact searchByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

}