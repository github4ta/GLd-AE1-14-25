package org.example.booklover.service;

import org.example.booklover.model.User;
import java.util.*;

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