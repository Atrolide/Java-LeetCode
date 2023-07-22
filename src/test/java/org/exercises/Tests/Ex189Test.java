package org.exercises.Tests;

import org.exercises.Solutions.Ex189;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Ex189Test {
    @Test
    public void testRotate1() {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] expected = {5,6,7,1,2,3,4};
        Ex189.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testRotate2() {
        int[] nums = {-1,-100,3,99};
        int k = 2;
        int[] expected = {3,99,-1,-100};
        Ex189.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testRotate3() {
        int[] nums = {-1};
        int k = 2;
        int[] expected = {-1};
        Ex189.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
}
