package com.javafeatures;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterNull {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "python", "node", null, "ruby", null, "php");

        List<String> collect = list.stream()
            .filter(Objects::nonNull)
            .collect(Collectors.toList());

        System.out.println(collect);
    }
}
