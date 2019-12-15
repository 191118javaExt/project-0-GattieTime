package com.revature;

import org.apache.log4j.Logger;

import com.revature.services.UserInterface;

public class Driver {
	private static Logger logger = Logger.getLogger(Driver.class);
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Her Majesty's Royal Bank of Revature. What would you like to do?");
		logger.info("Application Started");
		UserInterface.entrySwitch(UserInterface.entryScreen());
	}
}
