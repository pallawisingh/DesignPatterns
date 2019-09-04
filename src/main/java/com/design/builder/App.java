package com.design.builder;

public class App {

    public static void main(String[] args) {

        Builder car = new Car("Maruti Suzuki");

        new Director(car);

        Product vehichle = car.getVehichle();

        vehichle.show();

    }
}
