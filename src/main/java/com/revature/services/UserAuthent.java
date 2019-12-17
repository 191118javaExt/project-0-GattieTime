package com.revature.services;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;


import com.revature.models.User;
import com.revature.repositories.AdminDAOImp;
import com.revature.repositories.ClientDAOImp;
import com.revature.repositories.EmployeeDAOImp;

public class UserAuthent {

	private static Logger logger = Logger.getLogger(UserAuthent.class);

	public static void UserConfirm() {
		int userType = typeOfUser();

		User newUser = null;
		if (userType == 1) {
			int typeLog = typeOfLogIn();
			ClientDAOImp cliDAO = new ClientDAOImp();
			if (typeLog == 1) {
				String logIn = logInImput();
				newUser = cliDAO.findByLogIn(logIn);
				if (newUser == null) {
					System.out.println("User name was not valid. Please restart the application and try again");
					logger.info("Client's user name was not found");
					System.exit(0);
				}
				if (passConfirm(newUser)) {
					System.out.println("Welcome " + newUser.getUserFirstName() + " " + newUser.getUserLastName()
							+ ". You have successfully logged in.");
					logger.info("Client logged in successfully");
					ClientServices.mainMenu(newUser);
				} else {
					System.out.println(
							"Your user name and password did not match. Please restart the application and try again.");
					logger.info("Client failed user authentification.");
				}
			} else if (typeLog == 2) {
				int userId = idImput();
				newUser = cliDAO.findById(userId);
				if (newUser == null) {
					System.out.println("User name was not valid. Please restart the application and try again");
					logger.info("Client's user name was not found");
					System.exit(0);
				}
				if (passConfirm(newUser)) {
					System.out.println("Welcome " + newUser.getUserFirstName() + " " + newUser.getUserLastName()
							+ ". You have successfully logged in.");
					logger.info("Client logged in successfully");
					ClientServices.mainMenu(newUser);
				} else {
					System.out.println(
							"Your user name and password did not match. Please restart the application and try again.");
					logger.info("Client failed user authentification.");
				}
			}else {
				System.out.println("Something went wrong. Please restart the application and try again.");
				logger.warn("invalid log in type returned.");
			}

		}else if (userType==2) {
			int typeLog = typeOfLogIn();
			EmployeeDAOImp empDAO = new EmployeeDAOImp();
			if (typeLog == 1) {
				String logIn = logInImput();
				newUser = empDAO.findByLogIn(logIn);
				if (newUser == null) {
					System.out.println("User name was not valid. Please restart the application and try again");
					logger.info("Employee's user name was not found");
					System.exit(0);
				}
				if (passConfirm(newUser)) {
					System.out.println("Welcome " + newUser.getUserFirstName() + " " + newUser.getUserLastName()
							+ ". You have successfully logged in.");
					logger.info("Employee logged in successfully");
					EmployeeServices.mainMenu();
				} else {
					System.out.println(
							"Your user name and password did not match. Please restart the application and try again.");
					logger.info("Employee failed user authentification.");
				}
			} else if (typeLog == 2) {
				int userId = idImput();
				newUser = empDAO.findById(userId);
				if (newUser == null) {
					System.out.println("User name was not valid. Please restart the application and try again");
					logger.info("Employee's user name was not found");
					System.exit(0);
				}
				if (passConfirm(newUser)) {
					System.out.println("Welcome " + newUser.getUserFirstName() + " " + newUser.getUserLastName()
							+ ". You have successfully logged in.");
					logger.info("Employee logged in successfully");
					EmployeeServices.mainMenu();
				} else {
					System.out.println(
							"Your user name and password did not match. Please restart the application and try again.");
					logger.info("Employee failed user authentification.");
				}
			}else {
				System.out.println("Something went wrong. Please restart the application and try again.");
				logger.warn("invalid log in type returned.");
			}
		}else if (userType == 3) {
			int typeLog = typeOfLogIn();
			AdminDAOImp admDAO = new AdminDAOImp();
			if (typeLog == 1) {
				String logIn = logInImput();
				newUser = admDAO.findByLogIn(logIn);
				if (newUser == null) {
					System.out.println("User name was not valid. Please restart the application and try again");
					logger.info("Admin user name was not found");
					System.exit(0);
				}
				if (passConfirm(newUser)) {
					System.out.println("Welcome " + newUser.getUserFirstName() + " " + newUser.getUserLastName()
							+ ". You have successfully logged in.");
					logger.info("Admin logged in successfully");
					AdminServices.mainMenu();
				} else {
					System.out.println(
							"Your user name and password did not match. Please restart the application and try again.");
					logger.info("Client failed user authentification.");
				}
			} else if (typeLog == 2) {
				int userId = idImput();
				newUser = admDAO.findById(userId);
				if (newUser == null) {
					System.out.println("User name was not valid. Please restart the application and try again");
					logger.info("Client's user name was not found");
					System.exit(0);
				}
				if (passConfirm(newUser)) {
					System.out.println("Welcome " + newUser.getUserFirstName() + " " + newUser.getUserLastName()
							+ ". You have successfully logged in.");
					logger.info("Admin logged in successfully");
					AdminServices.mainMenu();
				} else {
					System.out.println(
							"Your user name and password did not match. Please restart the application and try again.");
					logger.info("Admin failed user authentification.");
				}
			}else {
				System.out.println("Something went wrong. Please restart the application and try again.");
				logger.warn("invalid log in type returned.");
			}

		} 
	}

	private static int idImput() {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your user id?");
		int id = s.nextInt();
		return id;
	}

	private static boolean passConfirm(User newUser) {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your password?");
		String[] passArr = s.nextLine().split("\\n");
		if (passConfirmation(passArr, newUser)) {
			return true;
		} else {
			return false;
		}
	}

	static boolean passConfirmation(String[] passArr, User newUser) {
		int pass = passArr[0].hashCode();
		if (pass == newUser.getUserPassword()) {
			return true;
		} else {
			return false;
		}
	}

	private static String logInImput() {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your user name?");
		String[] logInArr = s.nextLine().split("\\n");
		String logIn = logInArr[0];
		return logIn;
	}

	private static int typeOfLogIn() {
		Scanner s = new Scanner(System.in);
		System.out.println("How would you like to log in?");
		System.out.println("[1]: With a user name.");
		System.out.println("[2]: With your User ID number");
		int i = 0;
		try {
			i = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			typeOfLogIn();
		}

		if (i != 1 && i != 2) {
			System.out.println("You did not enter a valid number.");
			i = typeOfLogIn();
		}

		return i;
	}

	private static int typeOfUser() {
		Scanner s = new Scanner(System.in);
		System.out
				.println("What type of user are you trying to log in as? Please type the number and press \"enter.\"");
		System.out.println("[1]: Client Account");
		System.out.println("[2]: Employeee Account");
		System.out.println("[3]: Administrator Account");
		int i = 0;
		try {
			i = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = typeOfUser();
		}

		if (i != 1 && i != 2 && i != 3) {
			System.out.println("You did not enter a valid number.");
			i = typeOfUser();
		}

		return i;
	}

}