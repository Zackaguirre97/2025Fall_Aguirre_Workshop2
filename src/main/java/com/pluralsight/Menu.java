package com.pluralsight;

import java.util.Scanner;

public class Menu {
    // *** Properties. ***
    // * Create a scanner to help with gathering user input.
    private Scanner sc = new Scanner(System.in);

    // * Create a new library for each Menu object created.
    private Library library;

    // *** Constructor ***
    public Menu(Library library) {
        this.library = library;

        mainLoop();
    }

    // *** Methods ***
    // Method to display the menu.
    public void showMainMenu() {
        // * Display the menu.
        System.out.println("\n----- Library Menu -----");
        System.out.println("1. Show All Books");
        System.out.println("2. Show Available Books");
        System.out.println("3. Show Checked Out Books");
        System.out.println("4. Exit");
    }

    // * Method to loop the main menu and main choice prompt.
    public void mainLoop() {
        // * Switch to control the main menu loop.
        boolean running = true;

        // * Loop until the user chooses exit.
        while(running) {
            // Display the main menu.
            showMainMenu();
            // * Create a variable to hold the users choice and store the users input.
            int choice = sc.nextInt();

            // * Check what the user chose and decide what to do.
            switch(choice) {
                // * If the user chose 1
                case 1:
                    library.showLibrary();
                    break;

                // * If the user chose 2
                case 2:
                    library.showAvailableBooks();
                    break;

                // * If the user chose 3
                case 3:
                    library.showCheckedOutBooks();
                    break;

                // * If the user chose 4
                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please enter a 1, 2, 3, or 4.");
            }
        }
    }
}
