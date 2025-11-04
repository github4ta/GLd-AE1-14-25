package booklover.by.author;

public class Author {
    private String surname;
    private String name;

    @Override
    public String toString() {
        return String.format("%s %s", name, surname);
    }
}
