package com.algorithms.dynamic;

public class Knapsack {

    public int knapsackRecursive(int[] weights, int[] profits, int capacity, int currentIndex) {
        if (capacity <= 0 || currentIndex >= profits.length)
            return 0;

        int profitWithCurrentIndex = 0;
        if (weights[currentIndex] <= capacity)
            profitWithCurrentIndex = profits[currentIndex] + knapsackRecursive(weights, profits, capacity - weights[currentIndex], currentIndex + 1);

        int profitSkippingCurrentIndex = knapsackRecursive(weights, profits, capacity, currentIndex + 1);
        return Math.max(profitWithCurrentIndex, profitSkippingCurrentIndex);
    }

    public int knapsackRecursiveWithTopDown(int[] weights, int[] profits, int capacity, int currentIndex, int[][] dp) {
        if (capacity <= 0 || currentIndex >= profits.length)
            return 0;

        if (dp[currentIndex][capacity] != 0)
            return dp[currentIndex][capacity];

        int profitWithCurrentIndex = 0;
        if (weights[currentIndex] <= capacity)
            profitWithCurrentIndex = profits[currentIndex] + knapsackRecursive(weights, profits, capacity - weights[currentIndex], currentIndex + 1);

        int profitSkippingCurrentIndex = knapsackRecursive(weights, profits, capacity, currentIndex + 1);
        dp[currentIndex][capacity] = Math.max(profitWithCurrentIndex, profitSkippingCurrentIndex);

        return dp[currentIndex][capacity];
    }


    public int knapsackWithBottomUp(int[] weights, int[] profits, int capacity) {
        if (capacity <= 0 || profits.length == 0 || profits.length != weights.length)
            return 0;

        int n = weights.length;
        int[][] dp = new int[n][capacity + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 0;
        }

        for (int c = 1; c <= capacity; c++) {
            if (weights[0] < capacity) {
                dp[0][c] = profits[0];
            }
        }

        for (int i = 1; i < n; i++)
            for (int c = 1; c <= capacity; c++) {

                int profit1 = 0;
                int profit2;

                if (weights[i] <= c) profit1 = profits[i] + dp[i - 1][c - weights[i]];

                profit2 = dp[i - 1][c];

                dp[i][c] = Math.max(profit1, profit2);
            }


        return dp[n-1][capacity];
    }
}
