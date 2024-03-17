package com.deepanshu.interface_practice;

public class Car implements Vehicle {
	private String vehicleId;
	private String vehicleModel;
	private int yearOfManufacturing;
	
	
	

	public Car(String vehicleId, String vehicleModel, int yearOfManufacturing) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleModel = vehicleModel;
		this.yearOfManufacturing = yearOfManufacturing;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public int getYearOfManufacturing() {
		return yearOfManufacturing;
	}

	public void setYearOfManufacturing(int yearOfManufacturing) {
		this.yearOfManufacturing = yearOfManufacturing;
	}

	@Override
	public void startEngine() {
		
		System.out.println("Engine is starting");
	}

	@Override
	public void stopEngine() {
		
		System.out.println("Engine is stoping");
		
	}

	@Override
	public void honk() {
		
		System.out.println("vehicle is honking");
	}

}
