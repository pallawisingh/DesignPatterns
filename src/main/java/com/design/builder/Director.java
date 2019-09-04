package com.design.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
        builder.start();
        builder.buildBody();
        builder.addWheels();
        builder.addHeadLights();
        builder.end();
    }
}
