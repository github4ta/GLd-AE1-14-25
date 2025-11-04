package booklover.by.user;

public class User {
    private String phoneNumber;
    private int password;

    @Override
    public String toString() {
        return "User{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", password=" + password +
                '}';
    }
}
