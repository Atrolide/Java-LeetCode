package org.exercises.Tests;
import org.exercises.Solutions.Ex13;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex13Test {
    @Test
    public void testRomanToInt24() {
        String romanNumeral = "XXIV";
        int expected = 24;
        int result = Ex13.romanToInt(romanNumeral);
        assertEquals(expected, result);
    }

    @Test
    public void testRomanToInt3() {
        String romanNumeral = "III";
        int expected = 3;
        int result = Ex13.romanToInt(romanNumeral);
        assertEquals(expected, result);
    }

    @Test
    public void testRomanToInt2137() {
        String romanNumeral = "MMCXXXVII";
        int expected = 2137;
        int result = Ex13.romanToInt(romanNumeral);
        assertEquals(expected, result);
    }

}
