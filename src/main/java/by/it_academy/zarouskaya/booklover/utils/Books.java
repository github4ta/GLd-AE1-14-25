package by.it_academy.zarouskaya.booklover.utils;

import by.it_academy.zarouskaya.booklover.book.Book;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Books {

    public static List<Book> filterBooksByAuthor(List<Book> books, String authorSurname) {
        return books.stream()
                .filter(book -> book.getAuthor().getSurname().equalsIgnoreCase(authorSurname))
                .sorted(Comparator.comparing(Book::getPrice))
                .collect(Collectors.toList());
    }

    public static List<Book> filterBooksByPublisher(List<Book> books, String publisher) {
        return books.stream()
                .filter(book -> book.getPublisher().equalsIgnoreCase(publisher))
                .sorted(Comparator.comparing(Book::getPrice))
                .collect(Collectors.toList());
    }

    public static List<Book> filterBooksByIsbn(List<Book> books, String isbn) {
        return books.stream()
                .filter(book -> book.getIsbn().contentEquals(isbn))
                .sorted(Comparator.comparing(Book::getPrice))
                .collect(Collectors.toList());
    }

    public static List<Book> filterBooksByYear(List<Book> books, int year) {
        return books.stream()
                .filter(book -> book.getYear() == year)
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    public static List<Book> filterBooksByPublisherAndYear(List<Book> books, String publisher, int year) {
        return books.stream()
                .filter(book ->
                        book.getPublisher().equalsIgnoreCase(publisher)
                                && book.getYear() == year
                )
                .sorted(Comparator.comparing(Book::getPrice))
                .collect(Collectors.toList());
    }

    public static List<Book> filterBooksByAuthorAndPublisherAndYear(List<Book> books, String authorSurname, String publisher, int year) {
        return books.stream()
                .filter(book ->
                        book.getAuthor().getSurname().equalsIgnoreCase(authorSurname)
                                && book.getPublisher().equalsIgnoreCase(publisher)
                                && book.getYear() == year
                )
                .sorted(Comparator.comparing(Book::getPrice))
                .collect(Collectors.toList());
    }
}
