package com.deepanshu.core.java.projectTask2;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

	/*
	 * Using an Array of type LibraryItem to hold all books and journals.
	 * 
	 * 
	 */
	List<LibraryItem> libraryList = new ArrayList<>();

	// method
	public void addItems(LibraryItem item) {
		libraryList.add(item);
	}

	// perform search

	public void performSearch(String query) {

		// resulting array
		List<LibraryItem> resultingArray = new ArrayList<>();
		for (LibraryItem libItem : libraryList) {
			// conditional check on each items
			if (libItem.matches(query)) {
				System.out.println("match found: " + libItem);
				resultingArray.add(libItem);
			}
		}

		// loop through each resulting array
		for (LibraryItem result : resultingArray) {
			result.displayInfo();
		}
	}

	public static void main(String[] args) {
		Book book1 = new Book(1, "zinda hu me", 1234, "chetan bhagat");
		Book book2 = new Book(2, "3-iditos", 1222, "raju rastogi");

		String[] keywords = { "Science", "AI", "Machine Learning" };
		Journal journal1 = new Journal(3, "automatic control", 2012, 5, keywords);
		Journal journal2 = new Journal(4, "hydraulics", 2015, 8, new String[] { "Data", "Statistics", "AI" });

		LibraryCatalog libraryCatalog = new LibraryCatalog();
		libraryCatalog.addItems(book1);
		libraryCatalog.addItems(book2);
		libraryCatalog.addItems(journal1);
		libraryCatalog.addItems(journal2);

		String query1 = "raju rastogi";
		String query2 = "Statistics";

//		libraryCatalog.performSearch(query1);
//		libraryCatalog.performSearch(query2);
		
		try {
		  int dataDensityScore = libraryCatalog.calculateDataDensity("4");
		  System.out.println("data density score: "+dataDensityScore);
		 // libraryCatalog.performSearch(query1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// interview style code

	public int calculateDataDensity(String itemid) throws Exception {

		LibraryItem itemFound = null;

		for (LibraryItem lbItem : libraryList) {
			if (lbItem.getItemsId() == Integer.parseInt(itemid)) {
				System.out.println("got the id");
				itemFound = lbItem;
				break;
			}
		}

		if (itemFound == null) {
			throw new Exception("item not found");
		}

		// check if it is a book or journal
		if (itemFound instanceof Book) {
			Book book = (Book) itemFound;
			String bookAuthor = book.getAuthor();
			String bookTitle = book.getTitle();

			// now find the data density by adding author length and vowels in length
			String vowels = "aeiou";
			int vowelsCount = 0;
			String titleLower = bookTitle.toLowerCase();

			for (char cc : vowels.toCharArray()) {
				if (titleLower.indexOf(cc) != -1) {
					vowelsCount++;
				}
			}
			return bookAuthor.length() + vowelsCount;

		}
		else if(itemFound instanceof Journal) {
			
			Journal journal = (Journal)itemFound;
			int totalCount = 0;
			if(journal.getKeywords()!= null) {
				for(String key : journal.getKeywords()) {
					totalCount += key.length();
				}
			}
			
			return totalCount - journal.getVolumnNumber();
		}	
		
		return -1;

	}

}
