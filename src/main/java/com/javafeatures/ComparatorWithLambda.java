package com.javafeatures;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithLambda {

    public static void main(String[] args) {

        List<Developer> developers = getDeveloper();
        System.out.println("Before Sort...");
        developers.forEach(developer -> System.out.println(developer));

        System.out.println("After sorting with age...");
        developers.sort(Comparator.comparingInt((Developer d) -> d.age));
        developers.forEach(developer -> System.out.println(developer));

        System.out.println("After sorting with salary");
        developers.sort(Comparator.comparingDouble((Developer d) -> d.salary));
        developers.forEach(developer -> System.out.println(developer));

        System.out.println("After sorting with name");
        developers.sort(Comparator.comparing((Developer d) -> d.name));
        developers.forEach(developer -> System.out.println(developer));

    }

    private static List<Developer> getDeveloper() {
        ArrayList<Developer> list = new ArrayList<>();

        list.add(new Developer("alvin", 80000d, 20));
        list.add(new Developer("jason", 100000d, 10));
        list.add(new Developer("mkyong", 70000d, 33));
        list.add(new Developer("iris", 170000d, 55));

        return list;
    }

    @AllArgsConstructor
    @ToString
    static class Developer {
        String name;
        double salary;
        int age;
    }
}
