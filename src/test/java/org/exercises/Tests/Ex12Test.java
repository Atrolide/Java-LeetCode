package org.exercises.Tests;
import org.exercises.Solutions.Ex12;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex12Test {
    @Test
    public void testRomanToInt24() {
        int num = 24;
        String expected = "XXIV";
        String result = Ex12.intToRoman(num);
        assertEquals(expected, result);
    }

    @Test
    public void testRomanToInt3() {
        int num = 3;
        String expected = "III";
        String result = Ex12.intToRoman(num);
        assertEquals(expected, result);
    }

    @Test
    public void testRomanToInt2137() {
        int num = 2137;
        String expected = "MMCXXXVII";
        String result = Ex12.intToRoman(num);
        assertEquals(expected, result);
    }
}
