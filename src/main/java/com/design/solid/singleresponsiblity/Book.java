package com.design.solid.singleresponsiblity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements BookHandler{

    private BookPersistence bookPersistence;
    private String authorName;
    private int noOfPages;

    @Override
    public void save() {
        this.bookPersistence.save(this);

    }
}
