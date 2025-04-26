package com.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SampleServiceTest {

    private SampleService sampleService;

    @BeforeAll
    public static void setupBeforeAll() {
        System.out.println("Executing @BeforeAll - Runs once before all tests");
    }

    @BeforeEach
    public void setupBeforeEach() {
        System.out.println("Executing @BeforeEach - Runs before each test");
        sampleService = new SampleService(); // Initialize the service before each test
    }

    @Test
    public void testAdd() {
        System.out.println("Executing testAdd");
        assertEquals(5, sampleService.add(2, 3), "Addition result should be 5");
    }

    @Test
    public void testGetMessage() {
        System.out.println("Executing testGetMessage");
        assertNull(sampleService.getMessage(), "Message should be null");
    }

    @Test
    public void testIsEven() {
        System.out.println("Executing testIsEven");
        assertFalse(sampleService.isEven(3), "3 is not an even number");
    }

    @Test
    public void testGetNumbers() {
        System.out.println("Executing testGetNumbers");
        int[] expected = { 1, 2, 3, 4, 5 };
        assertArrayEquals(expected, sampleService.getNumbers(), "Arrays should match");
    }

    @AfterEach
    public void teardownAfterEach() {
        System.out.println("Executing @AfterEach - Runs after each test");
        sampleService = null; // Cleanup after each test
    }

    @AfterAll
    public static void teardownAfterAll() {
        System.out.println("Executing @AfterAll - Runs once after all tests");
    }
}