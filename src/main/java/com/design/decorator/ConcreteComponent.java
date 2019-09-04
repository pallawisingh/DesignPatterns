package com.design.decorator;

public class ConcreteComponent extends Component {
    @Override
    void makeHouse() {
        System.out.println("Original house is completed and now closed for modification");
    }
}
