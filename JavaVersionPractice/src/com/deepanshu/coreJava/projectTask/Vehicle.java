package com.deepanshu.coreJava.projectTask;

public class Vehicle extends Assets {

	private String licensePlate;

	public Vehicle(String assetID, String model, int purchaseYear, String licensePlate) {
		super(assetID, model, purchaseYear);
		this.licensePlate = licensePlate;
	}

	
	public String getLicensePlate() {
		return licensePlate;
	}


	@Override
	void displayDetails() {
		// here to display all the details
		System.out.println("the vehicle id is:" + getAssetID());
		System.out.println("the vehicle Name is:" + getModel());
		System.out.println("the vehicle license plate is:" + getLicensePlate());
		System.out.println("the vehicle purchasing year:" + getPurchaseYear());

	}

}
