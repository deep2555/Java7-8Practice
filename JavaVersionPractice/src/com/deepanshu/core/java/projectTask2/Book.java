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
		System.out.println("the author name is:"+ author);
	}

	@Override
	public boolean matches(String query) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
