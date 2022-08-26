package capgemini.lecture1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("When we add two positive numbers we receive positive number")
        //Given-When-Then
    void sum_twoPositiveNumbers_positiveNumber() {
        assertTrue(calculator.sum(1, 2) > 0);
    }

    @Test
    @DisplayName("When we add two big positive numbers we receive positive number")
        //Given-When-Then
    void sum_twoBigPositiveNumbers_positiveNumber() {
        assertTrue(calculator.sum(Integer.MAX_VALUE, Integer.MAX_VALUE) > 0);
    }

    @Test
    @DisplayName("When we subtract big positive number from small positive number we receive expected number")
        //Given-When-Then
    void subtract_smallAndBigPositiveNumber_expectedNegativeNumber() {
        assertEquals(-4, calculator.minus(3, 7));
    }
}