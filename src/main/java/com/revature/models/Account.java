package com.revature.models;

public class Account {

	private int userID;
	private double balance;
	private int type;
	private int accID;
	private boolean approved;
	private String name;
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
		return "Account [accID=" + accID + " userID=" + userID +  ", name=" + name + ", balance=" + balance + ", type=" + type
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
	
	

}
