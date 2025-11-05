package booklover.by.book;

import java.util.ArrayList;
import java.util.List;


public class Books {

    public static List<Book> filterBooksByPublisher(List<Book> books, String publisher) {
        List<Book> filtedBooksByPublisher = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublisher().equals(publisher)) {
                filtedBooksByPublisher.add(books.get(i));
            }
        }
        return filtedBooksByPublisher;
    }
}
