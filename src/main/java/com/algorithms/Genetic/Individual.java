package com.algorithms.Genetic;

import java.util.Arrays;
import java.util.Random;

public class Individual {

    int[] genes = new int[5];
    int fitness;
    int geneLength = 5;

    public Individual() {
        Random random = new Random();

        Arrays.stream(genes).forEach(i -> genes[i] = Math.abs(random.nextInt() % 2));
        fitness = 0;
    }

    public void calcFitness() {
        fitness = 0;
        fitness = (int) Arrays.stream(genes).filter(i -> genes[i] == 1).count();
    }
}
