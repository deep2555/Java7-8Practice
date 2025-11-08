package com.deepanshu.interface_practice;

import java.util.Scanner;

public class MainOperation {

	public static void main(String[] args) {

//		TransportationCompany transportationCompany = new TransportationCompany();
//		transportationCompany.addVehicle(new Car("1234", "Maruti", 1999));
//		transportationCompany.addVehicle(new Truck("4567", "Ashok Leland", 1998));
//		
//		
//		transportationCompany.startVehicle("1234");
//		transportationCompany.honkVehicle("4567");

		Scanner in = new Scanner(System.in);

		// game loop
		int mountainH = 0;
		while (true) {
			for (int i = 0; i < 8; i++) {
				mountainH = in.nextInt(); // represents the height of one mountain.
			}

			// Write an action using System.out.println()
			// To debug: System.err.println("Debug messages...");

			System.out.println(mountainH); // The index of the mountain to fire on.
		}
	}

}
