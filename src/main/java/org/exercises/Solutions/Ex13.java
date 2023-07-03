package org.exercises.Solutions;

import java.util.HashMap;

/**
 * "Roman to Integer"
 * https://leetcode.com/problems/roman-to-integer/
 */

public class Ex13 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (i < n - 1 && romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i + 1))) {
                total -= romanValues.get(s.charAt(i));
            } else {
                total += romanValues.get(s.charAt(i));
            }
        }
        return total;
    }
}

