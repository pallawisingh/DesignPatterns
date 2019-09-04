package com.design.solid.singleresponsiblity;

public class App {

    public static void main(String[] args) {

        Book book1 = new Book(new BookPersistence(),"Albert Camus", 123);
        book1.save();
    }
}
