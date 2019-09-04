package com.design.singelton;

public class App {

    public static void main(String[] args) {
        Captain captain = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team");
        Captain captain1 = Captain.getCaptain();

        System.out.println(captain==captain1);

        Captain captain2 = Captain.getCaptain();

        Captain.DerivedCaptain derivedCaptain = captain1.new DerivedCaptain();

        Captain.dummyMethod();
    }

}
