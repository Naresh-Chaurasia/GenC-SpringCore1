package com.tdd.assertions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsExampleTest {

    @Test
    public void testAssertEquals() {
        int expected = 10;
        int actual = 5 + 5;
        assertEquals(expected, actual, "Values should be equal");
    }

    @Test
    public void testAssertNotEquals() {
        int unexpected = 15;
        int actual = 5 + 5;
        assertNotEquals(unexpected, actual, "Values should not be equal");
    }

    @Test
    public void testAssertTrue() {
        assertTrue(5 > 3, "Condition should be true");
    }

    @Test
    public void testAssertFalse() {
        assertFalse(5 < 3, "Condition should be false");
    }

    @Test
    public void testAssertNull() {
        String str = null;
        assertNull(str, "Object should be null");
    }

    @Test
    public void testAssertNotNull() {
        String str = "JUnit 5";
        assertNotNull(str, "Object should not be null");
    }

    @Test
    public void testAssertArrayEquals() {
        int[] expectedArray = { 1, 2, 3 };
        int[] actualArray = { 1, 2, 3 };
        assertArrayEquals(expectedArray, actualArray, "Arrays should be equal");
    }

    @Test
    public void testAssertIterableEquals() {
        List<String> expectedList = List.of("A", "B", "C");
        List<String> actualList = List.of("A", "B", "C");
        assertIterableEquals(expectedList, actualList, "Iterables should be equal");
    }

    @Test
    public void testAssertThrows() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        }, "Should throw ArithmeticException");
    }


}