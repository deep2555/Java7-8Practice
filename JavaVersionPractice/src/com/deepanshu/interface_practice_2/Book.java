package com.deepanshu.interface_practice_2;

public class Book implements LibraryItems {

	private String authorName;
	private String itemsId;
	private String bookTitle;
	private int publicationYear;
	private String itemType;

	public Book(String authorName, String itemsId, String bookTitle, int publicationYear, String itemType) {
		super();
		this.authorName = authorName;
		this.itemsId = itemsId;
		this.bookTitle = bookTitle;
		this.publicationYear = publicationYear;
		this.itemType = itemType;
	}

	public String getAuthorName() {
		return authorName;
	}

	@Override
	public String getItemId() {
		// TODO Auto-generated method stub
		return itemsId;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return bookTitle;
	}

	@Override
	public int getPublishedYear() {
		// TODO Auto-generated method stub
		return publicationYear;
	}

	@Override
	public String getItemType() {
		// TODO Auto-generated method stub
		return itemType;
	}

}
