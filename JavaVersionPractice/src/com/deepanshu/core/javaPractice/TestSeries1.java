package com.deepanshu.core.javaPractice;

public class TestSeries1 {

	public static void main(String[] args) {
//		Book designOfBook = new Book("Design", "Author", 1);
//		Book myBook = new Book(2);
//
//		System.out.println("total number of book created: " + Book.getTotalBooks());
//		designOfBook.borrowBook();
//		myBook.borrowBook();
//
//		designOfBook.borrowBook();
//		designOfBook.returnBook();
//		designOfBook.returnBook();
		
		Course design = new Course("design of Machine");
		design.enrolledStudent("Deepanshu Prashar");
		design.enrolledStudent("Ahbishek");
		design.enrolledStudent("Kumar");
		design.enrolledStudent("Karan");
		
		System.out.println("the number of student enroll:"+ design.enrolledStudent);
		
		design.unEnrolledStudent("Kumar");
		System.out.println("the number of student enroll:"+ design.enrolledStudent);
		
	}

}


/*
 * 1) Design the course class and add the instance variable and static variable
 * simple book class for learning about the properties and its behavior
 */

class Course {

	static int maxCapacity;
	String courseName;
	int enrolledStudent;
	
	//string array to add each student as per the capacity
	String[] enrolledStu; 

	// static block
	static {
		maxCapacity = 4;
	}

	// constructor
	public Course(String courseName) {
		super();
		this.courseName = courseName;
		this.enrolledStudent = 0;
		this.enrolledStu = new String[maxCapacity];
	}

	// static method
	static void setMaxCapacity(int capacity) {
		maxCapacity = capacity;
	}

	// init method to enroll the student
	void enrolledStudent(String studentName) {
		// adding the student name in string array and count up the enrollment
		enrolledStu[enrolledStudent] = studentName;
		enrolledStudent++;
		System.out.println("student is enrolled in the university");
	}

	// init method to un-enroll the student
	void unEnrolledStudent(String studentName) {
		// here remove the student from the string array
		// with loop only not using any inbuilt and stream option
		
		/*1) first step to count how many times that student come
		 * 2) make new array and add the unremoved student*/
		int studentCount = 0;
		String[] unRemoved = new String[enrolledStu.length-studentCount];
		
		for(int i=0; i<enrolledStu.length; i++) {
			if(enrolledStu[i] == studentName) {	
				studentCount++;
			}
		}
		int j =0;
		for(int i =0; i<enrolledStu.length; i++) {
			if(enrolledStu[i] != studentName) {
				unRemoved[j] = enrolledStu[i];
				j++;
				
			}
		
		}
		enrolledStudent--;
		System.out.println("student is unenrolled from the university");
	}

}

/*
 * 1) Design the book class and add the instance variable and static variable
 * simple book class for learning about the properties and its behavior
 */

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
			System.out.println("Enjoy Book" + this.bookTitle);
		} else {
			System.out.println("The book is already Borrowed");
		}
	}

	void returnBook() {
		if (isBorrowed) {
			this.isBorrowed = false;
			System.out.println("Hope you enjoy my book");
		} else {
			System.out.println("this book is still in the library");
		}
	}

//	public String returnBook() {
//		return "Book [bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", isbn=" + isbn + "]";
//	}
}