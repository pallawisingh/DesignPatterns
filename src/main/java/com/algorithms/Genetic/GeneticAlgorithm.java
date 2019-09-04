package com.algorithms.Genetic;

import java.util.Random;

public class GeneticAlgorithm {

    Population population = new Population();
    Individual fittest;
    Individual secondFittest;
    int generationCount;

    public static void main(String[] args) {
        Random random = new Random();

        GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm();

        geneticAlgorithm.population.initializePopulation(10);

        geneticAlgorithm.population.calcFitness();

        System.out.println("Generation : " + geneticAlgorithm.generationCount +
            " Fittest : " + geneticAlgorithm.population.fittest);

        while (geneticAlgorithm.population.fittest < 5) {
            geneticAlgorithm.generationCount++;

            geneticAlgorithm.selection();

            geneticAlgorithm.crossOver();

            if (random.nextInt() % 7 < 5) {
                geneticAlgorithm.mutation();
            }

            geneticAlgorithm.addFittestOffspring();

            geneticAlgorithm.population.calcFitness();

            System.out.println("Generation: " + geneticAlgorithm.generationCount + " Fittest: " + geneticAlgorithm.population.fittest);

        }

        System.out.println("\nSolution found in generation " + geneticAlgorithm.generationCount);
        System.out.println("Fitness: " + geneticAlgorithm.population.getFittest().fitness);
        System.out.print("Genes: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(geneticAlgorithm.population.getFittest().genes[i]);
        }

        System.out.println();
    }

    private void selection() {
        fittest = population.getFittest();
        secondFittest = population.getSecondFittest();
    }

    private void crossOver() {
        Random random = new Random();

        int crossOverPoint = random.nextInt(population.individuals.get(0).geneLength);

        for (int i = 0; i < crossOverPoint; i++) {
            int temp = fittest.genes[i];
            fittest.genes[i] = secondFittest.genes[i];
            secondFittest.genes[i] = temp;
        }
    }

    private void mutation() {
        Random random = new Random();

        int mutationPoint = random.nextInt(population.individuals.get(0).geneLength);

        if (fittest.genes[mutationPoint] == 0) {
            fittest.genes[mutationPoint] = 1;
        } else {
            fittest.genes[mutationPoint] = 0;
        }

        mutationPoint = random.nextInt(population.individuals.get(0).geneLength);

        if (secondFittest.genes[mutationPoint] == 0) {
            secondFittest.genes[mutationPoint] = 1;
        } else {
            secondFittest.genes[mutationPoint] = 0;
        }
    }

    Individual getFittestOffspring() {
        if (fittest.fitness > secondFittest.fitness) {
            return fittest;
        }
        return secondFittest;
    }

    void addFittestOffspring() {

        fittest.calcFitness();
        secondFittest.calcFitness();

        int leastFittestIndex = population.getLeastFittest();

        population.individuals.add(leastFittestIndex, getFittestOffspring());
    }
}
