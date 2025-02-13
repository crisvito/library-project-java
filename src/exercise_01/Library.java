package exercise_01;

import java.util.ArrayList;

public class Library {

	private ArrayList<Book> bookList; 
	private Book book;
	private Borrower borrower;
	
	public Library() {
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		bookList.add(book);
		System.out.println("Book added to library: " + book.getTitle());
	}
	
	public void borrowBook(Borrower borrower, Book book) {
		if(bookList.contains(book)) bookList.remove(book);
		borrower.addBorrowedBooks(book);
		System.out.println(borrower.getName() + 's' + " Borrowed: " + book.getTitle());
	}
	
	public void returnBook(Borrower borrower, Book book) {
		bookList.add(book);
		borrower.removeBorrowedBooks(book);
		
		System.out.println(borrower.getName() + " returned: " + book.getTitle());
	}
	
	public void displayLibraryBooks() {
		System.out.println("Books in Library: ");
		for(Book book : bookList) {
			if(book != null) {
				System.out.println(book);
			}
		}
	}
	
	public ArrayList<Book> getBooks() {
		return bookList;
	}
	
}
