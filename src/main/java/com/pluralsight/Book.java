package com.pluralsight;

public class Book {
    // *** Properties ***
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // *** Constructor ***
    // Defaults so that when a book is added, isCheckedOut defaults to false & checkedOutTo defaults to no name.
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }


    // *** Getters/Setters ***
    // ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    // ISBN
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    // Title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    // Checked out?
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    public void setCheckedOut(boolean checkedOut) {
        this.isCheckedOut = checkedOut;
    }
    // Checked out to?
    public String getCheckedOutTo() {
        return checkedOutTo;
    }
    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    // *** Methods ***
    // Check a book out.
    public void checkOut(String name) {
        if (!name.isEmpty()) {
            this.checkedOutTo = name;
            this.isCheckedOut = true;
        }

        else {
            System.out.println("Please enter a name to check out a book.");
        }
    }

    // Check a book back in.
    public void checkIn() {

    }

    // Display book data: id, isbn, title.
    public void bookData() {
        System.out.println(id + ", " + isbn + ", " + title);
    }

    // *** Overrides ***
}
