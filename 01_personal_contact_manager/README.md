# Personal Contact Manager (Java CLI)

A Command-line application to manage personal contacts. Built in Java using OOP principles such as encapsulation and modular class design. Contacts are persisted locally using a text file.

---

## Features

### Core Functionalities

* **Add Contact**
  Input and save a contact's name, phone number, and email address.

* **View All Contacts**
  Lists all saved contacts in a readable format.

* **Search Contact by Name**
  Search for a specific contact using a case-insensitive name query.

* **Save and Exit**
  Saves all contacts to `contacts.txt` and exits the program safely.

---

## Data Persistence

* Contacts are stored in a plain text file: `contacts.txt`
* Contacts are automatically loaded on startup and saved upon exit.

---

## File Structure

```
├── Main.java              # Main program logic & CLI loop
├── Contact.java           # Contact data structure (name, phone, email)
├── ContactManager.java    # Logic for managing the list of contacts
├── contacts.txt           # Data file for storing contact info
```

---

## How to Run

1. Compile the Java files:

```bash
javac Main.java ContactManager.java Contact.java
```

2. Run the program:

```bash
java Main
```

---

## Concepts Covered

* Encapsulation & class separation
* File I/O (read/write to `contacts.txt`)
* Lists and object collections
* Scanner-based CLI input
* Modular programming
