package com.datastructure.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1, 12, 5, 111, 200, 1000, 10};

        System.out.println("Before Sort...");

        Arrays.stream(a).forEach(value -> System.out.print(value+" "));

        int[] b = sort(a);

        System.out.println();
        System.out.println("After Sort...");
        Arrays.stream(b).forEach(value -> System.out.print(value+" "));

    }

    private static int[] sort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }
}
