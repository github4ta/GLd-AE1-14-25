package by.it_academy.trofimova.by.booklover.login;
import java.util.Objects;

public class User {
    private long numberPhone;
    private String password;

    public User(long numberPhone, String password) {
        this.numberPhone = numberPhone;
        this.password = password;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setNumberPhone(long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "numberPhone=" + numberPhone +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return numberPhone == user.numberPhone && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPhone, password);
    }
}
