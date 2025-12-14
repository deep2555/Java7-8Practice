package com.deepanshu.coreJava.projectTask;

public class Laptop extends Assets{

	private int ramSize;


	public Laptop(String assetID, String model, int purchaseYear, int ramSize) {
		super(assetID, model, purchaseYear);
		this.ramSize = ramSize;
	}

	
	public int getRamSize() {
		return ramSize;
	}

	@Override
	void displayDetails() {
		// here to display all the details
		System.out.println("the laptop id is:"+ getAssetID());
		System.out.println("the laptop Name is:"+ getModel());
		System.out.println("the laptop ram size is:"+ getRamSize());
		System.out.println("the laptop purchasing year:"+ getPurchaseYear());



		
	}
	
	
}
