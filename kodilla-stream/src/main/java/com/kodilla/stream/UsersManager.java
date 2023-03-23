package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {

    int age = 40;
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<String> usernamesOlderThan = filterUsersOlderThan(40);
        System.out.println(usernamesOlderThan);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static List<String> filterUsersOlderThan(int age)
    {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }
    public static List<String> filterUsersByAgeAndPosts()
    {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > 300 && user.getAge() < 40)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<String> getFilteredUsernames()
    {
        List<String> expectedUserNames = filterChemistGroupUsernames();
        return expectedUserNames;
    }

    public static List<String> getFilteredAge()
    {
        List<String> expectedAge = filterUsersOlderThan(40);
        return expectedAge;
    }
    public static List<String> getFilteredPosts()
    {
        List<String> expectedPost = filterUsersByAgeAndPosts();
        return expectedPost;
    }



}
