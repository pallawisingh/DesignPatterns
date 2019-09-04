package com.others;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Book implements Serializable {

    private String authorName;
    private int noOfPages;

    public Book(String authorName, int noOfPages) {
        this.authorName = authorName;
        this.noOfPages = noOfPages;
    }

}
