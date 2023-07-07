package org.exercises.Tests;

import org.exercises.Solutions.Ex20;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Ex20Test {
    @Test
    public void testRegularTrue() {
        String s = "()";
        assertTrue(Ex20.isValid(s));
    }

    @Test
    public void testAllTrue() {
        String s = "()[]{}";
        assertTrue(Ex20.isValid(s));
    }

    @Test
    public void testRegularSquareFalse() {
        String s = "(]";
        assertFalse(Ex20.isValid(s));
    }

    @Test
    public void testAllNestedTrue() {
        String s = "{[()]}";
        assertTrue(Ex20.isValid(s));
    }
}


