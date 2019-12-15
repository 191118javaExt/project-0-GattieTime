package com.revature.models;

public class Client extends User {

	private boolean passwordSet = false; 
	
	public Client(String userFirstName, String userLastName, String userLogIn, int userPassword) {
		super(userFirstName, userLastName, userLogIn, userPassword);
	}

	public Client(String userFirstName, String userLastName) {
		super(userFirstName, userLastName);
		this.setUserLogIn(userFirstName.toLowerCase()+"."+ userLastName.toLowerCase());
		this.setUserPassword((Character.toString(userLastName.charAt(0)) + Character.toString(userFirstName.charAt(0))/* + userID*/).hashCode()); 
	//TODO set auto password once ID is made
	}

	public boolean isPasswordSet() {
		return passwordSet;
	}

	public void userSetsPassword(String userLogIn, int userPassword, int newPassword, String newLogIn) {
		if (this.getUserLogIn() == userLogIn && this.getUserPassword() == userPassword) {
			this.setUserLogIn(newLogIn);
			this.setUserPassword(newPassword);//TODO call password create function instead
			passwordSet = true;
		}
	}

	public Client(int userID, String userFirstName, String userLastName, String userLogIn, int userPassword) {
		super(userID, userFirstName, userLastName, userLogIn, userPassword);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
