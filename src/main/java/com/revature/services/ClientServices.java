package com.revature.services;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.models.User;

public class ClientServices {
	private static Logger logger = Logger.getLogger(ClientServices.class);

	public static void mainMenu(User user) {
		System.out.println("What would you like to do? Please type the number of the option you would like below and hi \"enter.\"");
		System.out.println("[1]: Manage existing account(s).");
		System.out.println("[2]: Apply for a new account.");
		System.out.println("[3]: Edit your personal information.");
		System.out.println("[4]: Close the application");
		int choice = mainSelection();
		if (choice == 1) {
			accountServices.manageAccounts(user);
		} else if (choice ==2) {
			accountServices.apply(user);
		} else if (choice == 3) {
			changeInfo(user);
		} else if (choice == 4) {
			System.out.println("Thank you for chosing Her Royal Majesty's Bank of Revature. Where unicorns do their banking.");
			logger.info("User exited from client main menu.");
		}else {
			System.out.println("Something went wrong. Please restart the application and try again.");
			logger.warn("invailid int returned from mainSelection");
		}
		
		
		
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

		if (i != 1 && i != 2 && i != 3) {
			System.out.println("You did not enter a valid number.");
			i = mainSelection();
		}

		return i;
	}

}
