# 📚 Library Management System (Java)

A console-based library management application written in Java that allows users to view, check out, and return books.
Designed with modular classes to practice **object-oriented programming (OOP)** concepts such as **encapsulation, class interaction, and separation of concerns**.

---

## 🚀 Features

### Current Functionality

* **View All Books** – Display every book in the library with full metadata (ID, ISBN, Title, Checkout Status).
* **View Available Books** – Show only books currently available for checkout.
* **View Checked-Out Books** – Show books currently checked out, along with the name of the person who borrowed them.
* **Check Out Books** – Allows users to enter a valid Book ID and name to check out a book.
* **Check In Books** – Allows users to return checked-out books by their Book ID.
* **Input Validation** – Safely handles invalid or unexpected user input using `InputUtils.isInteger()` for numeric checks.

---

## 🧩 Class Overview

| Class            | Responsibility                                                                                                                                             |
| ---------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **`Book`**       | Represents a single book, storing its ID, ISBN, title, checkout status, and borrower. Includes methods for checking books in/out and displaying book data. |
| **`Library`**    | Manages a collection of `Book` objects. Handles displaying book lists, verifying IDs, and performing check-in/check-out logic.                             |
| **`Menu`**       | Provides a user interface via the console. Manages main menu navigation and user input flow for checking books in or out.                                  |
| **`InputUtils`** | Utility class with static helper methods for validating user input (currently only `isInteger()`).                                                         |
| **`Main`**       | Entry point for the application. Initializes the library with a predefined list of books and launches the main menu loop.                                  |

---

## 🗃️ Planned Additions

* **Persistent Data Storage** using *File I/O*

  * Save and load the library’s state (book list, checked-out books, and borrowers) between sessions.

* **Graphical User Interface (GUI)**

  * Add a JavaFX or Swing-based GUI for improved usability.
  * Replace text-based input with buttons, forms, and tables.

---

## 🧠 Design Principles

* **Encapsulation:** Each class handles its own data and logic.
* **Modularity:** The program separates concerns into distinct classes (`Book`, `Library`, `Menu`, etc.).
* **Scalability:** Designed to support future features (e.g., file persistence and GUIs) without major rewrites.
* **Error Handling:** Graceful input validation prevents crashes due to invalid user input.

---

## 🖥️ Running the Program

1. Clone this repository:

   ```bash
   git clone https://github.com/<your-username>/<your-repo-name>.git
   ```
2. Open the project in IntelliJ IDEA (or your preferred IDE).
3. Run the `Main` class.
4. Use the console menu to interact with the system:

   ```
   L. Show the full library
   A. Show available books
   C. Show checked out books
   X. Exit
   ```

---

## 🧪 Example Interaction

```
----- Library Menu -----
L. Show the full library
A. Show Available Books
C. Show Checked Out Books
X. Exit
> A

----- Available Books -----
1, 978-0134685991, Effective Java
2, 978-0596009205, Head First Java
...

----- Book Check Out -----
Please enter a Book ID to check out a book, or X to go back to the main menu:
> 1
Please enter your name:
> Zack
Book successfully checked out!
```

---

## ⚙️ Technologies Used

* Java (JDK 17+ recommended)
* IntelliJ IDEA (for development)
* Git & GitHub (for version control)
