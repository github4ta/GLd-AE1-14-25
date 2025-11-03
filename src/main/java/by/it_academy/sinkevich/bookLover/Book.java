package by.it_academy.sinkevich.bookLover;


public class Book {
    String name;
    Author author;
    Integer year;
    String publisher;
    Integer isbn;
    Integer price;


    public Book(String name, Author author, Integer year, String genre,Integer isbn,Integer price) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.publisher = genre;
        this.isbn = isbn;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }
}

