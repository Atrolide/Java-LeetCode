package org.exercises.Tests;
import org.exercises.Solutions.Ex14;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex14Test {
    @Test
    public void testCaseFL() {
        String[] strs= {"flower","flow","flight"};
        String expected = "fl";
        String result = Ex14.longestCommonPrefix(strs);
        assertEquals(expected, result);
    }

    @Test
    public void testCaseNone() {
        String[] strs= {"dog", "race", "car"};
        String expected = "";
        String result = Ex14.longestCommonPrefix(strs);
        assertEquals(expected, result);
    }
}
