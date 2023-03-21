package com.kodilla.collections.adv.excercises.homework;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FlightRepositoryTestSuite {



    @Test
    public void testFindFlightsFrom()
    {

        FlightFinder flightFinder = new FlightFinder();

        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Rome"));
        expectedList.add(new Flight("Warsaw", "Milan"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo()
    {

        FlightFinder flightFinder = new FlightFinder();

        List<Flight> result = flightFinder.findFlightsTo("London");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("New York", "London"));
        expectedList.add(new Flight("Rome", "London"));
        assertEquals(expectedList, result);
    }
}