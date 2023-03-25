package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTestSuite {
    @Test
    void testAveragePostCountForUsersAbove40() {
        List<User> users = new ArrayList<>();
        users.add(new User("John", 40, 5, "Chemists"));
        users.add(new User("Mike", 50, 8, "Sales"));
        users.add(new User("Anna", 30, 2, "Manager"));
        users.add(new User("Julia", 35, 3, "Board"));

        double expectedAvgPostCount = 6.5;
        double actualAvgPostCount = ForumStats.getAveragePostCountForUsersAbove40(users, 40);

        assertEquals(expectedAvgPostCount, actualAvgPostCount, 0.001);
    }

    @Test
    void testAveragePostCountForUsersBelow40() {
        List<User> users = new ArrayList<>();
        users.add(new User("John", 40, 5, "Chemists"));
        users.add(new User("Mike", 50, 8, "Sales"));
        users.add(new User("Anna", 30, 2, "Manager"));
        users.add(new User("Julia", 35, 3, "Board"));

        double expectedAvgPostCount = 2.5;
        double actualAvgPostCount = ForumStats.getAveragePostCountForUsersBelow40(users, 40);

        assertEquals(expectedAvgPostCount, actualAvgPostCount, 0.001);
    }

    @Test
    public void testGetAveragePostCountForUsersBelow40ButTheresNoUsersBelow40OnTheList() {
        List<User> users = new ArrayList<>();
        users.add(new User("John", 40, 5, "Chemists"));
        users.add(new User("Mike", 50, 8, "Sales"));
        users.add(new User("Anna", 41, 2, "Manager"));
        users.add(new User("Julia", 45, 3, "Board"));

        double result = ForumStats.getAveragePostCountForUsersBelow40(users, 40);

        assertEquals(Double.NaN, result, 0.001);
    }
    @Test
    public void testGetAveragePostCountForUsersAbove40ButTheresNoUsersAbove40OnTheList() {
        List<User> users = new ArrayList<>();
        users.add(new User("John", 23, 5, "Chemists"));
        users.add(new User("Mike", 30, 8, "Sales"));
        users.add(new User("Anna", 34, 2, "Manager"));
        users.add(new User("Julia", 36, 3, "Board"));

        double result = ForumStats.getAveragePostCountForUsersAbove40(users, 40);

        assertEquals(Double.NaN, result, 0.001);
    }

    @Test
    void testGetAveragePostCountForUsersAbove40WithEmptyList() {
        List<User> users = Collections.emptyList();
        double result = ForumStats.getAveragePostCountForUsersAbove40(users, 40);
        assertEquals(Double.NaN, result, 0.001);
    }

    @Test
    void testGetAveragePostCountForUsersBelow40WithEmptyList() {
        List<User> users = Collections.emptyList();
        double result = ForumStats.getAveragePostCountForUsersBelow40(users, 40);
        assertEquals(Double.NaN, result, 0.001);
    }
    @Test
    void testGetAveragePostCountForUsersAbove40WithOneUserAbove40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Test User", 50, 10, "Test"));
        double result = ForumStats.getAveragePostCountForUsersAbove40(users, 40);
        assertEquals(10, result, 0.001);
    }
    @Test
    void testGetAveragePostCountForUsersAbove40WithOneUserBelow40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Test User", 30, 10, "Test"));
        double result = ForumStats.getAveragePostCountForUsersBelow40(users, 40);
        assertEquals(10, result, 0.001);
    }
}
