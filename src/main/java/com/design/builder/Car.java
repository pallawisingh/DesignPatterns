package com.design.builder;

public class Car implements Builder {

    private Product product;
    private String brand;

    public Car(String brand) {
        this.product = new Product();
        this.brand = brand;
    }

    @Override
    public void start() {
        this.product.add(brand);
    }

    @Override
    public void buildBody() {
       this.product.add("Car body");
    }

    @Override
    public void addWheels() {
        this.product.add("Added 4 wheels");
    }

    @Override
    public void addHeadLights() {
        this.product.add("Added 2 headlights");
    }

    @Override
    public void end() {
       this.product.add("Car created");
    }

    @Override
    public Product getVehichle(){
        return this.product;
    }
}
