package com.algorithms.greedy;

import io.vavr.collection.List;
import io.vavr.collection.Seq;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Seq<Integer> num =  List.of(7,2,3);

        num.groupBy(t -> {
            System.out.println(t);
            return t.compareTo(3);
        });



    }

}
