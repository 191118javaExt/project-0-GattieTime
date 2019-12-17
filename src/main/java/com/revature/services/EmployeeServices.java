package com.revature.services;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.models.Account;
import com.revature.models.Client;
import com.revature.repositories.AccountDAOImp;
import com.revature.repositories.ClientDAOImp;

public class EmployeeServices {
	
	private static Logger logger = Logger.getLogger(EmployeeServices.class);

	public static void mainMenu() {
		System.out.println("What would you like to do? Please type the number of the option you would like below and hi \"enter.\"");
		System.out.println("[1]: Review account applications");
		System.out.println("[2]: Get client information");
		System.out.println("[3]: Get account information.");
		System.out.println("[4]: Close the application");
		int choice = mainSelection();
		if (choice == 1) {
			AccountServices.manageApplications();
		} else if (choice ==2) {
			int i = clientID();
			clientInfo(i);
			mainMenu();
		} else if (choice == 3) {
			int i = accID();
			accountInfo(i);
			mainMenu();
		} else if (choice == 4) {
			System.out.println("Her Majesty thanks you for your service.");
			logger.info("User exited from Employee main menu.");
		}else {
			System.out.println("Something went wrong. Please restart the application and try again.");
			logger.warn("invailid int returned from Employee mainSelection");
		}
		
	}

	static Account accountInfo(int i) {
		AccountDAOImp aDAO = new AccountDAOImp();
		Account a = aDAO.findById(i);
		System.out.println(a);
		logger.info("User looked at account " + a.getAccID() + ".");
		return a;
	}

	static int accID() {
		System.out.println("Type the account id of the account whose information you would like to see and hit \"enter\".");
		Scanner s = new Scanner(System.in);
		int i = 0;
		try {
			i = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = clientID();
		}
		return i;
	}

	static Client clientInfo(int i) {
		ClientDAOImp cDAO = new ClientDAOImp();
		Client c = cDAO.findById(i);
		System.out.println(c);
		logger.info("User looked at account " + c.getUserID() + ".");
		return c;
	}

	static int clientID() {
		System.out.println("Type the client id of the client whose information you would like to see and hit \"enter\".");
		Scanner s = new Scanner(System.in);
		int i = 0;
		try {
			i = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = clientID();
		}
		return i;
	}

	private static int mainSelection() {
		Scanner s = new Scanner(System.in);
		int i = 0;
		try {
			i = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = mainSelection();
		}

		if (i != 1 && i != 2 && i != 3 && i != 4) {
			System.out.println("You did not enter a valid number. Please try again. Type a number 1-4.");
			i = mainSelection();
		}

		return i;
	}


}
