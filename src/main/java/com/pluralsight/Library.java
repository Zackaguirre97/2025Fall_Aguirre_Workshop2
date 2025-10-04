package com.pluralsight;

public class Library {
    // *** Properties ***
    private Book[] library;

    // *** Constructor ***
    public Library(Book[] library) {
        this.library = library;
    }

    // *** Getter ***
    public Book[] getLibrary() {
        return library;
    }

    // *** Methods ***
    // * Display the full library of books
    public void showLibrary() {
        for (Book book : library) {
            book.bookData();
        }
    }

    // * Display the available books
    public void showAvailableBooks() {
        int counter = 0;
        for (Book book : library) {
            if (!book.isCheckedOut()) {
                book.availableBookData();
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("No books are currently checked available.");
        }
    }

    // * Display the checked out books
    public void showCheckedOutBooks() {
        int counter = 0;
        for (Book book : library) {
            if (book.isCheckedOut()) {
                book.unavailableBookData();
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("No books are currently checked out.");
        }
    }

    // * Display the checked out books
    public boolean bookIdFound(int id) {
        boolean found = false;
        for (Book book : library) {
            if (book.getId() == id) {
                found = true;
                break;
            }
        }
        return found;
    }

    // * Display the checked out books
    public boolean checkOutBook(int id, String name) {
        for (Book book : library) {
            if (book.getId() == id) {
                book.checkOut(name);
                return true;
            }
        }
        return false;
    }

    // * Display the checked in books
    public boolean checkInBook(int id) {
        for (Book book : library) {
            if (book.getId() == id) {
                book.checkIn();
                return true;
            }
        }
        return false;
    }
}
