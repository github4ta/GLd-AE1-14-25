package by.it_academy.tretyak.booklover.service;

import by.it_academy.tretyak.booklover.model.User;

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
        if (users.contains(user)) {
            return true;
        } else {
            addUser(user);
            return false;
        }
    }
}
