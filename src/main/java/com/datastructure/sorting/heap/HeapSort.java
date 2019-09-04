package com.datastructure.sorting.heap;

public class HeapSort {

    public static void main(String[] args) {

        int[] arr = {1, 12, 9, 5, 6, 10};

        HeapSort heapSort = new HeapSort();

        heapSort.sort(arr);

        printArray(arr);

    }

    private static void printArray(int[] arr) {

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    private void sort(int[] arr) {

        int len = arr.length;

        for (int i = len / 2 - 1; i > 0; i--) {

            heapify(arr, len, i);
        }

        for (int i = len - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, len, i);

        }

    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }


        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }


    }

}
