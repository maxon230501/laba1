package demo.parallel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void testUnn() {
        // Arrange
        Complex num1 = new Complex(2, 3);
        Complex num2 = new Complex(4, 5);

        // Act
        num1.unn(num2);

        // Assert
        assertEquals("8.0 + 15.0i", num1.toString(), "Complex number does not match expected result");
    }
}
