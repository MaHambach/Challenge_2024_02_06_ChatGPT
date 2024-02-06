package org.github.mahambach;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // Method to reverse a given string
    public static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Initialize variables for start and end indices
        int start = 0;
        int end = charArray.length - 1;

        // Reverse the characters in the array
        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move start and end indices inward
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }

    // Function to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}