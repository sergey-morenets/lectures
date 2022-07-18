package java8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test that sum of two positive numbers is positive number")
    void plus_twoPositiveNumbers_resultIsPositive() {
        long sum = calculator.plus(1, 2);
        assertEquals(3, sum);
    }

    @Test
    @DisplayName("Test that sum of two big positive numbers is positive number")
    void plus_twoBigPositiveNumbers_resultIsPositive() {
        long sum = calculator.plus(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertTrue(sum > 0);
    }

    @Test
    void test() {
        String actual = "test";
        assertNotNull(actual);
        assertEquals(4, actual.length());
        assertTrue(actual.startsWith("te"));

        assertThat(actual).isNotNull().hasSize(4).startsWith("te");
    }
}
