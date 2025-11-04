package by.it_academy.haranskaya.booklover;

import java.util.ArrayList;
import java.util.List;

public class Books {
    public static List<Book> filterBooksByAuthor(List<Book> books, String authorSurname) {
        List<Book> newBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().getSurname() == authorSurname) {
                newBooks.add(books.get(i));
            }
        }
        return newBooks;
    }

    public static List<Book> filterBooksByPublisher(List<Book> books, String publisher) {
        List<Book> newBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublisher() == publisher) {
                newBooks.add(books.get(i));
            }
        }
        return newBooks;
    }

    public static List<Book> filterBooksByIsbn(List<Book> books, String isbn) {
        List<Book> newBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn() == isbn) {
                newBooks.add(books.get(i));
            }
        }
        return newBooks;
    }

    public static List<Book> filterBooksByYear(List<Book> books, int year) {
        List<Book> newBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYear() == year) {
                newBooks.add(books.get(i));
            }
        }
        return newBooks;
    }

    public static List<Book> filterBooksByPublisherAndYear(List<Book> books, String publisher, int year) {
        List<Book> newBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublisher() == publisher && books.get(i).getYear() == year) {
                newBooks.add(books.get(i));
            }
        }
        return newBooks;
    }

    public static List<Book> filterBooksByAuthorAndPublisherAndYear(List<Book> books, String authorSurname, String publisher, int year) {
        List<Book> newBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().getSurname() == authorSurname && books.get(i).getPublisher() == publisher && books.get(i).getYear() == year) {
                newBooks.add(books.get(i));
            }
        }
        return newBooks;
    }
}
