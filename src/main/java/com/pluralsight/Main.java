package com.pluralsight;

public class Main {
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

        // Using the above library of books, create a new menu.
        Menu menu = new Menu(library);

        // *** Variables ***


        // *** Menu
    }
};
