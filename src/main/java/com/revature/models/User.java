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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userFirstName == null) ? 0 : userFirstName.hashCode());
		result = prime * result + userID;
		result = prime * result + ((userLastName == null) ? 0 : userLastName.hashCode());
		result = prime * result + ((userLogIn == null) ? 0 : userLogIn.hashCode());
		result = prime * result + userPassword;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (userFirstName == null) {
			if (other.userFirstName != null)
				return false;
		} else if (!userFirstName.equals(other.userFirstName))
			return false;
		if (userID != other.userID)
			return false;
		if (userLastName == null) {
			if (other.userLastName != null)
				return false;
		} else if (!userLastName.equals(other.userLastName))
			return false;
		if (userLogIn == null) {
			if (other.userLogIn != null)
				return false;
		} else if (!userLogIn.equals(other.userLogIn))
			return false;
		if (userPassword != other.userPassword)
			return false;
		return true;
	}
	
	
	
	
}
