package com.kodilla.collections.adv.excercises.homework;

import java.util.*;

public class FlightFinder
{
    public List<Flight> findFlightsFrom(String departure)
    {
       List<Flight> availableFlights = FlightRepository.getFlightsTable();
       List<Flight> flights = new ArrayList<>();
        for (Flight flight : availableFlights)
        {
            if (flight.getDeparture().equals(departure))
                flights.add(flight);
        }
        return flights;
    }

    public List<Flight> findFlightsTo(String arrival)
    {
        List<Flight> availableFlights = FlightRepository.getFlightsTable();
        List<Flight> flights = new ArrayList<>();
        for (Flight flight : availableFlights)
        {
            if (flight.getArrival().equals(arrival))
                flights.add(flight);
        }
        return flights;
    }
}

