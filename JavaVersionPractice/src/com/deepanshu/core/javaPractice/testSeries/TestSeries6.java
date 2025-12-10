package com.deepanshu.core.javaPractice.testSeries;

// here for the practice exercise for inheritance and inner classes

class LibraryItems {
	private int itemId;
	private String title;
	private String author;

	// method
	public void checkOut() {

		System.out.println("the user checkout the library");
	}

	public void returnItems() {
		System.out.println("the user return the book");
	}
}

class Books extends LibraryItems {
	private String isbn;
	private String bookName;
	private String issueNumber;
}

class Magzine extends LibraryItems {
	private String isbn;
	private String bookName;
	private String issueNumber;
}

class DVD extends LibraryItems {
	private String isbn;
	private String bookName;
	private String issueNumber;
}

public class TestSeries6 {

	public static void main(String[] args) {
		DVD dvd = new DVD();
		dvd.checkOut();
	}
}
