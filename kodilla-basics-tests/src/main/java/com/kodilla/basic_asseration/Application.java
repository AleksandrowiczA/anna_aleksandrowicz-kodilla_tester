package com.kodilla.basic_asseration;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 8;

        int sumResult = calculator.sumUP(a, b);
        int subtractionResult = calculator.subtraction(a, b);
        int squareResult = calculator.square(a);
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
