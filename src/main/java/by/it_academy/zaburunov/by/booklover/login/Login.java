package by.it_academy.zaburunov.by.booklover.login;

import by.it_academy.zaburunov.by.booklover.user.User;
import by.it_academy.zaburunov.by.booklover.user.Users;

public class Login {
    public void login(by.it_academy.zaburunov.by.booklover.user.User user) {
        if (by.it_academy.zaburunov.by.booklover.user.Users.isUserInList(user)) {
            System.out.printf("Привет  «Пользователь" + " %s»" + "\n", user.getNumber());
        } else {
            Users.addUser(user);
            System.out.printf("«%s Вы не были зарегистрированы, мы вас зарегистрировали. Повторите вход.» \n",
                    user.getNumber());
        }
    }

    public void register(User user) {
        if (Users.isUserInList(user)) {
            System.out.println("Такой пользователь уже существует");
        } else {
            Users.addUser(user);
            System.out.println("Вы зарегистрированы");
        }
    }
}

