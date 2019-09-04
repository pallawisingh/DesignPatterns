package com.search;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int l, int r, int m) {
        if (l <= r) {
            int mid = (l + r) / 2;
            if (m == arr[mid]) {
                return m;
            } else if (m > arr[mid]) {
                return binarySearch(arr, mid + 1, r, m);
            } else if (m < arr[mid]) {
                return binarySearch(arr, l, mid - 1, m);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 8, 9};
        int index1 = binarySearch(arr, 0, arr.length - 1, 7);
        System.out.println(index1);

        int index2 = Arrays.binarySearch(arr, 7);
        System.out.println(index2);

    }
}
