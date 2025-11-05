package booklover.by.book;

import java.util.ArrayList;
import java.util.List;

public class Books {
    public static List<Book> filterBooksByPublisher(List<Book> books, String publisher) {
        List<Book> booksfilteredByPublisher = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublisher().equals(publisher)) {
                booksfilteredByPublisher.add(books.get(i));
            }
        }
        return booksfilteredByPublisher;
    }
}
