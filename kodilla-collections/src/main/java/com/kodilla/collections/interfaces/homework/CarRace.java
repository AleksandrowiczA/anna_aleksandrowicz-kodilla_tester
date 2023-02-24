package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args)
    {
        Ford ford = new Ford(0);
        doRace(ford);

        Opel opel = new Opel(0);
        doRace(opel);

        Cupra cupra = new Cupra(0);
        doRace(cupra);
    }
    private static void doRace(Car car)
    {
        System.out.println("Start!!! " + "speed = " + car.getSpeed());
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("-------------------------------------");
    }
}
