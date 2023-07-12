package org.exercises.Solutions;

/**
 * "Remove Duplicates from Sorted Array"
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

public class Ex26 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

}
