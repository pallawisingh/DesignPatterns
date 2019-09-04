package com.design.factory;

public class App {

    public static void main(String[] args) {
        AnimalFactory tigerFactory = new TigerFactory();
        tigerFactory.makeAnimal();

        AnimalFactory dogFactory = new DogFactory();
        dogFactory.makeAnimal();
    }

}
