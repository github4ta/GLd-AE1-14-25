package booklover.by.book;

import booklover.by.author.Author;

import java.util.Objects;

public class Book {
    private Author author;
    private String title;
    private int year;
    private String publisher;
    private String isbn;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Double.compare(price, book.price) == 0 && Objects.equals(author, book.author) && Objects.equals(title, book.title) && Objects.equals(publisher, book.publisher) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, year, publisher, isbn, price);
    }
}
