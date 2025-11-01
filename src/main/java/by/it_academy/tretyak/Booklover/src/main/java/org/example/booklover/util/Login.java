package org.example.booklover.util;

import org.example.booklover.model.User;
import org.example.booklover.service.Users;

public class Login {

    public void login(User user) {
        if (Users.getAllUsers().contains(user)) {
            System.out.println("Привет, Пользователь " + user.getPhoneNumber());
        } else {
            System.out.println("Вы не были зарегистрированы, мы вас зарегистрировали. Повторите вход.");
            Users.addUser(user);
        }
    }

    public void register(User user) {
        Users.addUser(user);
        System.out.println("Вы зарегистрированы");
    }
}