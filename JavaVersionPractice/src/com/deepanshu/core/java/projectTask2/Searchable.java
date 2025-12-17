package com.deepanshu.core.java.projectTask2;

public interface Searchable {

	/*
	 * method signature This method should return true if the query string is found
	 * within the item's title, author, or any keywords. The search should be
	 * case-insensitive.
	 */	
	boolean matches(String query);
}
