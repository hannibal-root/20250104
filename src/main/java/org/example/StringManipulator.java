package org.example;

public class StringManipulator {

    // Concatenates two strings
    public String concatenate(String a, String b) {
        return a + b;
    }

    // Checks if a string is a palindrome
    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Replaces a substring in a string
    public String replaceSubstring(String original, String target, String replacement) {
        return original.replace(target, replacement);
    }

    // Checks if a string contains only digits
    public boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    // Returns the substring between two indices
    public String getSubstring(String str, int start, int end) {
        return str.substring(start, end);
    }
}

