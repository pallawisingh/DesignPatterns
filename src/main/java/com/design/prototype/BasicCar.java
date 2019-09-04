package com.design.prototype;

import java.util.Random;

public abstract class BasicCar implements Cloneable {

    public String modelName;
    public int basePrice;
    public int onRoadPrice;

    public static int setAdditionalPrice() {
        return new Random().nextInt(7);

    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
