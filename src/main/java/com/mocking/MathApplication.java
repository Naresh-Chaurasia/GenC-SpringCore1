package com.mocking;

//MathApplication.java This is the class under test, which depends on CalculatorService
public class MathApplication {

    private CalculatorService calculatorService;

    // Setter for dependency injection
    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public double add(double a, double b) {
        return calculatorService.add(a, b);
    }

    public double subtract(double a, double b) {
        return calculatorService.subtract(a, b);
    }

    public double multiply(double a, double b) {
        return calculatorService.multiply(a, b);
    }

    public double divide(double a, double b) {
        return calculatorService.divide(a, b);
    }
}