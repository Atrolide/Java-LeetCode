package org.exercises.Tests;

import org.exercises.Solutions.Ex121;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class Ex121Test {
    @Test
    public void testMaxProfitValid() {
        int[] prices = {7,1,5,3,6,4};
        int expected = 5;
        int result = Ex121.maxProfit(prices);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxProfitNone() {
        int[] prices = {7,6,4,3,1};
        int expected = 0;
        int result = Ex121.maxProfit(prices);
        assertEquals(expected, result);
    }
}
