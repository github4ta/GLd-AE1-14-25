package by.it_academy.sinkevich.bookLover;


import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Book> books = new ArrayList<>();
    private User user;

    public Cart(User user) {
        this.user = user;
    }

    public Cart(User user, List<Book> books){
        this.user = user;
        this.books = books;
    }

    public Cart(User user, Book book){

        List<Book> bookVar = new ArrayList<>();
        bookVar.add(book);

        this.user = user;
        this.books = bookVar;
    }

    public User getUser(){
        return user;
    }

    public int getTotalSum(){
        int sum=0;
        for (int i = 0; i < books.size(); i++) {
            sum += books.get(i).price;
        }
        return sum;
    }

    public List<Book> getBooks(){
        return books;
    }

    public void addBook(Book book){
        if (!books.contains(book)){
            books.add(book);
        }
        else {
            System.out.println("book already in list");
        }

    }

    public void deleteBook(Book book){
        if (books.contains(book)){
            books.remove(book);
        }
        else {
            System.out.println("book not exist");
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "books=" + books +
                ", user=" + user +
                '}';
    }
}
