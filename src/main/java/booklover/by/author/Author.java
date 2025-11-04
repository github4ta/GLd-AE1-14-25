package booklover.by.author;

public class Author {
    private String surname;
    private String name;

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, surname);
    }
}
