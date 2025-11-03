package by.it_academy.trofimova.by.booklover.catalog;
import java.util.List;

public class Books {

    public static List<Book> filterBooksByAuthor(List<Book> books, String authorSurname) {
        return books.stream().filter(x -> x.getAuthor().getSurname().equals(authorSurname)).toList();
    }

    public static List<Book> filterBooksByPublisher(List<Book> books, String publisher) {
        return books.stream().filter( x -> x.getPublisher().equals(publisher)).toList();
    }

    public static List<Book> filterBooksByIsbn(List<Book> books, String isbn) {
        return books.stream().filter(x -> x.getIsbn().equals(isbn)).toList();
    }

    public static List<Book> filterBooksByYear(List<Book> books, int year) {
        return books.stream().filter(x -> x.getYear() == year).toList();
    }

    public static List<Book> filterBooksByPublisherAndYear(List<Book> books, String publisher, int year) {
        List<Book> newListPublisher = filterBooksByPublisher(books, publisher);
        List<Book> newListBooksByPublisherAndYear = filterBooksByYear(newListPublisher, year);

        return newListBooksByPublisherAndYear;
    }

    public static List<Book> filterBooksByAuthorAndPublisherAndYear(List<Book> books, String authorSurname,
                                                                    String publisher, int year) {
        List<Book> newListPublisherAndYear = filterBooksByPublisherAndYear(books, publisher, year);
        List<Book> newListBooksByAuthorAndPublisherAndYear = filterBooksByAuthor(newListPublisherAndYear, authorSurname);
        return newListBooksByAuthorAndPublisherAndYear;
    }



}
