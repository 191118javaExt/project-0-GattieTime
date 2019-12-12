package com.revature;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.revature.models.*;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Welcome to your banking application. What would you like to do?");

		entrySwitch(entryScreen());
		
		
		Scanner s = new Scanner(System.in);
		s.close();

	}

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
			System.out.println("You are trying to log in.");
			break;
		case 2:
			System.out.println("Welcome new User!");
			User newUser = newUserAccount();
			System.out.println(newUser);
			break;
		case 3:
			System.out.println("Thank you for using our application. Goodbye.");
		default:
			System.out.println("Sorry, have encountered an error. Please try the program again or "
					+ "contact a bank administrator for support.");
		}

	}

	private static User newUserAccount() {
		int userType = typeOfUser();
		String firstName = makeNewFirst();
		String lastName = makeNewLast();
		String logIn = makeNewLogIn();
		String password = makeNewPassword();

		User newUser = null;
		if (userType == 1) {
			newUser = new Client(firstName, lastName, logIn, password);
		} else if(userType==2) {
			newUser = new Employee(firstName, lastName, logIn, password);
			System.out.println("Thank you, your user account will have to be approved by another Administrator before you be able to use it.");
		} else if( userType ==3 ) {
			newUser = new Admin(firstName, lastName, logIn, password);
			System.out.println("Thank you, your user account will have to be approved by another Administrator before you be able to use it.");
		}

		return newUser;

	}

//Determine the type of user to create
	private static int typeOfUser() {
		Scanner s = new Scanner(System.in);
		System.out.println("What type of user is this account for? Please type the appropiate number and press 'enter'");
		System.out.println("[1]: New Client Account");
		System.out.println("[2]: New Employeee Account");
		System.out.println("[3]: New Administrator Account");
		int i = 0;
		try {
			i = s.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			typeOfUser();
		}

		if (i != 1 && i != 2 && i != 3) {
			System.out.println("You did not enter a valid number.");
			i = typeOfUser();
		}
		

		return i;
	}

	private static String makeNewPassword() {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your password?");
		boolean b = false;
		String lastName = new String();
		while (b == false) {
			lastName = new String(s.nextLine());
			System.out.println("Is this the correct password?");
			System.out.println(lastName);
			System.out.println("Type \"yes\" or \"no.\"");
			String ans = new String(s.nextLine());
			ans = ans.toLowerCase();
			
			if (ans.length()!=0 && ans.charAt(0) == 'y') {
				b = true;
			} else {
				System.out.println("Please enter your password again.");
			}
		}
		return lastName;
	}

	// Gets and confirms the user's preferred login name
	private static String makeNewLogIn() {
		Scanner s = new Scanner(System.in);
		System.out.println("What should your log in name be?");
		boolean b = false;
		String lastName = new String();
		while (b == false) {
			lastName = new String(s.nextLine());
			System.out.println("Is this the correct log in name?");
			System.out.println(lastName);
			System.out.println("Type \"yes\" or \"no.\"");
			String ans = new String(s.nextLine());
			ans = ans.toLowerCase();
			// TODO check if name is already in use
			if (ans.length()!=0 && ans.charAt(0) == 'y') {
				b = true;
			} else {
				System.out.println("Please enter the name again.");
			}
		}
		return lastName;
	}

	// Gets and confirms user's last name
	private static String makeNewLast() {
		Scanner s = new Scanner(System.in);
		System.out.println("What is the user's last name?");
		boolean b = false;
		String lastName = new String();
		while (b == false) {
			lastName = s.nextLine();
			System.out.println("Is this the correct last name?");
			System.out.println(lastName);
			System.out.println("Type \"yes\" or \"no.\"");
			String ans = new String(s.next());
			ans = ans.toLowerCase();
			if (ans.length()!=0 && ans.charAt(0) == 'y') {
				b = true;
			} else {
				System.out.println("Please enter the name again.");
				s.nextLine();
			}
		}
		return lastName;
	}

	// Gets and confirms user's first name
	private static String makeNewFirst() {
		Scanner s = new Scanner(System.in);
		System.out.println("What is the user's First Name?");
		String firstName = new String();
		boolean b = false;
		while (b == false) {
			firstName = s.nextLine();
			System.out.println("Is this the correct first name?");
			System.out.println(firstName);
			System.out.println("Type \"yes\" or \"no.\"");
			String ans = new String(s.nextLine());
			ans = ans.toLowerCase();
			if (ans.length()!=0 && ans.charAt(0) == 'y') {
				b = true;
			} else {
				System.out.println("Please enter the name again.");
			}
		}
		return firstName;
	}

}
