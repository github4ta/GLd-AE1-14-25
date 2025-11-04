package by.it_academy.govyadina.booklover.login;


import by.it_academy.govyadina.booklover.user.User;

import static by.it_academy.govyadina.booklover.user.Users.users;

public class Login {
    public void login(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getPhoneNumber().contains(user.getPhoneNumber())) {
                System.out.println(String.format("привет Пользователь, %s", user.getPhoneNumber()));
            } else {
                System.out.println("Вы не были зарегистрированы, мы вас зарегистрировали. Повторите вход.");
            }
        }
    }
}
