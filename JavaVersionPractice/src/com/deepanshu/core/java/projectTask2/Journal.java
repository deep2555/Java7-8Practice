package com.deepanshu.core.java.projectTask2;

public class Journal extends LibraryItem implements Searchable {

	private int volumnNumber;
	private String[] keywords;

	public Journal(int itemsId, String title, int publicationYear, int volumnNumber, String[] keywords) {
		super(itemsId, title, publicationYear);
		this.volumnNumber = volumnNumber;
		this.keywords = keywords;
	}
	

	// for displaying the info also comma separated keywords
	public int getVolumnNumber() {
		return volumnNumber;
	}
	public String[] getKeywords() {
		return keywords;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("volumn number is:" + volumnNumber);
		for (String key : keywords) {
			System.out.println("the key is :" + String.join(",", key));
		}
	}

	@Override
	public boolean matches(String query) {

		/*
		 * Implement the case-insensitive search logic across title and the keywords
		 * array
		 */
		if (query == null || query.trim().isEmpty()) {
			return false;
		}

		String normalizeQuery = query.toLowerCase();
		System.out.println("normalize journal query is:" + normalizeQuery);
		/*
		 * here is the normal approach to check the null and the if the keyword contains
		 * the string
		 * another approach with the stream we can implement the anymatches method later wll do
		 */
		boolean keywordMatches = false;
		if (keywords != null) {
			for (String key : keywords) {
				if (key!= null && key.toLowerCase().equals(normalizeQuery)) {
					keywordMatches = true;
					break;
				}

			}
		}

		return ((this.getTitle() != null && this.getTitle().contains(normalizeQuery))|| keywordMatches);
	}

}
