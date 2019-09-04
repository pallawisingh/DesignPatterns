package com.javafeatures;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("spring", "node", "mykong");

        List<String> list = lines.stream()
            .filter(s -> !s.equals("mykong"))
            .collect(Collectors.toList());

        list.forEach(s -> System.out.println(s));

        List<Person> persons = Arrays.asList(
            new Person("Pallawi", 27),
            new Person("Ishita", 25),
            new Person("Shaun", 29),
            new Person("Pallawi", 25)
        );

        Person person1 = persons.stream()
            .filter(person -> "Pallawi".equals(person.name))
            .findAny()
            .orElse(null);

        System.out.println(person1.toString());

        List<String> collect = persons.stream()
            .filter(person -> "Pallawi".equals(person.name))
            .map(person -> person.name)
            .collect(Collectors.toList());

        collect.forEach(s -> System.out.println(s));
    }

    @AllArgsConstructor
    @ToString
    static class Person {
        private String name;
        private int age;
    }
}
