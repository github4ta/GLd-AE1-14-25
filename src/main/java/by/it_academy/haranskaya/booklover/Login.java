package by.it_academy.haranskaya.booklover;


public class Login {
    public static void login(User user) {
        if (Users.isUserInList(user)) {
            System.out.println("Пользователь, " + user.getPhoneNumber());
        } else {
            System.out.println("Вы не были зарегистрированы, мы вас зарегистрировали. Повторите вход");
        }
    }

    public static void register(User user) {
        Users.addUser(user);
        System.out.println("Вы зарегистрированы.");
    }
}
