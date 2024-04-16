package com.sunbeam.testmenu;

import java.util.Scanner;
import com.sunbeam.entity.Book;
import com.sunbeam.entity.Category;
import com.sunbeam.lib.Library;

public class TestLibrary {

	public static void main(String[] args) {
		Library library = new Library();
		
		int choice;
		do {
			System.out.println("0.EXIT");
			System.out.println("1.Add book to the Library");
			System.out.println("2.Display all the books in Library");
			System.out.println("3.Books sorted by category");
			System.out.println("4.Book sorted by author name");
			System.out.println("5.Find book by ISBN Id ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("THANK YOU");
			break;
			case 1:
				Book book = new Book();
				book.acceptData();
				library.addBook(book);
			break;
			case 2:
				library.displayBooks();
			break;
			case 3:
				library.sortbyCategory();
			break;
			case 4:
				library.sortbyAuthorName();
			break;
			case 5:
				System.out.print("Enter ISBN id of the book you want - ");
				String isbnID = sc.nextLine();
				library.findBook(isbnID);

			break;
			default:
				System.out.println("Enter valid choice");
			break;	
			}
		}while(choice != 0);
	}
    

}
