package org.exercises.Tests;

import org.exercises.Solutions.Ex27;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Ex27Test {
    @Test
    public void testRemoveElementSmall() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] expectedNums = {2, 2};
        int expectedLength = expectedNums.length;

        int k = Ex27.removeElement(nums, val);

        assertEquals(expectedLength, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    public void testRemoveElementBig() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int[] expectedNums = {0,1,3,0,4};
        int expectedLength = expectedNums.length;

        int k = Ex27.removeElement(nums, val);

        assertEquals(expectedLength, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}
