package com.revature.models;

public class Employee extends User {

	private boolean approved = false; 
	
	public Employee(String userFirstName, String userLastName) {
		super(userFirstName, userLastName);
		
	}

	public Employee(String userFirstName, String userLastName, String userLogIn, String userPassword) {
		super(userFirstName, userLastName, userLogIn, userPassword);
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	
	
	
	
	

}
