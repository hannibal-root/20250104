import org.example.StringManipulator;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {

    StringManipulator manipulator = new StringManipulator();

    @Test
    public void testConcatenate() {
        assertEquals("HelloWorld", manipulator.concatenate("Hello", "World"), "Concatenation should work as expected");
    }

    @Test
    public void testIsPalindromeTrue() {
        assertTrue(manipulator.isPalindrome("madam"), "madam should be a palindrome");
    }

    @Test
    public void testIsPalindromeFalse() {
        assertFalse(manipulator.isPalindrome("hello"), "hello should not be a palindrome");
    }

    @Test
    public void testEmptyString() {
        assertTrue(manipulator.isPalindrome(""), "Empty string should be considered a palindrome");
    }

    @ParameterizedTest
    @ValueSource(strings = {"madam", "racecar", "level", "radar", "civic"})  // Palindromes
    void testIsPalindromeTrue(String input) {
        assertTrue(manipulator.isPalindrome(input), input + " should be a palindrome");
    }

    @ParameterizedTest
    @CsvSource({
            "'hello', 'HELLO', true",    // Equal strings (case insensitive)
            "'java', 'JAVA', true",      // Equal strings (case insensitive)
            "'world', 'world', true",    // Equal strings
            "'openai', 'OpenAI', true",  // Equal strings (case insensitive)
            "'apple', 'orange', false"})
    void testAreStringsEqualIgnoreCase(String str1, String str2, boolean expected) {
        // The test checks whether the two strings are equal ignoring case
        assertEquals(expected, manipulator.areStringsEqualIgnoreCase(str1, str2),
                "The strings " + str1 + " and " + str2 + " should be " + (expected ? "equal" : "not equal"));
    }

    @Test
    public void testReplaceSubstring() {

        assertEquals("almabokor", manipulator.replaceSubstring("almafa", "fa", "bokor"), "almabokor");
    }
    @Test
    public void testisNumericTrue(){
        assertTrue(manipulator.isNumeric("56"),"56 should be a number");
    }
    @Test
    public void testisNumericFalse(){
        assertFalse(manipulator.isNumeric("5hat"),"5hat contains letters");
    }

}
