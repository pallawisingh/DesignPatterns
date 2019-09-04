package com.design.solid.liskovsubstitution;

public class ElectricCar implements ElectricVehicle {
    @Override
    public void speed() {
        System.out.println("Speed up the electric car");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charge the Battery of electric car");
    }

}
