package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        double a = 5;
        double b = 4;
        double c = 3;
        double h = 2;

        Square square = new Square(a,b);
        square.surfaceArea(a,b);
        square.circuit(a,b);

        Triangle triangle = new Triangle(a, b, h, c);
        triangle.surfaceArea(a, b);
        triangle.circuit(a,b);

        Rectangle rectangle = new Rectangle(a,b);
        rectangle.surfaceArea(a,b);
        rectangle.circuit(a,b);



    }
}
