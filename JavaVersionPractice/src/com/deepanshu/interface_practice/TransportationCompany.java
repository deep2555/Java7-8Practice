package com.deepanshu.interface_practice;

import java.util.ArrayList;
import java.util.List;

public class TransportationCompany {

	private List<Vehicle> fleet;

	public TransportationCompany() {
		super();
		this.fleet = new ArrayList<>();
	}

	public void addVehicle(Vehicle vehicle) {
		fleet.add(vehicle);

	}

	public void startVehicle(String vehicleId) {

		// check if vehicle id that enter is equal to the vehicle id present in the
		// array list

		for (Vehicle vehicle : fleet) {
			if (vehicle.getVehicleId() == vehicleId) {
				vehicle.startEngine();
				System.out.println("Engine started by the " + vehicle.getVehicleModel());
			}
		}
	}

}
