package com.algorithms.greedy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FractionalKnapsack {

    public static void main(String[] args) {

        Map<Double, Double> wtValPair = new HashMap<>();
        wtValPair.put(10d, 60d);
        wtValPair.put(40d, 40d);
        wtValPair.put(20d, 100d);
        wtValPair.put(30d, 120d);

        Map<Double, Double> wtProfitPair = new HashMap<>();

        wtValPair.forEach((wt, val) -> {
            double profit = val / wt;
            wtProfitPair.put(wt, profit);
        });

        Map<Double, Double> wtProfitPairSorted = getSortedMap(wtProfitPair);
        double capacity = 50;
        double maxValue = getMaxValue(wtValPair, wtProfitPairSorted, capacity);
        System.out.println(maxValue);

    }

    private static LinkedHashMap<Double, Double> getSortedMap(Map<Double, Double> wtProfitPair) {
        return wtProfitPair.entrySet().stream()
            .sorted(Map.Entry.<Double, Double>comparingByValue().reversed())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    private static double getMaxValue(Map<Double, Double> wtValPair,
                                      Map<Double, Double> wtProfitPairSorted, double capacity) {
        double maxValue = 0;

        for (Map.Entry<Double, Double> entry : wtProfitPairSorted.entrySet()) {
            if (entry.getKey() <= capacity) {
                capacity -= entry.getKey();
                maxValue += wtValPair.get(entry.getKey());
            } else if (entry.getKey() > capacity) {
                double fractionalCapacity = capacity / entry.getKey();
                capacity -= fractionalCapacity * entry.getKey();
                maxValue += wtValPair.get(entry.getKey()) * fractionalCapacity;
            }
        }

        return maxValue;
    }
}
