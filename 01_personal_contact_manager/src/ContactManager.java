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

    // Optional: Search by name
    public List<Contact> searchByName(String name) {
        List<Contact> results = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(contact);
            }
        }
        return results;
    }

}