package com.design.singelton;

public class Captain {

    private static Captain captain;
    static int numberOfInstances =0;

    private Captain() {
        numberOfInstances++;
        System.out.println("Number os instances at this moment is "+numberOfInstances);
    }

//    public static synchronized Captain getCaptain() {
//        if(captain == null) {
//            captain = new Captain();
//            System.out.println("New captain is elected for your team");
//        }
//        else {
//            System.out.print("You already have a captain for your team.");
//            System.out.println("Send him for the toss.");
//        }
//        return captain;
//    }

    public static Captain getCaptain() {
        if(captain == null) {
            synchronized (Captain.class) {
                captain = new Captain();
                System.out.println("New captain is elected for your team");
            }
        }
        else {
            System.out.print("You already have a captain for your team.");
            System.out.println("Send him for the toss.");
        }
        return captain;
    }

    public static void dummyMethod() {
        System.out.println("It is a dummy method");
    }

public class DerivedCaptain extends Captain {

}
}
