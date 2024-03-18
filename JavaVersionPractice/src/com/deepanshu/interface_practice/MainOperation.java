package com.deepanshu.interface_practice;

public class MainOperation {

	public static void main(String[] args) {
		
		TransportationCompany transportationCompany = new TransportationCompany();
		transportationCompany.addVehicle(new Car("1234", "Maruti", 1999));
		transportationCompany.addVehicle(new Truck("4567", "Ashok Leland", 1998));
		
		
		transportationCompany.startVehicle("1234");
		transportationCompany.honkVehicle("4567");

	}

}
