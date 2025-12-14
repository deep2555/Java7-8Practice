package com.deepanshu.coreJava.projectTask;

public abstract class Person {

	private int personID;
	private String personName;
	
	public Person(int personID, String personName) {
		super();
		this.personID = personID;
		this.personName = personName;
	}
	public int getPersonID() {
		return personID;
	}
	public String getPersonName() {
		return personName;
	}
	
	
}
