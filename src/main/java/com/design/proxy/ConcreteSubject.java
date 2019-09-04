package com.design.proxy;

public class ConcreteSubject extends Subject {
    @Override
    public void doSomeWork() {
        System.out.println("doSomeWork inside concreteSubject is invoked");
    }
}
