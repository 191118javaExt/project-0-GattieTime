package com.revature.models;

public class Client extends User {

	private boolean passwordSet = false; 
	
	public Client(int userID, String userFirstName, String userLastName, String userLogIn, String userPassword) {
		super(userID, userFirstName, userLastName, userLogIn, userPassword);
	}

	public Client(int userID, String userFirstName, String userLastName) {
		super(userID, userFirstName, userLastName);
		this.setUserLogIn(userFirstName.toLowerCase()+"."+ userLastName.toLowerCase());
		this.setUserPassword(Character.toString(userLastName.charAt(0)) + Character.toString(userFirstName.charAt(0)) + userID); 
	}

	public boolean isPasswordSet() {
		return passwordSet;
	}

	public void userSetsPassword(String userLogIn, String userPassword, String newPassword, String newLogIn) {
		if (this.getUserLogIn() == userLogIn && this.getUserPassword() == userPassword) {
			this.setUserLogIn(newLogIn);
			this.setUserPassword(newPassword);
			passwordSet = true;
		}
		
		
	}
	
	
	
	

}
