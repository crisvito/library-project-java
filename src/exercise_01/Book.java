package exercise_01;

public class Book {
	
	private String title;
	private Author author;
	private String ISBN;

	public Book(String title, String ISBN, Author author) {
		this.title = title;
		this.ISBN = ISBN;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public String getISBN() {
		return ISBN;
	}
	public Author getAuthor() {
		return author;
	}
	
	public String toString() {
		return "Title: " + title + "\n" +
				"ISBN: " + ISBN + "\n" +
				"Author: " + author.getName() + "\n" +
				"Biography: " + author.getBiography() +  "\n" +
				"-----------------------------------------------\n";
	}
}
