package by.it_academy.govyadina.booklover.user;


import java.util.*;

public class Users {
    public static List<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static List<User> getAllUsers() {
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
