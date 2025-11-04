package booklover.by.user;

import java.util.Objects;

public class User {
    private String phoneNumber;
    private int password;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return password == user.password && Objects.equals(phoneNumber, user.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", password=" + password +
                '}';
    }
}
