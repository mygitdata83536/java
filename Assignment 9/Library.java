package com.sunbeam.lib;
import com.sunbeam.entity.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

class sortbycategory implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getCategory().compareTo(o2.getCategory());
	}
	
}
class sortbyauthorName implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
	
		return o1.getAuthorName().compareTo(o2.getAuthorName());
	}
	
}

public class Library {
	private HashSet<Book> books;

	public Library() {
		
		books = new HashSet<>();
	}
	
	public void addBook(Book book){
		books.add(book);
		System.out.println("Book added to the library...");
	}
	
	public void displayBooks() {
		if(!books.isEmpty())
		{
			for (Book book : books) {
				System.out.println(book.toString());
			}
		}
		else
			System.out.println("Book out of stock");
	}
	
	public void sortbyCategory() {
		List<Book> sortedBooks = new ArrayList<>();
		Comparator<Book> sortbook = new sortbycategory();
		Collections.sort(sortedBooks, sortbook);
		System.out.println("Books sorted category-wise - ");
		System.out.println("*****************************");
		for (Book book : sortedBooks) {
			System.out.println(book);
		}
		
	}
	
	
	public void sortbyAuthorName() {
		List<Book> sortedBooks = new ArrayList<>();
		Comparator<Book> sortbook = new sortbyauthorName();
		Collections.sort(sortedBooks,sortbook);
		System.out.println("Books sorted by Auther name - ");
		System.out.println("*******************************");
		for (Book book : sortedBooks) {
			System.out.println(book);
		}
	}
	
	public void findBook(String isbnID) {
		for (Book book : books) {
			if(book.getIsbn().equals(isbnID)) {
				System.out.println("Book available....");
			    System.out.println(book);
			}
			else
				System.out.println("Book with ISBN" + isbnID +"not found");
		}
	}
	
	
}