package by.it_academy.zaburunov.by.booklover.book;

import java.util.ArrayList;
import java.util.List;

public class Books {
    public static List<Book> filterBooksByAuthor(List<Book> books, String authorSurname) {

        List<Book> resultListByAuthor = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {

            Book book = books.get(i);
            String bookAuthorSurname = book.getAuthor().getSurname();

            if (bookAuthorSurname.equals(authorSurname)) {
                resultListByAuthor.add(book);
            }
        }

        return resultListByAuthor;
    }

    public static List<Book> filterBooksByPublisher(List<Book> books, String publisher) {

        List<Book> resultListByPublisher = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {

            Book book = books.get(i);
            String bookPublisher = book.getPublisher();

            if (bookPublisher.equals(publisher)) {
                resultListByPublisher.add(book);
            }
        }

        return resultListByPublisher;
    }

    public static List<Book> filterBooksByIsbn(List<Book> books, String isbn) {

        List<Book> resultListByIsbn = new ArrayList<>();

        for (Book book : books) {

            if (book.getIsbn().equals(isbn)) {
                resultListByIsbn.add(book);
            }

        }

        return resultListByIsbn;
    }

    public static List<Book> filterBooksByYear(List<Book> books, int year) {

        List<Book> resultListByYear = new ArrayList<>();

        for (Book book : books) {

            if (book.getYear() == year) {
                resultListByYear.add(book);
            }

        }

        return resultListByYear;
    }

    public static List<Book> filterBooksByPublisherAndYear(List<Book> books, String publisher, int year) {

        List<Book> resultByPublisherAndYear = new ArrayList<>();

        for (Book currentBook : books) {
            if(currentBook.getPublisher().equals(publisher) && currentBook.getYear() == year) {
                resultByPublisherAndYear.add(currentBook);
            }
        }

        return resultByPublisherAndYear;
    }

    public static List<Book> filterBooksByAuthorAndPublisherAndYear(List<Book> books, String surname, String publisher,
                                                                    int year) {

        List<Book> resultByAuthorAndPublisherAndYear = new ArrayList<>();

        for (Book currentBook : books) {
            if(currentBook.getAuthor().getSurname() == surname &&
                    currentBook.getPublisher() == publisher && currentBook.getYear() == year) {
                resultByAuthorAndPublisherAndYear.add(currentBook);
            }
        }

        return resultByAuthorAndPublisherAndYear;
    }


}

