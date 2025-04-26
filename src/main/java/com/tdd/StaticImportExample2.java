package com.tdd;

import static java.lang.Math.sqrt; // Static import for Math.sqrt
import static java.lang.Math.PI; // Static import for Math.PI

public class StaticImportExample2 {
    public static void main(String[] args) {
        double result = sqrt(16); // No need to prefix with Math
        System.out.println("Square root of 16 is: " + result);

        System.out.println("Value of PI is: " + PI); // No need to prefix with Math
    }
}