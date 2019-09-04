package com.algorithms.dynamic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnapsackTest {
    private Knapsack knapsack;

    @Before
    public void setUp() {
        knapsack = new Knapsack();
    }

    @Test
    public void shouldReturn0WhenCapacityIs0(){
        int[] weights = {1, 2, 3, 5};
        int[] profits = {1, 6, 10, 16};
        int capacity = 0;
        int currentIndex = 0;
        assertEquals(knapsack.knapsackRecursive(weights, profits, capacity, currentIndex), 0);
    }

    @Test
    public void shouldReturn0WhenCurrentIndexIsGreaterThanObjectsGiven(){
        int[] weights = {1, 2, 3, 5};
        int[] profits = {1, 6, 10, 16};
        int capacity = 5;
        int currentIndex = 5;
        assertEquals(knapsack.knapsackRecursive(weights, profits, capacity, currentIndex), 0);
    }

    @Test
    public void shouldReturnMaxProfitForGivenWeights() {
        int[] weights = {1, 2, 3, 5};
        int[] profits = {1, 6, 10, 16};
        int capacity = 7;
        int currentIndex = 0;
        assertEquals(knapsack.knapsackRecursive(weights, profits, capacity, currentIndex), 22);
    }

    @Test
    public void shouldReturn0WhenCapacityIs0ForTopDownApproach(){

        int[] weights = {1, 2, 3, 5};
        int[] profits = {1, 6, 10, 16};
        int capacity = 0;
        int currentIndex = 0;
        int[][] dp = new int[profits.length][capacity + 1];
        assertEquals(knapsack.knapsackRecursiveWithTopDown(weights, profits, capacity, currentIndex, dp), 0);

    }

    @Test
    public void shouldReturn0WhenCurrentIndexIsGreaterThanObjectsGivenForTopDownApproach(){
        int[] weights = {1, 2, 3, 5};
        int[] profits = {1, 6, 10, 16};
        int capacity = 5;
        int currentIndex = 5;
        int[][] dp = new int[profits.length][capacity + 1];
        assertEquals(knapsack.knapsackRecursiveWithTopDown(weights, profits, capacity, currentIndex, dp), 0);
    }

    @Test
    public void shouldReturnMaxProfitForGivenWeightsForTopDownApproach() {
        int[] weights = {1, 2, 3, 5};
        int[] profits = {1, 6, 10, 16};
        int capacity = 7;
        int currentIndex = 0;
        int[][] dp = new int[profits.length][capacity + 1];
        assertEquals(knapsack.knapsackRecursiveWithTopDown(weights, profits, capacity, currentIndex, dp), 22);
    }

    @Test
    public void shouldReturn0WhenCapacityIs0ForBottomUp(){
        int[] weights = {1, 2, 3, 5};
        int[] profits = {1, 6, 10, 16};
        int capacity = 0;

        assertEquals(knapsack.knapsackWithBottomUp(weights, profits, capacity), 0);

    }

    @Test
    public void shouldReturn0WhenProfitIs0ForBottomUp(){
        int[] weights = {1, 2, 3, 5};
        int[] profits = {};
        int capacity = 5;

        assertEquals(knapsack.knapsackWithBottomUp(weights, profits, capacity), 0);

    }

    @Test
    public void shouldReturn0WhenProfitsLengthIsNotEqualToWeightsLengthForBottomUp(){
        int[] weights = {1, 2, 3, 5};
        int[] profits = {1, 6, 10, 16, 19};
        int capacity = 5;

        assertEquals(knapsack.knapsackWithBottomUp(weights, profits, capacity), 0);

    }

    @Test
    public void shouldReturnMaxProfitForGivenWeightsForBottomUpApproach() {
        int[] weights = {1, 2, 3, 5};
        int[] profits = {1, 6, 10, 16};
        int capacity = 7;
        assertEquals(knapsack.knapsackWithBottomUp(weights, profits, capacity), 22);
    }

}
