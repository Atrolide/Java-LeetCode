package org.exercises.Tests;

import org.exercises.Solutions.Ex88;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Ex88Test {
    @Test
    public void testMergeNormal() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        int[] expected = {1, 2, 2, 3, 5, 6};
        Ex88.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMerge2Empty() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        int[] expected = {1};
        Ex88.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMerge1Empty() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        int[] expected = {1};
        Ex88.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }
}
