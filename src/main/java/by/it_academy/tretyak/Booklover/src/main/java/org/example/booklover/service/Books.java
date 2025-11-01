package org.example.booklover.service;

import org.example.booklover.model.Book;
import java.util.*;

public class Books {

    public static List<Book> filterBooksByAuthor(List<Book> books, String authorSurname) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getSurname().equalsIgnoreCase(authorSurname)) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> filterBooksByPublisher(List<Book> books, String publisher) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> filterBooksByIsbn(List<Book> books, String isbn) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> filterBooksByYear(List<Book> books, int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> filterBooksByPublisherAndYear(List<Book> books, String publisher, int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublisher().equalsIgnoreCase(publisher) && book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> filterBooksByAuthorAndPublisherAndYear(List<Book> books,
                                                                    String authorSurname,
                                                                    String publisher,
                                                                    int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getSurname().equalsIgnoreCase(authorSurname) &&
                    book.getPublisher().equalsIgnoreCase(publisher) &&
                    book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }
}
