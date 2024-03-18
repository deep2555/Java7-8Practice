package com.deepanshu.interface_practice_2;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<LibraryItems> items;

	// constructor
	public Library() {
		super();
		this.items = new ArrayList<>();
	}

	// methods to handle items
	public void addItemsToLibrary(String itemType) {

		for (LibraryItems libraryItems : items) {
			if (libraryItems.getItemType() == itemType) {
				items.add(libraryItems);
				System.out.println("your item is added to the library");
			}
		}
	}

}
