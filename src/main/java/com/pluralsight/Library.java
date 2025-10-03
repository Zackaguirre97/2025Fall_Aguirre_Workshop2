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
        for (Book book : library) {
            if (book.isCheckedOut()) {
                book.bookData();
            }
        }
    }

    // * Display the checked out books
    public void showCheckedOutBooks() {
        for (Book book : library) {
            if (!(book.isCheckedOut())) {
                book.bookData();
            }
        }
    }
}
