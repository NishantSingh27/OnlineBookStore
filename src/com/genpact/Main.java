package com.genpact;

public class Main {

	public static void main(String[] args) {
	

		 // create an author
        Author author1 = new Author("Khaled Hosseini", "Bestselling author with a passion for storytelling.");
        Author author2 = new Author("Amish Tripathi", "Bestselling author with a passion for storytelling.");
        Author author3 = new Author("Kathy Sierra & Bert Bates", "Bestselling author with a passion for storytelling.");

        // create books
        Book book1 = new Book("The Kite Runner", author1, 100);
        Book book2 = new Book("The Immortals of Meluha", author2, 200);
        Book books3=new Book("Head First Java",author3,300);

        // Create a bookstore
        Bookstore bookstore = new Bookstore();

        // Add books to the bookstore
        bookstore.addBook(book1);
        bookstore.addBook(book2);
        bookstore.addBook(books3);

        // Display information about books in the bookstore
        System.out.println("Books available in the Online Bookstore:");
        bookstore.displayBooks();
	}

}
