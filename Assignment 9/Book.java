package com.sunbeam.entity;

import java.util.Scanner;

 public class Book {
	Scanner sc = new Scanner(System.in);
	private String isbn;
	private String bookName;
	private Category category;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() {
		super();
	}
	public Book(String isbn, String bookName, Category category, double price, String autherName, int quantity) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.category = category;
		this.price = price;
		this.authorName = autherName;
		this.quantity = quantity;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void acceptData() {
		System.out.print("Enter ISBN code of the book - ");
		isbn = sc.next();
		System.out.print("Enter name of the book - ");
		bookName = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter category - FICTION,HISTORY,BIOGRAPHY,THRILLER,SCIENCE");
		Category category = Category.valueOf(sc.nextLine().toUpperCase());
		System.out.print("Enter price of the book - ");
		price = sc.nextDouble();
		System.out.print("Enter auther name - ");
		authorName = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter quantity of copies - ");
		quantity = sc.nextInt();
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", category=" + category + ", price=" + price
				+ ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}
	

}
