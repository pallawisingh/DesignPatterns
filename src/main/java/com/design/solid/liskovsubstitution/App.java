package com.design.solid.liskovsubstitution;

public class App {

    public static void main(String[] args) {
        ElectricVehicle car = new ElectricCar();
        car.chargeBattery();
        NormalVehicle normalVehicle = new Car();
        normalVehicle.addFuel();
    }
}
