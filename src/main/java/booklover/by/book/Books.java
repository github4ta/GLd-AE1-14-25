package booklover.by.book;

import java.util.ArrayList;
import java.util.List;

public class Books {

    public static List<Book> filterBooksByAuthor(List<Book> books, String authorSurname) {
        List<Book> filteredBooksByAuthorResult = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (books.get(i).getAuthor().getSurname().equals(authorSurname)) {
                filteredBooksByAuthorResult.add(book);
            }
        }
        return filteredBooksByAuthorResult;
    }
}
