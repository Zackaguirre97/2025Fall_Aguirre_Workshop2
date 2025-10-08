package com.pluralsight;

import java.util.Scanner;

public class LibraryController {
    // Properties
    private Library library;
    private Scanner sc;

    // Constructor
    public LibraryController(Library library, Scanner sc) {
        this.library = library;
        this.sc = sc;
    }

    // Methods
    // Start the main loop
    public void start() {
        while(true) {
            Menu.mainMenu();
            String choice = sc.nextLine().trim().toUpperCase();

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
    private void checkOutLoop(Library library) {
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

    // Loop to prompt the user checkin a book or return to the main menu.
    private void checkInLoop(Library library) {
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
}
