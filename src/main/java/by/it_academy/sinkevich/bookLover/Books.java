package by.it_academy.sinkevich.bookLover;


import java.util.ArrayList;
import java.util.List;

public class Books {

    public Books() {
    }

    public static List<Book> filterBooksByAuthor(List<Book> books, String authorsurname){

        List<Book> bookByAuthor = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().surname.matches(authorsurname)){
                bookByAuthor.add(books.get(i));
            }
        }

        return bookByAuthor;
    }

    public static List<Book> filterBooksByPublisher(List<Book> books, String publisher){

        List<Book> bookByPublisher = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublisher().matches(publisher)){
                bookByPublisher.add(books.get(i));
            }
        }

        return bookByPublisher;
    }

    public static List<Book> filterBooksByIsbn(List<Book> books, Integer isbn){

        List<Book> bookByIsbn = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)){
                bookByIsbn.add(books.get(i));
            }
        }

        return bookByIsbn;
    }

    public static List<Book> filterBooksByYear(List<Book> books, Integer year){

        List<Book> bookByYear = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYear().equals(year)){
                bookByYear.add(books.get(i));
            }
        }

        return bookByYear;
    }

    public static List<Book> filterBooksByPublisherAndYear(List<Book> books, String publisher,Integer year){

        List<Book> bookByYearAndPublisher = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYear().equals(year) && books.get(i).getPublisher().matches(publisher)){
                bookByYearAndPublisher.add(books.get(i));
            }
        }
/*
        for (int i = 0; i < filterBooksByYear(books,year).size(); i++) {
            if ( filterBooksByPublisher(books,publisher).contains(filterBooksByYear(books,year).get(i)) ){
                bookByYearAndPublisher.add(filterBooksByYear(books,year).get(i));
            }
        }
*/
        return bookByYearAndPublisher;
    }

    public static List<Book> filterBooksByAuthorAndPublisherAndYear(List<Book> books,String author, String publisher,Integer year){

        List<Book> bookByYearPublisherAuthor = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYear().equals(year) && books.get(i).getPublisher().matches(publisher) && books.get(i).getAuthor().getSurname().matches(author)){
                bookByYearPublisherAuthor.add(books.get(i));
            }
        }

        return bookByYearPublisherAuthor;
    }
}

