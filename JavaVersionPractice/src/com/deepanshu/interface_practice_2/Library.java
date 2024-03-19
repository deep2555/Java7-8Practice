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
	public void addItemsToLibrary(LibraryItems itemType) {
		items.add(itemType);
		System.out.println("your item is added to the library");
	}

	// remove item from the library
	public void removeItemsToLibrary(LibraryItems itemType) {
		items.remove(itemType);
		System.out.println("your product is remove from the list");
	}

	// Search for item by id

	public void searchItemsFromLibrary(String itemId) {
//		List<LibraryItems> searchitem = new ArrayList<>();
		
		for (LibraryItems item : items) {
			if(itemId == item.getItemId() ) {
				System.out.println("items type is :"+ item.getItemType()+ " and item id is : "+ item.getItemId());
				
			}
		}
	}

	// display all the items in the list
	public void showItems() {
		for (LibraryItems libraryItems : items) {
			System.out.println(libraryItems.getItemId() + " " + libraryItems.getItemType());
		}
	}

	

}
