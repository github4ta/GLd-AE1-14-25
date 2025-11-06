package by.it_academy.sinkevich.bookLover;

import by.it_academy.sinkevich.bookLover.author.Author;
import by.it_academy.sinkevich.bookLover.book.*;
import by.it_academy.sinkevich.bookLover.cart.Cart;
import by.it_academy.sinkevich.bookLover.login.Login;
import by.it_academy.sinkevich.bookLover.user.*;

import java.util.*;

public class Demoshop {
    public static void main(String[] args) {

        System.out.println("USER , LOGIN , REGISTRATION");
        System.out.println("---------------------------");

        User user1 = new User("+375291112233", "password");

        System.out.println("Login: ");
        Login login = new Login();
        login.login(user1);

        System.out.println("Register: ");
        login.register(user1);

        User user2 = new User("+375291112233", "password");
        System.out.println(user2);

        System.out.println("Login: ");
        login.login(user2);

        User user3 = new User("1234455", "password2");
        System.out.println(user3);

        System.out.println("Register: ");
        login.register(user3);

        System.out.println("Login: ");
        login.login(user3);

        User user4 = new User("+375291234455", "password2");
        System.out.println(user4);

        System.out.println("Register: ");
        login.register(user4);

        System.out.println("Login: ");
        login.login(user4);

        System.out.println("User list : ");
        for (int i = 0; i < Users.getAllUsers().size(); i++) {
            System.out.println(Users.getAllUsers().get(i));
        }

        System.out.println();
        System.out.println("BOOK");
        System.out.println("---------------------------");

        Author author1 = new Author("author1", "name1");
        Author author2 = new Author("author2", "name2");

        Book book1 = new Book("book1", author1, 2001, "publisher1", 1, 12);
        Book book2 = new Book("book2", author1, 2002, "publisher1", 2, 122);
        Book book3 = new Book("book3", author2, 2001, "publisher1", 1, 33);
        Book book4 = new Book("book4", author2, 2002, "publisher1", 4, 33);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        System.out.println("BooksByAuthor:");
        System.out.println(Books.filterBooksByAuthor(books, author2.getSurname()));

        System.out.println("BooksByPublisher");
        System.out.println(Books.filterBooksByPublisher(books, "publisher1"));

        System.out.println("BooksByIsbn");
        System.out.println(Books.filterBooksByIsbn(books, 1));

        System.out.println("BooksByYear");
        System.out.println(Books.filterBooksByYear(books, 2002));

        System.out.println("BooksByPublisherAndYear");
        System.out.println(Books.filterBooksByPublisherAndYear(books, "publisher1", 2001));

        System.out.println("BooksByAuthorAndPublisherAndYear");
        System.out.println(Books.filterBooksByAuthorAndPublisherAndYear(books, author1.getSurname(), "publisher1", 2001));

        System.out.println();
        System.out.println("CART");
        System.out.println("---------------------------");

        System.out.println("create Cart(User user) : ");
        Cart cart1 = new Cart(Users.getAllUsers().get(0));
        System.out.println(cart1);

        cart1.addBook(book1);
        System.out.println("add book: ");
        System.out.println(cart1);

        System.out.println("delete book: ");
        cart1.deleteBook(book1);
        System.out.println(cart1);

        List<Book> listBooksUser = new ArrayList<>();
        listBooksUser.add(book1);
        listBooksUser.add(book2);
        listBooksUser.add(book3);

        System.out.println("create Cart(User user, List<Book> books) : ");
        Cart cart2 = new Cart(Users.getAllUsers().get(1));
        System.out.println(cart2);

        cart2.deleteBook(book1);
        System.out.println("delete book: ");
        System.out.println(cart2);

        cart2.addBook(book4);
        System.out.println("add book: ");
        System.out.println(cart2);

        Cart cart3 = new Cart(Users.getAllUsers().get(2));
        System.out.println("create Cart(User user, Book book) : ");
        System.out.println(cart3);

        cart3.deleteBook(book1);
        System.out.println("delete book: ");
        System.out.println(cart3);

        cart3.addBook(book2);
        System.out.println("add book: ");
        System.out.println(cart3);
    }
}
