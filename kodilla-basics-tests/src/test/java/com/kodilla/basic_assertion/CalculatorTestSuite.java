package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5.6;
        double b = 5.8;
        double sumResult = calculator.sum(a, b);
        assertEquals(11.4, sumResult, 11.4);
    }
    @Test
    public void testSubstr() {
        Calculator calculator = new Calculator();
        double a = 10;
        double b = 8;
        double subtractionResult = calculator.subtraction(a, b);
        assertEquals(2, subtractionResult);
    }
    @Test
    public void testPow() {
        Calculator calculator = new Calculator();
        double a = 11;
        double c = 2;
        double squareResult = calculator.square(a, c);
        assertEquals(121, squareResult);
    }

}
