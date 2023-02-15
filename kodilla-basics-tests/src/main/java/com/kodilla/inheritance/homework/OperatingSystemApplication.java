package com.kodilla.inheritance.homework;

public class OperatingSystemApplication {
    public static void main(String[] args)
    {
        Windows7 windows7 = new Windows7(2009);
        Windows10 windows10 = new Windows10(2015);

        windows7.turnOn();
        System.out.println("System was released in: " + windows7.getYear());
        windows7.turnOff();
        System.out.println();
        windows10.turnOn();
        System.out.println("System was released in: " + windows10.getYear());
        windows10.turnOff();









    }
}
