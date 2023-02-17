package com.kodilla.abstracts.homework;

public class Square extends Shape{

    private double a;

    public Square(double a)
    {
        this.a = a;
    }


    @Override
    public void surfaceArea()
    {
        double surface = getA()*getA();
        System.out.println("Square Surface Area is: " + surface);

    }

    @Override
    public void circuit()
    {
        double circ = 4 * getA();
        System.out.println("Square circuit equals: " + circ);
    }

    public double getA()
    {
        return a;
    }
}
