package com.design.solid.openclosed;

public class App {

    public static void main(String[] args) {
        SorterManager sorterManager = new SorterManager();
        sorterManager.sort(new MergeSort());
        sorterManager.sort(new InsertionSort());
        sorterManager.sort(new QuickSort());
        sorterManager.sort(new BubbleSort());
    }
}
