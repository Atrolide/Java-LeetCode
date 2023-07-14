package org.exercises.Solutions;

/**
 * "Merge Sorted Array"
 * https://leetcode.com/problems/merge-sorted-array/
 */

public class Ex88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];
        int index1 = 0;
        int index2 = 0;
        int indexMerged = 0;

        while (index1 < m && index2 < n) {
            if (nums1[index1] <= nums2[index2]) {
                merged[indexMerged++] = nums1[index1++];
            } else {
                merged[indexMerged++] = nums2[index2++];
            }
        }

        while (index1 < m) {
            merged[indexMerged++] = nums1[index1++];
        }

        while (index2 < n) {
            merged[indexMerged++] = nums2[index2++];
        }
        for (int i = 0; i < merged.length; i++) {
            nums1[i] = merged[i];
        }
    }
}
