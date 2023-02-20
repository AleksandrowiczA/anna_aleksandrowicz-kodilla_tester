package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 3;
        double b = 8;
        double c = 2;

        double sumResult = calculator.sum(a, b);
        double subtractionResult = calculator.subtraction(a, b);
        double squareResult = calculator.square(a, c);
        boolean correctSum = ResultChecker.assertEquals(11, sumResult);
        boolean correctSubtr = ResultChecker.assertEquals(-5, subtractionResult);
        boolean correctSquare = ResultChecker.assertEquals(9, squareResult);


        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (correctSubtr) {
            System.out.println("Metoda subtraction działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtraction nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (correctSquare) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }

    }
}
