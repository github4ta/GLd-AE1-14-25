package by.it_academy.govyadina.booklover.book;


import java.util.ArrayList;
import java.util.List;


public class Books {
    public static List<Book> filterBooksByAuthor(List<Book> books, String authorSurname) {
        List<Book> filteredBooksByAuthor = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().getSurname().equals(authorSurname)) {
                filteredBooksByAuthor.add(books.get(i));
            }
        }
        return filteredBooksByAuthor;
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

    public static List<Book> filterBooksByIsbn(List<Book> books, String isbn) {
        List<Book> filtedBooksByIsbn = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                filtedBooksByIsbn.add(books.get(i));
            }
        }
        return filtedBooksByIsbn;
    }

    public static List<Book> filterBooksByYear(List<Book> books, int year) {
        List<Book> filtedBooksByYear = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYear() == year) {
                filtedBooksByYear.add(books.get(i));
            }
        }
        return filtedBooksByYear;
    }

    public static List<Book> filterBooksByPublisherAndYear(List<Book> books, String publisher, int year) {
        List<Book> filtedBooksByPublisherAndYear = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublisher().equals(publisher) && books.get(i).getYear() == year) {
                filtedBooksByPublisherAndYear.add(books.get(i));
            }
        }
        return filtedBooksByPublisherAndYear;
    }

    public static List<Book> filterBooksByAuthorPublisherAndYear(List<Book> books, String authorSurname, String publisher, int year) {
        return filterBooksByYear(filterBooksByPublisher(books, publisher), year);
    }
}
