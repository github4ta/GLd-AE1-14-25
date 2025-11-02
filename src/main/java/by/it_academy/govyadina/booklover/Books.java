package by.it_academy.govyadina.booklover;

import by.booklover.Book;

import java.util.ArrayList;
import java.util.List;

public class Books {
    public static List<by.booklover.Book> filterBooksByAuthor(List<by.booklover.Book> books, String authorSurname) {
        List<by.booklover.Book> newBooksByAuthors = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().getSurname().equals(authorSurname)) {
                newBooksByAuthors.add(books.get(i));
            }
        }
        return newBooksByAuthors;
    }

    public static List<by.booklover.Book> filterBooksByPublisher(List<by.booklover.Book> books, String publisher) {
        List<by.booklover.Book> newBooksByPublishers = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublisher().equals(publisher)) {
                newBooksByPublishers.add(books.get(i));
            }
        }
        return newBooksByPublishers;
    }

    public static List<by.booklover.Book> filterBooksByIsbn(List<by.booklover.Book> books, String isbn) {
        List<by.booklover.Book> newBooksByIsbns = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                newBooksByIsbns.add(books.get(i));
            }
        }
        return newBooksByIsbns;
    }

    public static List<by.booklover.Book> filterBooksByYear(List<by.booklover.Book> books, int year) {
        List<by.booklover.Book> newBooksByYears = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYear() == year) {
                newBooksByYears.add(books.get(i));
            }
        }
        return newBooksByYears;
    }

    public static List<by.booklover.Book> filterBooksByPublisherAndYear(List<by.booklover.Book> books, String publisher, int year) {
        List<by.booklover.Book> newBooksByPublisherAndYear = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublisher().equals(publisher) && books.get(i).getYear() == year) {
                newBooksByPublisherAndYear.add(books.get(i));
            }
        }
        return newBooksByPublisherAndYear;
    }

    public static List<by.booklover.Book> filterBooksByAuthorAndPublisherAndYear(List<by.booklover.Book>books, String authorSurname, String publisher, int year){
        List<Book> newBooksByAuthorAndPublisherAndYear = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().getSurname().equals(authorSurname) && books.get(i).getPublisher().equals(publisher) && books.get(i).getYear() == year){
                newBooksByAuthorAndPublisherAndYear.add(books.get(i));
            }
        }
        return newBooksByAuthorAndPublisherAndYear;
    }
}
