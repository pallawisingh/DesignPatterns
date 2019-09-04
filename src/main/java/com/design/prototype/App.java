package com.design.prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {


        BasicCar nano = new Nano("Green Nano");
        ((Nano) nano).basePrice = 100000;

        BasicCar ford = new Ford("Yello Ford");
        ((Ford) ford).basePrice = 500000;

        BasicCar bc1;

        bc1 = nano.clone();
        bc1.onRoadPrice = ((Nano) nano).basePrice + BasicCar.setAdditionalPrice();
        System.out.println("Vehicle is " + bc1.modelName + " and it's price is " + bc1.onRoadPrice);

        bc1 = ford.clone();
        bc1.onRoadPrice = ((Ford) ford).basePrice+BasicCar.setAdditionalPrice();
        System.out.println("Vehicle is " + bc1.modelName + " and it's price is " + bc1.onRoadPrice);

    }
}
