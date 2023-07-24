package org.exercises.Tests;

import org.exercises.Solutions.Ex151;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex151Test {
    @Test
    public void testReverseStringNormal() {
        String input = "the sky is blue";
        String expected = "blue is sky the";
        String result = Ex151.reverseWords(input);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseStringLeadingSpace() {
        String input = "   hello world";
        String expected = "world hello";
        String result = Ex151.reverseWords(input);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseStringTrailingSpace() {
        String input = "hello world   ";
        String expected = "world hello";
        String result = Ex151.reverseWords(input);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseStringManySpaces() {
        String input = "   the   grass  is             green  ";
        String expected = "green is grass the";
        String result = Ex151.reverseWords(input);
        assertEquals(expected, result);
    }
}

