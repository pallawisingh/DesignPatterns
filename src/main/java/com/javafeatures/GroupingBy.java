package com.javafeatures;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class GroupingBy {

    public static void main(String[] args) {

//        List<String> items =
//            Arrays.asList("apple", "apple", "banana",
//                "apple", "orange", "banana", "papaya");
//
//        Map<String, Long> collect = items.stream()
//            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        System.out.println(collect);
//
//        Map<String, Long> finalMap = new LinkedHashMap<>();
//
//        collect.entrySet().stream()
//            .sorted(Map.Entry.<String, Long>comparingByValue()
//                .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
//
//        System.out.println(finalMap);

        List<Item> items = Arrays.asList(
            new Item("apple", 10, new BigDecimal("9.99")),
            new Item("banana", 20, new BigDecimal("19.99")),
            new Item("orang", 10, new BigDecimal("29.99")),
            new Item("watermelon", 10, new BigDecimal("29.99")),
            new Item("papaya", 20, new BigDecimal("9.99")),
            new Item("apple", 10, new BigDecimal("9.99")),
            new Item("banana", 10, new BigDecimal("19.99")),
            new Item("apple", 20, new BigDecimal("9.99"))
        );

        Map<String, Integer> collect = items.stream()
            .collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));

        System.out.println(collect);

        Map<BigDecimal, Set<String>> collect1 = items.stream()
            .collect(Collectors.groupingBy(Item::getPrice,
                Collectors.mapping(Item::getName, Collectors.toSet())));

        System.out.println(collect1);
    }

    @AllArgsConstructor
    @Getter
    @ToString
     static class Item {
        private String name;
        private int qty;
        private BigDecimal price;

    }
}
