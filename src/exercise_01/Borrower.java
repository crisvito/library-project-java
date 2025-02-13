package exercise_01;

import java.util.ArrayList;

public class Borrower {

	private String name;
	private ArrayList<Book> borrowedBookList;
	
	public Borrower(String name) {
		this.name = name;
		borrowedBookList = new ArrayList<Book>();
	}

	public String getName() {
		return name;
	}
	
	public void addBorrowedBooks(Book book) {
		borrowedBookList.add(book);
	}
	
	public void removeBorrowedBooks(Book book) {
		if(borrowedBookList.contains(book)) borrowedBookList.remove(book);
	}
	
	public void displayBorrowedBooks() {
		System.out.println(name + "'s Borrowed Books: ");
		
		for(Book book : borrowedBookList) {
			System.out.println(book);
		}
	}
}
