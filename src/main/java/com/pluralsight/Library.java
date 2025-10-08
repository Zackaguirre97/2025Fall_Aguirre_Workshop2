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

    public void retrieveLibraryFromFile() {
        try {
            System.out.println("Hello World");
        }
        catch (Exception e) {
            System.out.println("Uh oh...");
        }
    }

    public void saveLibraryToFile() {
        try {
            System.out.println("Hello World");
        } catch (Exception e) {
            System.out.println("Uh oh...");
        }
    }
}
