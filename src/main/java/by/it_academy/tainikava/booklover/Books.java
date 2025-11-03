package by.it_academy.tainikava.booklover;

import java.util.ArrayList;
import java.util.List;

public class Books {
    public static List<Book> filterBooksByAuthor(List<Book> books, String authorSurname) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().getSurname().equals(authorSurname)) {
                booksByAuthor.add(books.get(i));
            }
        }
        return booksByAuthor;
    }

    public static List<Book> filterBooksByPublisher(List<Book> books, String publisher) {
        List<Book> booksByPublisher = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublisher().equals(publisher)) {
                booksByPublisher.add(books.get(i));
            }
        }
        return booksByPublisher;
    }

    public static List<Book> filterBooksByIsbn(List<Book> books, String isbn) {
        List<Book> booksByIsbn = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                booksByIsbn.add(books.get(i));
            }
        }
        return booksByIsbn;
    }

    public static List<Book> filterBooksByYear(List<Book> books, int year) {
        List<Book> booksByYear = new ArrayList<>();
        for (int i =0; i < books.size(); i++) {
            if (books.get(i).getYear() == year) {
                booksByYear.add(books.get(i));
            }
        }
        return booksByYear;
    }

    public static List<Book> filterBooksByPublisherAndYear(List<Book> books, String publisher, int year) {
        List<Book> booksByPublisherAndYear = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublisher().equals(publisher) && books.get(i).getYear() == year) {
                booksByPublisherAndYear.add(books.get(i));
            }
        }
        return booksByPublisherAndYear;
    }

    public static List<Book> filterBooksByAuthorAndPublisherAndYear(List<Book> books, String authorSurname,
                                                                    String publisher, int year) {
        List<Book> booksByAuthorAndPublisherAndYear = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().getSurname().equals(authorSurname) &&
                    books.get(i).getPublisher().equals(publisher) && books.get(i).getYear() == year) {
                booksByAuthorAndPublisherAndYear.add(books.get(i));
            }
        }
        return booksByAuthorAndPublisherAndYear;
    }
}
