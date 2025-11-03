package by.it_academy.zarouskaya.booklover.user;

import java.util.Objects;

public class User {
    private String password;
    private String mobileNumber;

    public User() {
    }

    public User(String password, String mobileNumber) {
        this.password = password;
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "User {\n" +
                "  Mobile Number: '" + mobileNumber + "'\n" +
                "  Password: '" + password + "'\n" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(password, user.password) && Objects.equals(mobileNumber, user.mobileNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, mobileNumber);
    }
}
