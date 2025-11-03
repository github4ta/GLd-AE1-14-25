package by.it_academy.zarouskaya.booklover.utils;

import by.it_academy.zarouskaya.booklover.user.User;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private static List<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    public static boolean isUserInList(User user) {
        boolean exists = users.stream()
                .anyMatch(u -> u.getMobileNumber().equals(user.getMobileNumber()));

        if (!exists) {
            users.add(user);
            return false;
        }

        return true;
    }
}
