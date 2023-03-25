package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {
    public static void main(String[] args) {

        List<User> users = UsersRepository.getUsersList();

        double avgPostCountAbove40 = getAveragePostCountForUsersAbove40(users, 40);
        double avgPostCountBelow40 = getAveragePostCountForUsersBelow40(users, 40);

        System.out.println("Average post count for users above age 40: " + avgPostCountAbove40);
        System.out.println("Average post count for users below age 40: " + avgPostCountBelow40);
    }

    public static double getAveragePostCountForUsersAbove40(List<User> users, int age) {
        Double averageOfPost = users.stream()
                .filter(user -> user.getAge() >= age)
                .mapToDouble(n -> n.getNumberOfPost())
                .average()
                .orElse(Double.NaN);
        return averageOfPost;
    }

    public static double getAveragePostCountForUsersBelow40(List<User> users, int age) {
        Double averageOfPost = users.stream()
                .filter(user -> user.getAge() < age)
                .mapToDouble(n -> n.getNumberOfPost())
                .average()
                .orElse(Double.NaN);
        return averageOfPost;
    }

}
