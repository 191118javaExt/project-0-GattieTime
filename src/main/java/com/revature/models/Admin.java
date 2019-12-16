package com.revature.models;

public class Admin extends User {
	
	private boolean approved = false;

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public Admin(String userFirstName, String userLastName, String userLogIn, int userPassword) {
		super(userFirstName, userLastName, userLogIn, userPassword);
		// TODO Auto-generated constructor stub
	}

	public Admin(String userFirstName, String userLastName) {
		super(userFirstName, userLastName);
		// TODO Auto-generated constructor stub
	}

	public Admin(int userID, String userFirstName, String userLastName, String userLogIn, int userPassword) {
		super(userID, userFirstName, userLastName, userLogIn, userPassword);
		// TODO Auto-generated constructor stub
	}
	
	public Admin(int userID, String userFirstName, String userLastName, String userLogIn, int userPassword, boolean approved) {
		super(userID, userFirstName, userLastName, userLogIn, userPassword);
		this.approved = approved; 
	}
	
	
	

}
