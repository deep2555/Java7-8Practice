package com.deepanshu.coreJava.projectTask;

public abstract class Assets {

	private String assetID;
	private String Model;
	private int purchaseYear;
	
	public Assets(String assetID, String model, int purchaseYear) {
		super();
		this.assetID = assetID;
		Model = model;
		this.purchaseYear = purchaseYear;
	}

	public String getAssetID() {
		return assetID;
	}

	public String getModel() {
		return Model;
	}

	public int getPurchaseYear() {
		return purchaseYear;
	}
	
	// abstract method signature provided by child classes
	abstract void displayDetails();
}
