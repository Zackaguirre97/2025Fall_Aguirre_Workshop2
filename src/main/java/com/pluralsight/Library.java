package com.pluralsight;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

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

    // * Loop through all the books in the library, check their id's, if an id mathces the passed id to find, set found to true.
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

    // * Loop through all the books in the library, check their id's & if they are checked out, if both conditions are true, set checkedOut to true.
    public boolean bookIdCheckedOut(int id) {
        boolean checkedOut = false;
        for (Book book : library) {
            if (book.getId() == id && book.isCheckedOut()) {
                checkedOut = true;
                break;
            }
        }
        return checkedOut;
    }

    // * Loop through all the books in the library, search for the book whos id matches the id passed, if found- checkout the book.
    public boolean checkOutBook(int id, String name) {
        for (Book book : library) {
            if (book.getId() == id) {
                book.checkOut(name);
                return true;
            }
        }
        return false;
    }

    // * Loop through all the books in the library, search for the book whos id matches the id passed, if found- checkin the book.
    public boolean checkInBook(int id) {
        for (Book book : library) {
            if (book.getId() == id) {
                book.checkIn();
                return true;
            }
        }
        return false;
    }

    // Retrieve the stored copy of the file.
    public void retrieveLibraryFromFile() {
        try {
            System.out.println("Hello World");
        }
        catch (Exception e) {
            System.out.println("Uh oh...");
        }
    }

    // Copy the current version of the library to the storage file for persistence of data when the app is run again.
    public void saveLibraryToFile() {
        try {
            System.out.println("Hello World");
        } catch (Exception e) {
            System.out.println("Uh oh...");
        }
    }
}
