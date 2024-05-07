package com.deepanshu.streams;

public class EmployeeDao {

	private String employeeName;
	private int employeeId;
	private String department;
	private  double salary;
	private int yearOfExperience;

	public EmployeeDao(String employeeName, int employeeId, String department, double salary, int yearOfExperience) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.department = department;
		this.salary = salary;
		this.yearOfExperience = yearOfExperience;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public  double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

}
