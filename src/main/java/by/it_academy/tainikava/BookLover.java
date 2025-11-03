package by.it_academy.tainikava;

import by.it_academy.tainikava.booklover.*;

import java.util.ArrayList;
import java.util.List;

public class BookLover {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book(new Author("S1", "N1"), "T1", "P2", "001", 2001, 100));
        books.add(new Book(new Author("S1", "N1"), "T2",  "P1", "002", 2001, 200));
        books.add(new Book(new Author("S2", "N2"), "T3", "P3", "003", 2001, 300));
        books.add(new Book(new Author("S3", "N3"), "T4", "P1", "004", 2004, 400));
        books.add(new Book(new Author("S2", "N2"), "T5", "P2", "005", 2004, 500));
        books.add(new Book(new Author("S2", "N2"), "T6", "P2", "006", 2005, 600));
        books.add(new Book(new Author("S3", "N3"), "T7","P3", "007", 2001, 700));

        //System.out.println(Books.filterBooksByAuthor(books, "S3"));
        //System.out.println(Books.filterBooksByPublisher(books, "P2"));
        //System.out.println(Books.filterBooksByIsbn(books, "002"));
        //System.out.println(Books.filterBooksByYear(books, 2004));
        //System.out.println(Books.filterBooksByPublisherAndYear(books, "P2", 2001));
        //System.out.println(Books.filterBooksByAuthorAndPublisherAndYear(books, "S2", "P3", 2001));

        User user1 = new User("447658439", "Password1");
        User user2 = new User("2978766344", "Password2");
        User user3 = new User("911565333", "Password3");
        User user4 = new User("653456632", "Password4");

        Users.addUser(user1);
        Users.addUser(user2);

        //System.out.println(Users.getAllUsers());
        //System.out.println(Users.isUserInList(user3));
        //System.out.println(Users.getAllUsers());
        //System.out.println(Users.isUserInList(user3));

        Login login = new Login();

        //login.login(user3);
        //login.login(user3);

        //System.out.println(Users.getAllUsers());
        //login.register(user4);
        //System.out.println(Users.getAllUsers());

        Cart cart1 = new Cart(user1);

        Book book8 = new Book(new Author("S3", "N3"), "T8", "P3", "008", 2001, 800);
        Cart cart2 = new Cart(user2, book8);

        Cart cart3 = new Cart(books, user3);

        System.out.println("Get users from all carts");
        System.out.println("Cart1 user: " + cart1.getUser());
        System.out.println("Cart2 user: " + cart2.getUser());
        System.out.println("Cart3 user: " + cart3.getUser());
        System.out.println();

        System.out.println("Grt books from all carts");
        System.out.println("Cart1 books: " + cart1.getBooks());
        System.out.println("Cart2 books: " + cart2.getBooks());
        System.out.println("Cart3 books: " + cart3.getBooks());
        System.out.println();

        System.out.println("Create book9  and add the book to cart1");
        Book book9 = new Book(new Author("S3", "N3"), "T9", "P3", "009", 2001, 900);
        cart1.addBook(book9);
        System.out.println("Cart1 books: " + cart1.getBooks());

        System.out.println("Cart1 total sum: " + cart1.getTotalSum());
        System.out.println();

        System.out.println("Delete book9 from cart1");
        cart1.deleteBook(book9);
        System.out.println("Cart1 books: " + cart1.getBooks());
        System.out.println();

        System.out.println("Total sum for all carts");
        System.out.println("Cart1 total sum: " + cart1.getTotalSum());
        System.out.println("Cart2 total sum: " + cart2.getTotalSum());
        System.out.println("Cart3 total sum: " + cart3.getTotalSum());
    }
}
