package com.revature.models;

public class Employee extends User {

	private boolean approved = false; 
	
	public Employee(String userFirstName, String userLastName) {
		super(userFirstName, userLastName);
		
	}

	public Employee(String userFirstName, String userLastName, String userLogIn, int userPassword) {
		super(userFirstName, userLastName, userLogIn, userPassword);
	}
	
	

	public Employee(int userID, String userFirstName, String userLastName, String userLogIn, int userPassword) {
		super(userID, userFirstName, userLastName, userLogIn, userPassword);
	}
	
	public Employee(int userID, String userFirstName, String userLastName, String userLogIn, int userPassword, boolean approved) {
		super(userID, userFirstName, userLastName, userLogIn, userPassword);
		this.approved = approved;
	}


	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	
	
	
	
	

}
