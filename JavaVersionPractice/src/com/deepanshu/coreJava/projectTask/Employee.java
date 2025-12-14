package com.deepanshu.coreJava.projectTask;

public class Employee extends Person{
	
	private String department;
	private Assets assignAssest;
	
	public Employee(int personID, String personName, String department) {
		super(personID, personName);
		this.department = department;
		this.assignAssest = null;
		
	}

	public String getDepartment() {
		return department;
	}

	public Assets getAssignAssest() {
		return assignAssest;
	}

	public void setAssignAssest(Assets assignAssest) {
		this.assignAssest = assignAssest;
	}

	// concrete methods 
	public boolean isAssetAssigned() {	
		return assignAssest!= null;
	}
	
	//display details similar to string method
	public void displayDetails() {
		System.out.println("the employee id is:"+ getPersonID());
		System.out.println("the employee name is:"+ getPersonName());
		System.out.println("the department name is:"+ getDepartment());
		
		if(!isAssetAssigned()) {
			System.out.println("the asset id is:"+ assignAssest.getAssetID());
		}else {
			System.out.println("no asset assigned");
		}
	}
	
}
