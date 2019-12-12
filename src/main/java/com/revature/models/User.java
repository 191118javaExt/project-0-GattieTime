package com.revature.models;


public abstract class User {
	
	private static int totalUsers;
	
	private int userID;
	
	private String userFirstName;
	
	private String userLastName; 
	
	private String userLogIn;
	
	private String userPassword;

	public static int getTotalUsers() {
		return totalUsers;
	}

	public static void setTotalUsers(int totalUsers) {
		User.totalUsers = totalUsers;
	}

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

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public User(String userFirstName, String userLastName, String userLogIn, String userPassword) {
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
