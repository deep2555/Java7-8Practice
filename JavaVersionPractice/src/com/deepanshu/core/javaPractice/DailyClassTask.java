package com.deepanshu.core.javaPractice;

public class DailyClassTask {

	public static void main(String[] args) {
		Book designOfBook = new Book("Design", "Author", 1);
		Book myBook = new Book(2);
		
		System.out.println("total number of book created: "+ Book.getTotalBooks());
		designOfBook.borrowBook();
		myBook.borrowBook();
		
		designOfBook.borrowBook();
		designOfBook.returnBook();
		designOfBook.returnBook();
	}
	
	
	
}
/* 1) Design the book class and add the instance variable and static variable 
 * simple book class for learning about the properties and its behavior*/

class Book {

	/*
	 * always goes like static properties instance properties static block instance
	 * block constructor static method instance method
	 */

	// static variable
	static int totalBooks;

	// instance variable
	String bookTitle;
	String bookAuthor;
	int isbn;
	boolean isBorrowed;

	// static block
	static {
		totalBooks = 0;
	}
	// init block calls when object created
	{
		totalBooks++;
	}

	// constructor
	public Book(String bookTitle, String bookAuthor, int isbn) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.isbn = isbn;
	}

	// another constructor illustrate chaining constructor
	public Book(int isbn) {
		this("unknown", "Unknown", isbn);
	}

	public static int getTotalBooks() {
		return totalBooks;
	}

	// instance method
	public void borrowBook() {

		if (!isBorrowed) {
			this.isBorrowed = true;
			System.out.println("Enjoy Book"+ this.bookTitle);
		} else {
			System.out.println("The book is already Borrowed");
		}
	}
	void returnBook(){
		if(isBorrowed) {
			this.isBorrowed = false;
			System.out.println("Hope you enjoy my book");
		}else {
			System.out.println("this book is still in the library");
		}
	}

//	public String returnBook() {
//		return "Book [bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", isbn=" + isbn + "]";
//	}
}