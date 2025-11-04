package by.it_academy.govyadina.booklover.login;

import by.booklover.User;

import static by.booklover.Users.users;

public class Login {

    public void login(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getPhoneNumber().contains(user.getPhoneNumber())) {
                System.out.println("привет " + "Пользователь, " + user.getPhoneNumber());
            } else {
                System.out.println("Вы не были зарегистрированы, мы вас зарегистрировали. Повторите вход.");
            }
        }
        }
    }
