package com.genpact;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {

	 private List<Book> books;

	    public Bookstore() {
	        this.books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public void displayBooks() {
	        for (Book book : books) {
	            System.out.println("\nBook Information:\n" + book + "\n");
	        }
}
}
