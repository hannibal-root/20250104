import org.example.StringManipulator;
import org.junit.Test;

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
