package by.it_academy.tainikava.booklover;

public class Login {
    public void login(User user) {
        if (Users.isUserInList(user)) {
            System.out.println("Hello User, " + user.getPhoneNumber());
        } else {
            System.out.println("You were not registered. We have registered you now. Please, try to log in.");
        }
    }

    public void register(User user) {
        Users.addUser(user);
        System.out.println("You're registered!");
    }
}
