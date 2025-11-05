package booklover.by.book;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Books {
    public static List<Book> filterBooksByPublisherAndYear(List<Book> books, String publisher, int year) {
        return books.stream()
                .filter(book -> book.getPublisher().equalsIgnoreCase(publisher)
                        && book.getYear() == year)
                .sorted(Comparator.comparing(Book::getPrice))
                .collect(Collectors.toList());
    }
}
