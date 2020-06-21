/*Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables


Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the book (including the author details)*/
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book name : ");
        String bookName = scanner.next();
        System.out.println("Enter price : ");
        double price = scanner.nextDouble();
        System.out.println("Enter quantity : ");
        int qtyInStock = scanner.nextInt();
        System.out.println("Enter author name : ");
        String authorName = scanner.next();
        System.out.println("Enter email : ");
        String authorEmail = scanner.next();
        System.out.println("Enetr the gender M/F : ");
        char gender = scanner.next().charAt(0);
        Author author = new Author(authorName,authorEmail,gender);
        Book book = new Book(bookName,author,price,qtyInStock);
        book.setAuthor(author);
        book.setName(bookName);
        book.setPrice(price);
        book.setQtyInStock(qtyInStock);
        System.out.println("Book Name : "+book.getName());
        System.out.println("Price  : "+book.getPrice());
        System.out.println("Quantity : "+book.getQtyInStock());
        Author authorDetails = book.getAuthor();
        System.out.println("Author : "+authorDetails.name);
        System.out.println("Author email : "+authorDetails.email);
        System.out.println("Author gender : "+authorDetails.gender);
    }
}
class Author {
    String name;
    String email;
    char gender;
    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}
class Book {
    String name;
    Author author;
    double price;
    int qtyInStock;

    public Book(String name, Author author,double price,int qtyInStock)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}