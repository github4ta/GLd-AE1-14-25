package by.it_academy.tretyak.booklover.service;

import by.it_academy.tretyak.booklover.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Books {

    public static List<Book> filterBooksByAuthor(List<Book> books, String authorSurname) {
        List<Book> booksFilteredByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getSurname().equalsIgnoreCase(authorSurname)) {
                booksFilteredByAuthor.add(book);
            }
        }
        return booksFilteredByAuthor;
    }

    public static List<Book> filterBooksByPublisher(List<Book> books, String publisher) {
        List<Book> booksFilteredByPublisher = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                booksFilteredByPublisher.add(book);
            }
        }
        return booksFilteredByPublisher;
    }

    public static List<Book> filterBooksByIsbn(List<Book> books, String isbn) {
        List<Book> booksFilteredByIsbn = new ArrayList<>();
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                booksFilteredByIsbn.add(book);
            }
        }
        return booksFilteredByIsbn;
    }

    public static List<Book> filterBooksByYear(List<Book> books, int year) {
        List<Book> booksFilteredByYear = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                booksFilteredByYear.add(book);
            }
        }
        return booksFilteredByYear;
    }

    public static List<Book> filterBooksByPublisherAndYear(List<Book> books, String publisher, int year) {
        List<Book> booksFilteredByPublisher = filterBooksByPublisher(books, publisher);
        return filterBooksByYear(booksFilteredByPublisher, year);
    }

    public static List<Book> filterBooksByAuthorAndPublisherAndYear(
            List<Book> books, String authorSurname, String publisher, int year) {

        List<Book> booksFilteredByAuthor = filterBooksByAuthor(books, authorSurname);
        List<Book> booksFilteredByAuthorAndPublisher = filterBooksByPublisher(booksFilteredByAuthor, publisher);
        return filterBooksByYear(booksFilteredByAuthorAndPublisher, year);
    }
}