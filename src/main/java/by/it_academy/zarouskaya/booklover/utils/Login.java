package by.it_academy.zarouskaya.booklover.utils;

import by.it_academy.zarouskaya.booklover.user.User;

public class Login {

    public void login(User user) {
        boolean exists = Users.isUserInList(user);

        if (exists) {
            System.out.println("User, " + user.getMobileNumber() + ".");
        } else {
            System.out.println("You were not registered, we have registered you. Please try logging in again.");
        }
    }

    public void register(User user) {
        if (!Users.isUserInList(user)) {
            Users.addUser(user);
        }
        System.out.println("You are registered.");
    }
}
