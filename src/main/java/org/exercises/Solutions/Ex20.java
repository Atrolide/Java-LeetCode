package org.exercises.Solutions;

import java.util.ArrayDeque;

/**
 * "Valid Parentheses"
 * https://leetcode.com/problems/valid-parentheses/
 */
public class Ex20 {
    public static boolean isValid(String s) {
        ArrayDeque<Character> validator = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                validator.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (validator.isEmpty()) {
                    return false;
                }
                char last = validator.pop();
                if ((c == ')' && last != '(') ||
                        (c == ']' && last != '[') ||
                        (c == '}' && last != '{')) {
                    return false;
                }
            }

        }
        return validator.isEmpty();
    }
}
