package org.github.mahambach;

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
}