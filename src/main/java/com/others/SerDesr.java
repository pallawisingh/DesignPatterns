package com.others;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDesr {

    @SneakyThrows
    public static void main(String[] args) {

        Book book = new Book("Pallawi", 234);
        String fileName = "src/books.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(book);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Book book1 = (Book) objectInputStream.readObject();
        System.out.println(book1.getAuthorName());
        System.out.println(book1.getNoOfPages());

        objectInputStream.close();
        fileInputStream.close();

    }
}
