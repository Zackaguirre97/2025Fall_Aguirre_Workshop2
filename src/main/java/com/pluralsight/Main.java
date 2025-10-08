package com.pluralsight;

import java.util.Scanner;

public class Main {
    // Create a scanner to help with gathering user input.
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // *** Properties ***
        // * Create an array/collection of books using the Book class.
        Book[] books = {
                new Book(1, "978-0134685991", "Effective Java"),
                new Book(2, "978-0596009205", "Head First Java"),
                new Book(3, "978-0201633610", "Design Patterns: Elements of Reusable Object-Oriented Software"),
                new Book(4, "978-0132350884", "Clean Code: A Handbook of Agile Software Craftsmanship"),
                new Book(5, "978-0321356680", "Java Concurrency in Practice"),
                new Book(6, "978-1617294945", "Spring in Action"),
                new Book(7, "978-0596007126", "Head First Design Patterns"),
                new Book(8, "978-0134494166", "Core Java Volume I"),
                new Book(9, "978-1492072508", "Learning Java"),
                new Book(10, "978-0137081073", "The Pragmatic Programmer"),
                new Book(11, "978-0596158101", "Java in a Nutshell"),
                new Book(12, "978-0131103627", "The C Programming Language"),
                new Book(13, "978-0262033848", "Introduction to Algorithms"),
                new Book(14, "978-1260440232", "Java: The Complete Reference"),
                new Book(15, "978-0321573513", "Effective C++"),
                new Book(16, "978-1491950357", "Programming JavaScript Applications"),
                new Book(17, "978-1449331818", "Learning Python"),
                new Book(18, "978-1492078005", "Fluent Python"),
                new Book(19, "978-0131429017", "Artificial Intelligence: A Modern Approach"),
                new Book(20, "978-0133594140", "Computer Networking: A Top-Down Approach")
        };
        // Create a new library using the above books.
        Library library = new Library(books);

        // Switch to control the main menu loop.
        String choice = "";
        int id = 0;

        // Loop until the user chooses exit.
        while(true) {
            // * Display the menu.
            Menu.mainMenu();

            // Create a variable to hold the users choice and store the users input.
            choice = sc.nextLine().trim().toUpperCase();

            // Check what the user chose and decide what to do.
            switch(choice) {
                // If the user chose 1
                case "L":
                    library.showLibrary();
                    break;

                // If the user chose 2
                case "A":
                    checkOutLoop(library);
                    break;

                // If the user chose 3
                case "C":
                    checkInLoop(library);
                    break;

                // If the user chose 4
                case "X":
                    System.exit(0);

                    // If the user entered a value not specified.
                default:
                    System.out.println("Error: Please enter a L, A, C, or X.");
                    continue;
            }
        }
    }

    // Loop to prompt the user checkout a book or return to the main menu.
    public static void checkOutLoop(Library library) {
        // variables
        String choice = "";
        int id = 0;

        while (true) {
            // Variable
            choice = "";

            // Display the menu.
            library.showAvailableBooks();
            Menu.checkOutMenu();
            choice = sc.nextLine();

            // Check if the user wants to exit the book checkout prompt.
            if (choice.equalsIgnoreCase("X")) {
                break;
            }

            // Check if the user entered an integer.
            else if (InputUtils.isInteger(choice)) {
                id = Integer.parseInt(choice); // Now that we know the choice is an int (or ID) store it as an int.
                // Check if the integer entered is a valid Book ID.
                if (library.bookIdFound(id) && !(library.bookIdCheckedOut(id))) {
                    // Loop until the user enters a name (or X). Then checkout the book.
                    while (true) {
                        System.out.println("Please enter your name (or X to cancel: ");
                        String name = sc.nextLine();

                        // Check if the user wants to exit the name entry prompt.
                        if (name.equalsIgnoreCase("X")) {
                            break;
                        }

                        // Make sure that the name entered isn't empty.
                        if (InputUtils.isInteger(name)) {
                            System.out.println("Error: Please enter a valid name.");
                        }

                        // If the name wasn't empty, check out the book.
                        else {
                            if(library.checkOutBook(id, name)) {
                                System.out.println("Confirmation: Book has been checked out!");
                            }
                            break;
                        }
                    }
                }
                // If the ID the user entered is not found in the library of books.
                else {
                    // Display an error message.
                    System.out.println("Error: Please enter a valid Book ID.");
                }
            }
        }
    }

    // Loop to prompt the user checkout a book or return to the main menu.
    public static void checkInLoop(Library library) {
        // Variables
        String choice = "";
        int id = 0;
        // Loop until the user
        while (true) {
            choice = "";

            // Display the menu.
            library.showCheckedOutBooks();
            Menu.checkInMenu();
            choice = sc.nextLine();

            // Check if the user entered x/X.
            if (choice.equalsIgnoreCase("X")) {
                break;
            }

            // Check if the user entered C.
            else if (choice.equalsIgnoreCase("C")) {
                // Loop until the user enters a name. Then checkout the book.
                while (true) {
                    System.out.println("Please enter the Book ID: ");
                    choice = sc.nextLine();
                    // Make sure the input entered by the user is a number.
                    if (InputUtils.isInteger(choice)) {
                        id = Integer.parseInt(choice); // Now that we know the choice is an int (or ID) store it as an int.
                        // Check if the integer entered is a valid Book ID.
                        if (library.bookIdFound(id)) {
                            // Check the book back in.
                            if (library.checkInBook(id)) {
                                System.out.println("Confirmation: Book has been checked in!");
                                break;
                            }
                        }
                        // Display error message.
                        else {
                            System.out.println("Error: Please enter a valid Book ID.");
                        }
                    }
                    // Display an error message.
                    else {
                        System.out.println("Error: Please enter a number.");
                    }
                }
            }
            // Display an error message.
            else {
                System.out.println("Error: Please enter C or X.");
            }
        }
    }
};
