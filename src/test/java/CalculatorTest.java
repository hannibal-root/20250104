import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
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

    @Test
    public void testMultiply(){

        Calculator calculator = new Calculator();

        int result = calculator.multiply(5,5);

        assertEquals(25, result,"5 * 5 = 25");
    }

    @Test
    public void testDivide() {

        Calculator calculator = new Calculator();

        double result = calculator.divide(21,7);

        assertEquals(3, result, "21 / 7 = 3");

    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
