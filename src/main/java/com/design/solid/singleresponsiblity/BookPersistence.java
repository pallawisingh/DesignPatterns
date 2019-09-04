package com.design.solid.singleresponsiblity;

public class BookPersistence {

    public void save(Book book) {
        System.out.println("Saving the book " + book);
    }
}
