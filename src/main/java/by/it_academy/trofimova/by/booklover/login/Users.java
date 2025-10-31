package by.it_academy.trofimova.by.booklover.login;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private static List<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static List<User> getAllUsers() {
        return users;
    }

    public static boolean isUserInList(User user) {
        boolean flag = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(user)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            users.add(user);
        }
        return flag;
    }


}
