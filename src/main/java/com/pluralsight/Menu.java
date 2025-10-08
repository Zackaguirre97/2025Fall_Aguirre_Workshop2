package com.pluralsight;

public class Menu {
    // Method to loop the main menu and main choice prompt.
    public static void mainMenu() {
        // * Display the menu.
        System.out.println("\n----- Library Menu -----");
        System.out.println("L. Show the full library");
        System.out.println("A. Show Available Books");
        System.out.println("C. Show Checked Out Books");
        System.out.println("X. Exit");
    }

    // Loop to prompt the user checkout a book or return to the main menu.
    public static void checkOutMenu() {
        System.out.println("\n----- Book Check Out -----");
        System.out.println("Please enter a Book ID to check out a book, or X to go back to the main menu: ");
    }

    // Loop to prompt the user checkout a book or return to the main menu.
    public static void checkInMenu() {
        System.out.println("\n----- Options -----");
        System.out.println("C. Check in a Book");
        System.out.println("X. Return to the main menu");
    }
}