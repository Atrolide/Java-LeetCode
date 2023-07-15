package org.exercises.Solutions;

/**
 * "Remove Element"
 * https://leetcode.com/problems/remove-element/
 */

public class Ex27 {
    public static int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
