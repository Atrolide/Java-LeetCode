package org.exercises.Tests;

import org.exercises.Solutions.Ex135;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex135Test {
    @Test
    public void testCandySmall() {
        int[] ratings = {1, 0, 2};
        int expected = 5;
        int result = Ex135.candy(ratings);
        assertEquals(expected, result);
    }

    @Test
    public void testCandyBig() {
        int[] ratings = {1,3,4,5,2};
        int expected = 11;
        int result = Ex135.candy(ratings);
        assertEquals(expected, result);
    }

}
