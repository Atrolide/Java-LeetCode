package org.exercises.Tests;
import org.exercises.Solutions.Ex9;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Ex9Test {

    @Test
    public void testIsPalindromeWithNegativeNumber() {
        Ex9 ex9 = new Ex9();
        int x = -121;
        boolean result = ex9.isPalindrome(x);
        assertFalse(result);
    }

    @Test
    public void testIsPalindromeWithPositiveNumber() {
        Ex9 ex9 = new Ex9();
        int x = 121;
        boolean result = ex9.isPalindrome(x);
        assertTrue(result);
    }
}

