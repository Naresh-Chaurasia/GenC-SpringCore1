package com.tdd;

public class StringUtils {

    // Reverses a string
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Converts a string to uppercase
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // Checks if a string is a palindrome
    public boolean isPalindrome(String input) {
        String reversed = reverse(input);
        return input.equalsIgnoreCase(reversed);
    }
}