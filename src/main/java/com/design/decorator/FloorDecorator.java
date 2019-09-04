package com.design.decorator;

public class FloorDecorator extends AbstractDecorator {

    public void makeHouse(){
        super.makeHouse();
    }
    public void addFloor(){
        System.out.println("I am making the additional floor on top of it");
    }
}
