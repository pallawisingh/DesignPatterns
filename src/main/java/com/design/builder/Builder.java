package com.design.builder;

public interface Builder {

    void start();
    void buildBody();
    void addWheels();
    void addHeadLights();
    void end();

    Product getVehichle();
}
