package com.revature.services;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.models.User;


public class UserInterface {
	
	private static Logger logger = Logger.getLogger(UserInterface.class);

	// Ask what the user wants to do.
	public static int entryScreen() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please type the number of the action you would like to take and press 'enter:'");
		System.out.println("[1]: Log in to your user account.");
		System.out.println("[2]: Create a new user account.");
		System.out.println("[3]: Close the application.");
		int i;
		try {
			i = s.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = entryScreen();
		} catch (NoSuchElementException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = entryScreen();
		}
		while (i != 1 && i != 2 && i != 3) {
			System.out.println("You did not enter a valid number.");
			i = entryScreen();
		}

		return i;
	}

	// Take the user to their selected task
	public static void entrySwitch(int i) {

		switch (i) {
		case 1:
			UserAuthent.UserConfirm();
			break;
		case 2:
			System.out.println("Welcome new User!");
			User newUser = NewUserCreation.newUserAccount();
			break;
		case 3:
			System.out.println("Thank you for using our application. Goodbye.");
			logger.info("User quit on entry screen.");
		default:
			System.out.println("Sorry, have encountered an error. Please try the program again or "
					+ "contact a bank administrator for support.");
			logger.warn("inproper case returned to entry switch statement.");
		}

	}

}
