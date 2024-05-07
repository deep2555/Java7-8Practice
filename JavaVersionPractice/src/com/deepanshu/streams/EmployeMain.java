package com.deepanshu.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeMain {

	public static void main(String[] args) {

		// main operation

		List<EmployeeDao> employeeList = new ArrayList<>();
		employeeList.add(new EmployeeDao("Deepanshu", 1, "Software Department", 50000, 3));
		employeeList.add(new EmployeeDao("Jay Singh Rathore", 2, "Automotive Design", 45000, 8));
		employeeList.add(new EmployeeDao("Mistri jatt", 3, "Mechanical Engineer", 20000, 2));
		employeeList.add(new EmployeeDao("Sarabjeet kaushal", 4, "Cad Cam Department", 1000, 1));
		employeeList.add(new EmployeeDao("sorab", 5, "Mechanical Engineer", 15000, 4));

		// 1) list all employee whose belong to the mechanical department

		employeeList.stream().filter(employee -> employee.getDepartment().equals("Mechanical Engineer")).forEach(i -> {
			System.out.println(i.getEmployeeId() + " " + i.getEmployeeName());
		});

//		2) find the average salary of all the employees 

		System.out.println(
				employeeList.stream().filter(employee -> employee.getDepartment().equals("Mechanical Engineer"))
						.mapToDouble(employe -> employe.getSalary()).average());

//		3) find the employee with highest salary;

		Optional<EmployeeDao> maxSalary = employeeList.stream().max(Comparator.comparing(EmployeeDao::getSalary));
		maxSalary.ifPresent(employee -> {
			System.out.println(employee.getEmployeeName());
		});
		
//		4) sort the list of the employee based on the experience
		
		 List<EmployeeDao> ascendingOrder = employeeList.stream().sorted(Comparator.comparing(EmployeeDao::getYearOfExperience).reversed()).toList();
		 ascendingOrder.forEach(employee -> {
			 
			 System.out.println("the empployee are: "+ employee.getEmployeeName());
		 });
		
	}
}
