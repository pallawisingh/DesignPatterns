package com.design.decorator;

public class PaintDecorator extends AbstractDecorator {

    public void makeHouse(){
        super.makeHouse();
    }
    public void paintTheHouse(){
        System.out.println("Now I am painting the house");
    }
}
