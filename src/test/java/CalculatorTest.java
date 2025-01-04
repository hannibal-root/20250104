import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int result = calculator.add(3, 5);
        // Assert
        assertEquals(8, result, "3 + 5 = 8");
    }

    @Test
    public void testSubtract() {

        Calculator calculator = new Calculator();

        int result = calculator.subtract(10, 4);
        assertEquals(6, result, "10-4=6");
    }
}
