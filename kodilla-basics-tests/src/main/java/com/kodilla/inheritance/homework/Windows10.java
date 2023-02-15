package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem{
    public Windows10(int year)
    {
        super(year);
    }
    @Override
    public void turnOn()
    {
        System.out.println("System Windows 10 is starting....");
    }
    @Override
    public void turnOff()
    {
        System.out.println("System Windows 10 is turning off...");
    }

}
