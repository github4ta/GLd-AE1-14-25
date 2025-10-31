package by.it_academy.trofimova.by.booklover.login;

public class Login {
    public static void login(User user) {
        if (Users.isUserInList(user)) {
            System.out.println("Пользователь, " + user.getNumberPhone());
        } else {
            System.out.println("Вы не были зарегистрированы, мы вас зарегистрировали. Повторите вход.");
        }
    }

    public static void register(User user) {
        if (Users.isUserInList(user)) {
            System.out.println("Вы уже зарегистрированы");
        } else {
            Users.addUser(user);
            System.out.println("Поздравляем! Вы зарегистрированы");
        }
    }
}
