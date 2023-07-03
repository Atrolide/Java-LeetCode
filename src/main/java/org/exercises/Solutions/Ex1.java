package org.exercises.Solutions;

/**
 * "Two Sum"
 * https://leetcode.com/problems/two-sum/
 */

//TODO: Optimize Runtime and Memory usage


public class Ex1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}