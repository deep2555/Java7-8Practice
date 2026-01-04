package com.deepanshu.core.java.projectTask2;

public class Book extends LibraryItem implements Searchable {

	private String author;

	public Book(int itemsId, String title, int publicationYear, String author) {
		super(itemsId, title, publicationYear);
		this.author = author;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("the author name is:" + author);
	}

	@Override
	public boolean matches(String query) {
		/*
		 * Implementation of case-insensitive search logic across title and author
		 * 
		 */
		if (query == null || query.trim().isEmpty()) {
			return false;
		}
		String normalizeQuery = query.toLowerCase();
		System.out.println("normalize query is:" + normalizeQuery);

		return ((this.getTitle() != null && this.getTitle().contentEquals(normalizeQuery))
				|| author != null && author.contentEquals(normalizeQuery));

	}
	 
	// to test the matches method
//	public static void main(String[] args) {
//		Book book = new Book(1, "zinda hu me", 1234, "chetan bhagat");
//		System.out.println(book.matches("zinda h me"));
//	}

}
