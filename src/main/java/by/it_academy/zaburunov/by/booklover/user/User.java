package by.it_academy.zaburunov.by.booklover.user;

import java.util.Objects;

public class User {
    private int number;
    private String password;

    public User(int number, String password) {
        this.number = number;
        this.password = password;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return number == user.number && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "number=" + number +
                ", password='" + password + '\'' +
                '}';
    }
}

