package com.mocking;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MathApplicationTest {

    @Test
    public void testAdd() {
        // Create a mock of CalculatorService
        CalculatorService calculatorService = Mockito.mock(CalculatorService.class);

        // Create an instance of MathApplication and inject the mock
        MathApplication mathApplication = new MathApplication();
        mathApplication.setCalculatorService(calculatorService);

        // Define behavior of the mock
        when(calculatorService.add(10.0, 20.0)).thenReturn(30.0);

        // Test the add method
        assertEquals(30.0, mathApplication.add(10.0, 20.0));

        // Verify that the add method was called once
        verify(calculatorService, times(1)).add(10.0, 20.0);
    }

    @Test
    public void testSubtract() {
        // Create a mock of CalculatorService
        CalculatorService calculatorService = Mockito.mock(CalculatorService.class);

        // Create an instance of MathApplication and inject the mock
        MathApplication mathApplication = new MathApplication();
        mathApplication.setCalculatorService(calculatorService);

        // Define behavior of the mock
        when(calculatorService.subtract(20.0, 10.0)).thenReturn(10.0);

        // Test the subtract method
        assertEquals(10.0, mathApplication.subtract(20.0, 10.0));

        // Verify that the subtract method was called once
        verify(calculatorService, times(1)).subtract(20.0, 10.0);
    }
}