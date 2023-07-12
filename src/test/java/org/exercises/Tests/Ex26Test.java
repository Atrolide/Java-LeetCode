package org.exercises.Tests;

import org.exercises.Solutions.Ex26;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Ex26Test {

    @Test
    public void shortArr() {
        int[] nums = {1, 1, 2};
        int[] expected = {1, 2};

        int result = Ex26.removeDuplicates(nums);

        assertEquals(expected.length, result);

        for (int i = 0; i < result; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void longArr() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expected = {0, 1, 2, 3, 4};

        int result = Ex26.removeDuplicates(nums);

        assertEquals(expected.length, result);

        for (int i = 0; i < result; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void emptyArr() {
        int[] nums = {};
        int[] expected = {};

        int result = Ex26.removeDuplicates(nums);

        assertEquals(expected.length, result);

        for (int i = 0; i < result; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }
}
