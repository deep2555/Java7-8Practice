package com.deepanshu.core.java.projectTask2;

public abstract class LibraryItem {

	private int itemsId;
	private String title;
	private int publicationYear;
	
	public LibraryItem(int itemsId, String title, int publicationYear) {
		super();
		this.itemsId = itemsId;
		this.title = title;
		this.publicationYear = publicationYear;
	}

	public int getItemsId() {
		return itemsId;
	}

	public String getTitle() {
		return title;
	}

	public int getPublicationYear() {
		return publicationYear;
	}
	
	// displayable all method
	 
	public void displayInfo() {
		System.out.println("items id is:"+ itemsId);
		System.out.println("title is:"+ title);
		System.out.println("publication year is:"+ publicationYear);
	}
	
	
}
