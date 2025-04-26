package com.tdd;

public class SampleService {

    public int add(int a, int b) {
        return a + b;
    }

    public String getMessage() {
        return null; // Simulates a method that may return null
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int[] getNumbers() {
        return new int[] { 1, 2, 3, 4, 5 };
    }
}