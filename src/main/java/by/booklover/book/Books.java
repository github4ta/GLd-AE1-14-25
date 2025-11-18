package by.booklover.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

public class Books {
    public static List<Book> filterBooksByIsbn(List<Book> books, String isbn) {
        List<Book> newBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn() == isbn) {
                newBooks.add(books.get(i));
            }
        }
        return newBooks;
    }

    public static List<Book> filterBooksByPublisher(List<Book> books, String publisher) {
        List<Book> filtedBooksByPublisher = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublisher().equals(publisher)) {
                filtedBooksByPublisher.add(books.get(i));
            }
        }
        return filtedBooksByPublisher;
    }

    public static List<Book> filterBooksByYear(List<Book> books, int year) {
        return books.stream()
                .filter(book ->
                        book.getYear() == year
                )
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

    public static List<Book> filterBooksByAuthorAndPublisherAndYear(
            List<Book> books, String authorSurname, String publisher, int year) {
        return filterBooksByPublisherAndYear(books, publisher, year).stream()
                .filter(book ->
                        book.getAuthor().getSurname().equals(authorSurname))
                .collect(Collectors.toList());
    }
}
