package org.exercises.Solutions;

import java.util.HashMap;
import java.util.Map;

public class Ex169 {

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> majorCount = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (majorCount.containsKey(nums[i])) {
                int val = majorCount.get(nums[i]);
                val++;
                majorCount.put(nums[i], val);
            } else {
                majorCount.put(nums[i], 1);
            }
        }

        int maxKey = 0;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : majorCount.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }
        return maxKey;

    }

}
