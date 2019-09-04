package com.design.builder;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void shouldCreateObject(){
        Product product = new Product();
        assertNotNull(product);
    }

    @Test
    public void shouldAssertProduct(){
        LinkedList<String> expected = new LinkedList();
        expected.add("Add Product");

        Product product = new Product();
        product.add("Add Product");
        assert(product.products).equals(expected);
    }

    @Test
    public void shouldReturnProductWhenGetProductIsCalled(){

        Product actual = new Product();
        actual.add("Add Product");

        LinkedList<String> expected = actual.getProduct();
        assert(actual.products).equals(expected);
    }

}
