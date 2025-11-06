package by.it_academy.sinkevich.bookLover.book;

import java.util.*;

public class Books {

    public Books() {
    }

    public static List<Book> filterBooksByAuthor(List<Book> books, String authorsurname) {

        List<Book> bookByAuthor = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().getSurname().matches(authorsurname)) {
                bookByAuthor.add(books.get(i));
            }
        }
        return bookByAuthor;
    }

    public static List<Book> filterBooksByPublisher(List<Book> books, String publisher) {

        List<Book> bookByPublisher = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublisher().matches(publisher)) {
                bookByPublisher.add(books.get(i));
            }
        }
        return bookByPublisher;
    }

    public static List<Book> filterBooksByIsbn(List<Book> books, Integer isbn) {

        List<Book> bookByIsbn = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                bookByIsbn.add(books.get(i));
            }
        }
        return bookByIsbn;
    }

    public static List<Book> filterBooksByYear(List<Book> books, Integer year) {

        List<Book> bookByYear = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYear().equals(year)) {
                bookByYear.add(books.get(i));
            }
        }
        return bookByYear;
    }

    public static List<Book> filterBooksByPublisherAndYear(List<Book> books, String publisher, Integer year) {

        List<Book> bookByPublisherAndYear = new ArrayList<>();
        bookByPublisherAndYear.addAll(filterBooksByYear(filterBooksByPublisher(books, publisher), year));
        if (bookByPublisherAndYear.size() == 1) {
            bookByPublisherAndYear.clear();
        }
        return bookByPublisherAndYear;
    }

    public static List<Book> filterBooksByAuthorAndPublisherAndYear(List<Book> books, String author, String publisher, Integer year) {

        List<Book> bookByAuthorAndPublisherAndYear = new ArrayList<>();
        bookByAuthorAndPublisherAndYear.addAll(filterBooksByYear(filterBooksByPublisher(filterBooksByAuthor(books, author), publisher), year));
        if (bookByAuthorAndPublisherAndYear.size() == 1) {
            bookByAuthorAndPublisherAndYear.clear();
        }
        return bookByAuthorAndPublisherAndYear;
    }
}
