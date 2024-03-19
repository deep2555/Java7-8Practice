package com.deepanshu.interface_practice_2;

public class Dvd implements LibraryItems {

	private String authorName;
	private String itemsId;
	private String dvdTitle;
	private int publicationYear;
	private String itemType;

	public Dvd(String authorName, String itemsId, String dvdTitle, int publicationYear, String itemType) {

		this.authorName = authorName;
		this.itemsId = itemsId;
		this.dvdTitle = dvdTitle;
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
		return dvdTitle;
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
