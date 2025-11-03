package by.it_academy.zarouskaya.booklover.demo;

import by.it_academy.zarouskaya.booklover.cart.Cart;
import by.it_academy.zarouskaya.booklover.book.Author;
import by.it_academy.zarouskaya.booklover.book.Book;
import by.it_academy.zarouskaya.booklover.user.User;
import by.it_academy.zarouskaya.booklover.utils.Books;
import by.it_academy.zarouskaya.booklover.utils.Login;
import by.it_academy.zarouskaya.booklover.utils.Users;

import java.util.ArrayList;
import java.util.List;

public class DemoShop {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Author sKing = new Author("King", "Stephen");
        Author aChristie = new Author("Christie", "Agatha");
        Author jRowling = new Author("Rowling", "Joanne");
        Author gOrwell = new Author("Orwell", "George");

        books.add(new Book("Harry Potter and the Order of the Phoenix", "fantasy", 19.99, "0-7475-5100-6", "Bloomsbury", 2003, jRowling));
        books.add(new Book("1984", "dystopian fiction", 39.99, "978-0-45-228423-4", "Berkley", 2003, gOrwell));
        books.add(new Book("Animal Farm", "distopian satire", 39.98, "0-14-000838-1", "Penguin Books", 2019, gOrwell));
        books.add(new Book("Death on the Nile", "thriller", 23.99, "978-0-06-313984-8", "Collins Crime Club", 1938, aChristie));
        books.add(new Book("It", "horror", 16.99, "978-0-670-81302-5", "Penguin Books", 1986, sKing));

        System.out.println("==TEST BOOK METHODS==");
        System.out.println("Filter books by author surname: " + Books.filterBooksByAuthor(books, "orWeLL"));
        System.out.println("Filter books by publisher: " + Books.filterBooksByPublisher(books, "penguin books"));
        System.out.println("Filter books by ISBN: " + Books.filterBooksByIsbn(books, "0-7475-5100-6"));
        System.out.println("Filter books by year: " + Books.filterBooksByYear(books, 2003));
        System.out.println("Filter books by publisher and year: " + Books.filterBooksByPublisherAndYear(books,
                "bloomsbury", 2003));
        System.out.println("Filter books by author surname, publisher, and year: " + Books.filterBooksByAuthorAndPublisherAndYear(books,
                "orwell", "penguin books", 2019));

        System.out.println("==TEST USER METHODS==");
        User user_01 = new User("password_01", "+48555555555");
        User user_02 = new User("password_02", "+48555555555");
        User user_03 = new User("password_03", "+48777777777");
        User user_04 = new User("password_04", "+48333333333");
        User user_05 = new User("password_05", "+48444444444");

        System.out.println(Users.isUserInList(user_01));
        System.out.println(Users.isUserInList(user_02));
        System.out.println(Users.isUserInList(user_03));
        System.out.println(Users.isUserInList(user_04));
        System.out.println(Users.getAllUsers());

        System.out.println("==TEST LOGIN METHODS==");
        Login login = new Login();
        login.login(user_05);
        login.register(user_05);
        login.login(user_05);

        System.out.println("==TEST CART METHODS==");
        Cart cart = new Cart(user_01);
        System.out.println("New empty " + cart);

        cart.addBook(books.get(0));
        cart.addBook(books.get(2));
        cart.addBook(books.get(4));
        System.out.println("Two books added: " + cart);

        cart.deleteBook(books.get(2));
        System.out.println("One book deleted: " + cart);

        System.out.println(cart.getUser() + " List of books: " + cart.getBooks() + " Total sum: " + cart.getTotalSum());
    }
}
