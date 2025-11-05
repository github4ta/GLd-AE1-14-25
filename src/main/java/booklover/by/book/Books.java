package booklover.by.book;

import java.util.ArrayList;
import java.util.List;

public class Books {

    public static List<Book> filterBooksByAuthor(List<Book> books, String authorSurname) {
        List<Book> filteredBooks = new ArrayList<>();
        for (int i = 0; i < filteredBooks.size(); i++) {
            if (book.getAuthor() != null && authorSurname.equals(book.getAuthor().getSurname())) {
                filteredBooks.add(book);
            }

        }
        return filteredBooks;

    }
}
