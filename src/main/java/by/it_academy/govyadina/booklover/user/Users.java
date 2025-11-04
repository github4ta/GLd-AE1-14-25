package by.it_academy.govyadina.booklover.user;

import by.booklover.User;

import java.util.ArrayList;
import java.util.List;

public class Users {
   static List<by.booklover.User> users = new ArrayList<>();

    public static void addUser(by.booklover.User user) {
        users.add(user);
    }

    public static List<by.booklover.User> getAllUsers() {
        return users;
    }

    public static boolean isUserInList(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(user)) {
                return true;
            }
            }
                addUser(user);
            return false;
    }
}
