package com.revature.models;


public abstract class User {
	
	private int userID;
	
	private String userFirstName;
	
	private String userLastName; 
	
	private String userLogIn;
	
	private int userPassword;


	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserLogIn() {
		return userLogIn;
	}

	public void setUserLogIn(String userLogIn) {
		this.userLogIn = userLogIn;
	}

	public int getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(int userPassword) {
		this.userPassword = userPassword;
	}
	
	

	public User(int userID, String userFirstName, String userLastName, String userLogIn, int userPassword) {
		super();
		this.userID = userID;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userLogIn = userLogIn;
		this.userPassword = userPassword;
	}

	public User(String userFirstName, String userLastName, String userLogIn, int userPassword) {
		super();
		//this.userID = userID;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userLogIn = userLogIn;
		this.userPassword = userPassword;
	}

	public User(String userFirstName, String userLastName) {
		super();
		//this.userID = userID;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
	}

	@Override
	public String toString() {
		return "User " + userID + ",\n userFirstName=" + userFirstName + ",\n userLastName=" + userLastName
				+ ",\n userLogIn=" + userLogIn;
	}
	
	
	
	
}
