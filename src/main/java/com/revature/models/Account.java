package com.revature.models;

public class Account {


	private int userID;
	private double balance;
	private int type;
	private int accID;
	private boolean approved = false;
	private String name = "My Account";
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getAccID() {
		return accID;
	}
	public void setAccID(int accID) {
		this.accID = accID;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [Account Number =" + accID + " User ID Number =" + userID +  ", name=" + name + ", balance=" + balance + ", type=" + type
				+ ", approved=" + approved + "]";
	}
	
	public Account(int userID, String name, int type, double balance, boolean approved) {
		super();
		this.userID = userID;
		this.name = name;
		this.type = type;
		this.balance = balance;
		this.approved = approved;
	}
	public Account(int accID, int userID, String name, int type, double balance, boolean approved) {
		super();
		this.accID = accID;
		this.userID = userID;
		this.name = name;
		this.type = type;
		this.balance = balance;
		this.approved = approved;
	}
	public Account(int userID, String name, int type, double balance) {
		super();
		this.userID = userID;
		this.name = name;
		this.type = type;
		this.balance = balance;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accID;
		result = prime * result + (approved ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + type;
		result = prime * result + userID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accID != other.accID)
			return false;
		if (approved != other.approved)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type != other.type)
			return false;
		if (userID != other.userID)
			return false;
		return true;
	}

}
