package com.design.decorator;

public class App {
    public static void main(String[] args) {

        ConcreteComponent withoutDecorator = new ConcreteComponent();
        withoutDecorator.makeHouse();

        FloorDecorator floorDecorator = new FloorDecorator();
        floorDecorator.setComponent(withoutDecorator);
        floorDecorator.addFloor();

        PaintDecorator paintDecorator = new PaintDecorator();
        paintDecorator.setComponent(floorDecorator);

        paintDecorator.paintTheHouse();

    }
}
