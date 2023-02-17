package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args)
    {
        Square square = new Square(2);
        square.surfaceArea();
        square.circuit();
        System.out.println();

        Triangle triangle = new Triangle(2, 3, 4, 5);
        triangle.surfaceArea();
        triangle.circuit();
        System.out.println();

        Rectangle rectangle = new Rectangle(3, 5);
        rectangle.surfaceArea();
        rectangle.circuit();

    }
}
