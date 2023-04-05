package com.kodilla.mockito.homework;

import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class NotificationTestSuite1 {
    NotificationService notificationService = new NotificationService();
    Clients client1 = Mockito.mock(Clients.class);
    Clients client2 = Mockito.mock(Clients.class);
    Clients client3 = Mockito.mock(Clients.class);

    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);

   @Test
   public void shouldAddSubscriberToLocation() {
       notificationService.addSubscriber(client1, location1);

       Set<Clients> subscribers = notificationService.getSubscribersByLocation(location1);
       Set<Clients> expectedSubscribers = new HashSet<>();
       expectedSubscribers.add(client1);
       Mockito.verify(subscribers).equals(expectedSubscribers);
       Mockito.verify(client1, Mockito.times(1)).receive(notification);
   }
//
  // @Test
  // public void shouldNotAddDuplicateSubscriberToLocation() {
  //     notificationService.addSubscriber(client1, location1);
  //     notificationService.addSubscriber(client1, location1);

  //     Set<Clients> subscribers = notificationService.getSubscribersByLocation(location1);
  //     Set<Clients> expectedSubscribers = new HashSet<>();
  //     expectedSubscribers.add(client1);
  //     Mockito.verify(subscribers).equals(expectedSubscribers);
  // }

  // @Test
  // public void shouldRemoveSubscriberFromLocation() {
  //     notificationService.addSubscriber(client1, location1);
  //     notificationService.addSubscriber(client2, location1);

  //     notificationService.removeSubscriberFromLocation(client1, location1);

  //     Set<Clients> subscribers = notificationService.getSubscribersByLocation(location1);
  //     Set<Clients> expectedSubscribers = new HashSet<>();
  //     expectedSubscribers.add(client2);
  //     Mockito.verify(subscribers).equals(expectedSubscribers);
  // }

  // @Test
  // public void shouldRemoveSubscriberFromAllLocations() {
  //     notificationService.addSubscriber(client1, location1);
  //     notificationService.addSubscriber(client1, location2);
  //     notificationService.addSubscriber(client2, location1);

  //     notificationService.removeSubscriber(client1);

  //     Set<Clients> subscribers1 = notificationService.getSubscribersByLocation(location1);
  //     Set<Clients> expectedSubscribers1 = new HashSet<>();
  //     expectedSubscribers1.add(client2);
  //     Mockito.verify(subscribers1).equals(expectedSubscribers1);

  //     Set<Clients> subscribers2 = notificationService.getSubscribersByLocation(location2);
  //     Set<Clients> expectedSubscribers2 = new HashSet<>();
  //     Mockito.verify(subscribers2).equals(expectedSubscribers2);
  // }

 // @Test
 // public void shouldSendNotificationToAllSubscribers() {
 //      notificationService.addSubscriber(client1, location1);
 //      notificationService.addSubscriber(client2, location1);
 //      notificationService.addSubscriber(client3, location2);
 //
 //      notificationService.sendNotification(notification);

 //      Mockito.verify(client1, Mockito.times(1)).receive(notification);
 //      Mockito.verify(client2, Mockito.times(1)).receive(notification);
 //      Mockito.verify(client3, Mockito.times(1)).receive(notification);
 //}

  // @Test
  // public void shouldSendNotificationToSubscribersOfLocation() {
  //     notificationService.addSubscriber(client1, location1);
  //     notificationService.addSubscriber(client2, location1);
  //     notificationService.addSubscriber(client3, location2);

  //     notificationService.sendNotification(notification);

  //     Mockito.verify(client1).receive(notification);
  //     Mockito.verify(client2).receive(notification);
  //     Mockito.verify(client3, Mockito.never()).receive(notification);
  // }
}
