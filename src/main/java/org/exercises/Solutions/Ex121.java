package org.exercises.Solutions;

import java.util.Arrays;

public class Ex121 {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;
        int minPrice = prices[0];

        for (int i = 1; i < n; i++) {
            if (prices[i] > minPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            } else {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
