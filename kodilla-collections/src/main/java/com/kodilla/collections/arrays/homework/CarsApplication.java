package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Cupra;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    private static final Random RANDOM = new Random();

    public static void main(String[] args)
    {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar()
    {
        int drawnCarBrand = RANDOM.nextInt(3);
        int a = getRandomIncreaseSpeed();
        if (drawnCarBrand == 0)
            return new Ford(a);
        else if (drawnCarBrand == 1)
            return new Opel(a);
        else {
            return new Cupra(a);
        }

    }
    private static int getRandomIncreaseSpeed() {
        return RANDOM.nextInt(160+1 - 100) + 100;
    }
}
