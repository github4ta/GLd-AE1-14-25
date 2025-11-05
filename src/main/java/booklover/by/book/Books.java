package booklover.by.book;

import java.util.ArrayList;
import java.util.List;

public class Books {
    public static List<Book> filterBooksByIsbn(List<Book> books, String isbn) {
        List<Book> newBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn() == isbn) {
                newBooks.add(books.get(i));
            }
        }
        return newBooks;
    }
}
