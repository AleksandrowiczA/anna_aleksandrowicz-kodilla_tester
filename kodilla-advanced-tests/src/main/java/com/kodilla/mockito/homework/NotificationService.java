package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NotificationService {
    private Map<Location, Set<Clients>> subscribersByLocation = new HashMap<>();
    private Set<Clients> allSubscribers = new HashSet<>();

    public void addSubscriber(Clients clients, Location location) {
        clients.addLocation(location);
        subscribersByLocation.computeIfAbsent(location, k -> new HashSet<>()).add(clients);
        allSubscribers.add(clients);
    }


    public void removeSubscriberFromLocation(Clients clients, Location location) {
        Set<Clients> subscribers = subscribersByLocation.get(location);
        if (subscribers != null) {
            subscribers.remove(clients);
            clients.removeLocation(location);
            if (subscribers.isEmpty()) {
                subscribersByLocation.remove(location);
            }
        }
    }

   // public void removeSubscriber(Clients clients) {
   //     Set<Location> locations = clients.getLocations();
   //     for (Location location : locations) {
   //         removeSubscriberFromLocation(clients, location);
   //     }
   //     allSubscribers.remove(clients);
   // }

    public void sendNotification(Notification notification) {
        Set<Clients> clients = new HashSet<>(allSubscribers);
        clients.addAll(getSubscribersByLocation(notification.getLocation()));
        clients.forEach(client -> client.receive(notification));
    }

    public void sendNotificationToLocation(Notification notification, Location location) {
        Set<Clients> clients = new HashSet<>(getSubscribersByLocation(location));
        clients.forEach(client -> client.receive(notification));
    }


    public Set<Clients> getSubscribersByLocation(Location location) {
        Set<Clients> subscribers = subscribersByLocation.get(location);
        if (subscribers == null) {
            subscribers = new HashSet<>();
        }
        return subscribers;
    }
}

