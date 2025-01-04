import org.example.NumberUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberUtilsTest {

    NumberUtils numberUtils = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10}) // Testing with even numbers
    void testIsEven(int number) {
        assertTrue(numberUtils.isEven(number), number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9}) // Testing with odd numbers
    void testIsOdd(int number) {
        assertFalse(numberUtils.isEven(number), number + " should be odd");
    }
}
