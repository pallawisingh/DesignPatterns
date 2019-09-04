package com.javafeatures;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("pen", "pencil", "sketch", "box");

        List<String> collect = list.stream()
            .map(s -> s.toUpperCase())
            .collect(Collectors.toList());

        collect.forEach(s -> System.out.println(s));

        List<Staff> staff = Arrays.asList(
            new Staff("mkyong", 30, 10000),
            new Staff("jack", 27, 20000),
            new Staff("lawrence", 33, 30000)
        );

        List<StaffPublic> collect1 = staff.stream()
            .map(staff1 -> StaffPublic.builder()
                .name(staff1.name)
                .age(staff1.age)
                .salary(staff1.salary)
                .build()).collect(Collectors.toList());

        collect1.forEach(staffPublic -> System.out.println(staffPublic));

    }

    @AllArgsConstructor
    @ToString
    static class Staff{
        private String name;
        private int age;
        private double salary;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @ToString
    static class StaffPublic{
        private String name;
        private int age;
        private double salary;
    }
}
