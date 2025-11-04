package by.it_academy.sinkevich.bookLover.login;

import by.it_academy.sinkevich.bookLover.user.*;

public class Login {
    public final String LOGIN_FORMAT_REG = "^(\\+375|80)(29|25|44|33)(\\d{3})(\\d{2})(\\d{2})$";

    public void login(User user) {

        if (user.getLogin().matches(LOGIN_FORMAT_REG)) {
            if (Users.isUserInList(user)) {
                System.out.println("User " + user.getLogin() + " successfully log");
            } else {
                System.out.println("You not registered. Try again");
            }
        } else {
            System.out.println("not correct format of login, enter number ");
        }
    }

    public void register(User user) {

        if (user.getLogin().matches(LOGIN_FORMAT_REG)) {
            if (!Users.isUserInList(user)) {
                Users.addUser(user);
                System.out.println("Registration is succesfully");
            } else {
                System.out.println("You are already registered");
            }
        } else {
            System.out.println("not correct format of login, enter number ");
        }
    }
}
