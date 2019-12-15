package com.revature.services;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.models.Client;
import com.revature.models.User;
import com.revature.repositories.ClientDAOImp;

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

	private static void changeInfo(User user) {
		System.out.println("What information would you like to change? Please type the number of your choice below and hit \"enter.\"");
		System.out.println("[1]: Your first name.");
		System.out.println("[2]: Your last name.");
		System.out.println("[3]: Your log in name.");
		System.out.println("[4]: Your password name.");
		System.out.println("[5]: Return to previous menu.");
		int i = infoSelection();
		if (i == 1) {
			String newName = NewUserCreation.makeNewFirst();
			user.setUserFirstName(newName);
			ClientDAOImp cDAO = new ClientDAOImp();
			cDAO.update((Client) user);
			System.out.println("User account's first name has been updated.");
			System.out.println(user);
			logger.info("first name changed");
			mainMenu(user);
		} else if (i == 2) {
			String newName = NewUserCreation.makeNewLast();
			user.setUserLastName(newName);
			ClientDAOImp cDAO = new ClientDAOImp();
			cDAO.update((Client) user);
			System.out.println("User account's last name has been updated.");
			System.out.println(user);
			logger.info("last name changed");
			mainMenu(user);
		} else if (i == 3) {
			String newLog = NewUserCreation.makeNewLogIn();
			user.setUserLogIn(newLog);
			ClientDAOImp cDAO = new ClientDAOImp();
			cDAO.update((Client) user);
			System.out.println("User account's log in name has been updated.");
			System.out.println(user);
			logger.info("login name changed");
			mainMenu(user);
		} else if (i == 4) {
			System.out.println("What is your current password?");
			Scanner s = new Scanner(System.in);
			String[] passArr = s.nextLine().split("\\n");
			int pass = passArr[0].hashCode();
			if (pass == user.getUserPassword()) {
				int newPass = NewUserCreation.makeNewPassword();
				user.setUserPassword(newPass);
				ClientDAOImp cDAO = new ClientDAOImp();
				cDAO.update((Client) user);
				System.out.println("User account's password name has been updated.");
				logger.info("password changed");
				mainMenu(user);
			} else {
				System.out.println("That was not the correct password for this account. Please try again.");
				mainMenu(user);
			}
		} else if (i == 5) {
			mainMenu(user);
		}
		
		
	}

	private static int infoSelection() {
		Scanner s = new Scanner(System.in);
		int i = 0;
		try {
			i = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = mainSelection();
		}

		if (i != 1 && i != 2 && i != 3 && i != 4 && i !=5) {
			System.out.println("You did not enter a valid number.");
			i = mainSelection();
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

		if (i != 1 && i != 2 && i != 3) {
			System.out.println("You did not enter a valid number.");
			i = mainSelection();
		}

		return i;
	}

}
