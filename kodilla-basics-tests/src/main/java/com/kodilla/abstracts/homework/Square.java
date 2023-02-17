package com.kodilla.abstracts.homework;

public class Square extends Shape{


    private double a;
    private double b;

    public Square(double a, double b) {
        super(a,b);
    }

    @Override
    public void surfaceArea(double a, double b)
    {
      Square square = new Square(a, b);
      double result;
      result = square.getA()*square.getA();
        System.out.println("Square surface: " + result);
    }

    @Override
    public void circuit(double a, double b)
    {
        Square square = new Square(a, b);
        double result;
        result = square.getA() * 4;
        System.out.println("Square circuit: " + result);
    }

}
