package com.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testReverse() {
        StringUtils stringUtils = new StringUtils();
        assertEquals("cba", stringUtils.reverse("abc"));
    }

    @Test
    public void testToUpperCase() {
        StringUtils stringUtils = new StringUtils();
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }

    @Test
    public void testIsPalindrome() {
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }
}