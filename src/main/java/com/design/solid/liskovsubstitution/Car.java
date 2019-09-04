package com.design.solid.liskovsubstitution;

public class Car implements NormalVehicle {
    @Override
    public void speed() {
        System.out.println("Speed of the car");
    }

    @Override
    public void addFuel() {
        System.out.println("Adding fuel to car");
    }
}
