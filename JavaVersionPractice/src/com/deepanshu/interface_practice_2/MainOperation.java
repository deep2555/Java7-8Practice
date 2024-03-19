package com.deepanshu.interface_practice_2;

public class MainOperation {

	public static void main(String[] args) {

		Library library = new Library();
		Book book = new Book("asd", "1", "sf", 1666, "books");
		Dvd dvd = new Dvd("djvbdkjsbv", "121", "jhfjde", 1245, "DVD's");

		library.addItemsToLibrary(book);
		library.addItemsToLibrary(dvd);
		library.showItems();
		library.searchItemsFromLibrary("1");
		library.searchItemsFromLibrary("121");

	}

}
