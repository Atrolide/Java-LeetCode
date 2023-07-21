package org.exercises.Tests;

import org.exercises.Solutions.Ex169;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex169Test {
    @Test
    public void testSmallArr() {
        int[] nums = {3, 2, 3};
        int expected = 3;
        int result = Ex169.majorityElement(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testBigArr() {
        int[] nums = {2,2,1,1,1,2,2};
        int expected = 2;
        int result = Ex169.majorityElement(nums);
        assertEquals(expected, result);
    }
}
