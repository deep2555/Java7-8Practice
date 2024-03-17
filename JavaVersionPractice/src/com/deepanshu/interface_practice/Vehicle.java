package com.deepanshu.interface_practice;

public interface Vehicle {

	String getVehicleId();

	String getVehicleModel();

	int getYearOfManufacturing();

	public abstract void startEngine();

	public abstract void stopEngine();

	public abstract void honk();

}
