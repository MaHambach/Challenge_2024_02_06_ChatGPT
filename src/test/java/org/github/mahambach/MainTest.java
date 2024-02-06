package org.github.mahambach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.github.mahambach.Main.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @ValueSource(strings = {"Hello", "Java", "JUnit"})
    void testReverseString(String input) {
        String reversed = reverseString(input);
        assertEquals(reverse(input), reversed);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "123", "aAa", "!@#$%^&*()"})
    void testReverseStringWithSpecialCases(String input) {
        String reversed = reverseString(input);
        assertEquals(reverse(input), reversed);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello World", "The quick brown fox", "1234567890"})
    void testReverseStringWithSpaces(String input) {
        String reversed = reverseString(input);
        assertEquals(reverse(input), reversed);
    }

    private String reverse(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }


    @ParameterizedTest
    @ValueSource(strings = {"anna", "level", "radar", "deified"})
    void testIsPalindrome(String input) {
        assertTrue(isPalindrome(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "world", "openai", "chatbot"})
    void testIsNotPalindrome(String input) {
        assertFalse(isPalindrome(input));
    }


    @Test
    void testGetFirst5Primes() {
        int[] expected = {2, 3, 5, 7, 11};
        assertArrayEquals(expected, getFirstNPrimes(5));
    }

    @Test
    void testGetFirst10Primes() {
        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        assertArrayEquals(expected, getFirstNPrimes(10));
    }

    @Test
    void testGetFirst100Primes() {
        int[] expected = {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151,
                157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233,
                239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317,
                331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419,
                421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503,
                509, 521, 523, 541
        };
        assertArrayEquals(expected, getFirstNPrimes(100));
    }

    @Test
    void testGetFirst0Primes() {
        int[] expected = {};
        assertArrayEquals(expected, getFirstNPrimes(0));
    }
}