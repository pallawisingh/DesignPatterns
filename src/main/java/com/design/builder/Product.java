package com.design.builder;

import java.util.LinkedList;

public class Product {

    LinkedList<String> products;

    public Product() {
        this.products = new LinkedList<>();
    }

    public void add(String parts) {
         this.products.add(parts);
    }

    public void show(){
        this.products.stream()
            .forEach(value -> System.out.println(value));
    }

    public LinkedList<String> getProduct() {
        return this.products;
    }
}
