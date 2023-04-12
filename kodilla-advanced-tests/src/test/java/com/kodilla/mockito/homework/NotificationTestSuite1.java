package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Set;

import static org.testng.AssertJUnit.assertEquals;


public class NotificationTestSuite1 {
    NotificationService notificationService = new NotificationService();
    Clients client1 = Mockito.mock(Clients.class);
    Clients client2 = Mockito.mock(Clients.class);
    Clients client3 = Mockito.mock(Clients.class);

    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Location location3 = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);

   @Test
   public void shouldAddSubscriberToLocation() {
       notificationService.addSubscriber(client1, location1);
       Mockito.verify(client1, Mockito.times(1)).addLocation(location1);
   }

     @Test
     public void shouldNotAddDuplicateSubscriberToLocation() {
         notificationService.addSubscriber(client1, location1);
         notificationService.addSubscriber(client1, location1);
         notificationService.addSubscriber(client2, location1);

         Set<Clients> subscribersAtLocation1 = notificationService.getSubscribersByLocation(location1);
         assertEquals(2, subscribersAtLocation1.size());
     }

     @Test
     public void shouldRemoveSubscriberFromLocation() {
         notificationService.addSubscriber(client1, location1);
         notificationService.addSubscriber(client2, location2);

         notificationService.removeSubscriberFromLocation(client1, location1);
         notificationService.removeSubscriberFromLocation(client2, location2);

         Mockito.verify(client1, Mockito.times(1)).removeLocation(location1);
         Mockito.verify(client2, Mockito.times(1)).removeLocation(location2);
     }

     @Test
     public void shouldRemoveSubscriberFromAllLocations() {
         notificationService.addSubscriber(client1, location1);
         notificationService.addSubscriber(client1, location2);
         notificationService.addSubscriber(client1, location3);

         notificationService.removeSubscriberFromLocation(client1, location1);
         notificationService.removeSubscriberFromLocation(client1, location2);
         notificationService.removeSubscriberFromLocation(client1, location3);

         Mockito.verify(client1, Mockito.times(1)).removeLocation(location1);
         Mockito.verify(client1, Mockito.times(1)).removeLocation(location2);
         Mockito.verify(client1, Mockito.times(1)).removeLocation(location3);

     }

     @Test
     public void shouldSendNotificationToAllSubscribers() {
          notificationService.addSubscriber(client1, location1);
          notificationService.addSubscriber(client2, location1);
          notificationService.addSubscriber(client3, location2);

          notificationService.sendNotification(notification);

          Mockito.verify(client1, Mockito.times(1)).receive(notification);
          Mockito.verify(client2, Mockito.times(1)).receive(notification);
          Mockito.verify(client3, Mockito.times(1)).receive(notification);
    }

     @Test
     public void shouldSendNotificationToSubscribersOfLocation() {
         notificationService.addSubscriber(client1, location1);
         notificationService.addSubscriber(client2, location1);
         notificationService.addSubscriber(client3, location2);

         notificationService.sendNotificationToLocation(notification, location1);

         Mockito.verify(client1,Mockito.times(1)).receive(notification);
         Mockito.verify(client2,Mockito.times(1)).receive(notification);
         Mockito.verify(client3, Mockito.never()).receive(notification);
     }
}
