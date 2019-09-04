package com.algorithms.Genetic;

import java.util.LinkedList;
import java.util.List;

public class Population {

    List<Individual> individuals = new LinkedList<>();
    int fittest = 0;

    public void initializePopulation(int populationSize) {

        for (int i = 0; i < populationSize; i++) {
            individuals.add(new Individual());
        }
    }

    public Individual getFittest() {
        int maxFit = Integer.MIN_VALUE;
        int maxFitIndex = 0;
        for (int i = 0; i < individuals.size(); i++) {
            if (maxFit <= individuals.get(i).fitness) {
                maxFit = individuals.get(i).fitness;
                maxFitIndex = i;
            }
        }
        fittest = individuals.get(maxFitIndex).fitness;
        return individuals.get(maxFitIndex);
    }

    public Individual getSecondFittest() {
        int maxFit1 = 0;
        int maxFit2 = 0;
        for (int i = 0; i < individuals.size(); i++) {
            if (individuals.get(i).fitness > individuals.get(maxFit1).fitness) {
                maxFit2 = maxFit1;
                maxFit1 = i;
            } else if (individuals.get(i).fitness > individuals.get(maxFit2).fitness) {
                maxFit2 = i;
            }
        }

        return individuals.get(maxFit2);
    }

    public int getLeastFittest() {
        int minFit = Integer.MAX_VALUE;
        int minFitIndex = 0;
        for (int i = 0; i < individuals.size(); i++) {
            if (minFit >= individuals.get(i).fitness) {
                minFit = individuals.get(i).fitness;
                minFitIndex = i;
            }
        }

        return minFitIndex;
    }

    public void calcFitness() {
        for (int i = 0; i < individuals.size(); i++) {
            individuals.get(i).calcFitness();
        }

        getFittest();
    }

}
