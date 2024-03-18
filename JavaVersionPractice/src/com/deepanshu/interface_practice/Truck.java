package com.deepanshu.interface_practice;

public class Truck implements Vehicle {

	private String vehicleId;
	private String vehicleModel;
	private int yearOfManufacturing;

	public Truck(String vehicleId, String vehicleModel, int yearOfManufacturing) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleModel = vehicleModel;
		this.yearOfManufacturing = yearOfManufacturing;
	}

	@Override
	public void startEngine() {

		System.out.println("Engine is started");

	}

	@Override
	public void stopEngine() {

		System.out.println("Engine is stoped");
	}

	@Override
	public void honk() {

		System.out.println("vehicle is honking ");

	}

	@Override
	public String getVehicleId() {
		// TODO Auto-generated method stub
		return vehicleId;
	}

	@Override
	public String getVehicleModel() {
		// TODO Auto-generated method stub
		return vehicleModel;
	}

	@Override
	public int getYearOfManufacturing() {
		// TODO Auto-generated method stub
		return yearOfManufacturing;
	}

}
