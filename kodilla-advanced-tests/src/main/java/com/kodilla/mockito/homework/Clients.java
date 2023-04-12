package com.kodilla.mockito.homework;

import java.util.Set;

public interface Clients {
    void receive(Notification notification);

    Set<Location> getLocations();

    void addLocation(Location location);

    void removeLocation(Location location);

}
