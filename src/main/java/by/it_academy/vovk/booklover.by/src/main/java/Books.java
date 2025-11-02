import java.util.ArrayList;
import java.util.List;

public class Books {
    public static List<Book> filterBooksByAuthor (List<Book> books, String authorSurname){
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < books.size() ; i++) {
            Book book = books.get(i);
            if(books.get(i).getAuthor().getSurname().equals(authorSurname)){
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> filterBooksByPublisher(List<Book> books, String publisher){
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < books.size() ; i++) {
            Book book = books.get(i);
            if(books.get(i).getPublisher().equals(publisher)){
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> filterBooksByIsbn(List<Book> books, String isbn){
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < books.size() ; i++) {
            Book book = books.get(i);
            if(books.get(i).getIsbn().equals(isbn)){
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> filterBooksByYear(List<Book> books, int year){
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < books.size() ; i++) {
            Book book = books.get(i);
            if(books.get(i).getYear() == year){
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> filterBooksByPublisherAndYear(List<Book> books, String publisher, int year){
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < books.size() ; i++) {
            Book book = books.get(i);
            if(books.get(i).getPublisher().equals(publisher)&&books.get(i).getYear() == year){
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> filterBooksByAuthorAndPublisherAndYear(List<Book> books, String authorSurname, String publisher, int year){
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < books.size() ; i++) {
            Book book = books.get(i);
            if(books.get(i).getAuthor().getSurname().equals(authorSurname)&&books.get(i).getPublisher().equals(publisher)&&books.get(i).getYear() == year){
                result.add(book);
            }
        }
        return result;
    }
}
