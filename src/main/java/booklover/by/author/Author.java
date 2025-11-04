package booklover.by.author;

public class Author {
    private String surname;
    private String name;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
}
