package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    private double h;
    private double c;
    public Triangle(double a, double b, double h, double c) {
        super(a, b);
        this.h = h;
        this.c = c;
    }

    @Override
    public void surfaceArea(double a, double b)
    {
        Triangle triangle = new Triangle(a, b, h, c);
        double result;
        result = (triangle.getA() * triangle.getH())/2;
        System.out.println("Triangle surface: " + result);

    }

    @Override
    public void circuit(double a, double b)
    {
        Triangle triangle = new Triangle(a, b, h, c);
        double result;
        result = triangle.getA()+ triangle.getB()+ triangle.getC();
        System.out.println("Trianle circuit: " + result);

    }

    public double getH()
    {
        return h;
    }
    public double getC()
    {
        return c;
    }
}
