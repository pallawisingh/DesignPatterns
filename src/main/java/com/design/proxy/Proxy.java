package com.design.proxy;

public class Proxy extends Subject {
    Subject subject;

    @Override
    public void doSomeWork() {
        if (subject == null) {
            subject = new ConcreteSubject();
        }
        else
            System.out.println("Already created");
        subject.doSomeWork();
    }
}
