package org.exercises.Tests;
import org.exercises.Solutions.Ex1;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Ex1Test {
    @Test
    public void testTwoSum() {
        Ex1 ex1 = new Ex1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = ex1.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
}

