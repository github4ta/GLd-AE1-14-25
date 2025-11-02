import java.util.ArrayList;
import java.util.List;

public class Users {
    public static List<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);

    }

    public static List<User> getAllUsers() {
        return users;
    }

    public static boolean isUserInList(User user) {
        for (int i = 0; i < users.size(); i++) {
            User existingUser = users.get(i);

            if (existingUser.getPhoneNumber().equals(user.getPhoneNumber())) {
                return true;
            }
        }
        users.add(user);
        return false;
    }
}

