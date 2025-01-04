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
}
