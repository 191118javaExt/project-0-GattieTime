package com.revature.services;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.models.Account;
import com.revature.models.Admin;
import com.revature.models.Employee;
import com.revature.repositories.AccountDAOImp;
import com.revature.repositories.AdminDAOImp;
import com.revature.repositories.EmployeeDAOImp;

public class AdminServices {
	private static Logger logger = Logger.getLogger(AdminServices.class);
	
	public static void mainMenu() {
		System.out.println("What would you like to do? Please type the number of the option you would like below and hi \"enter.\"");
		System.out.println("[1]: Review account applications");
		System.out.println("[2]: Get client information");
		System.out.println("[3]: Get account information.");
		System.out.println("[4]: Make an account transaction.");
		System.out.println("[5]: Close an account.");
		System.out.println("[6]: Approve new employee or admin user accounts.");
		System.out.println("[7]: Close the application");
		int choice = mainSelection();
		if (choice == 1) {
			AccountServices.manageApplications();
		} else if (choice ==2) {
			EmployeeServices.clientInfo();
		} else if (choice == 3) {
			EmployeeServices.accountInfo();
		} else if (choice == 4) {
			accTransact();
		} else if (choice == 5) {
			closeAcc();
		} else if (choice == 6) {
			userApprove();
		} else if (choice == 7) {
			System.out.println("Her Majesty thanks you for your service.");
			logger.info("User exited from Employee main menu.");
		}else {
			System.out.println("Something went wrong. Please restart the application and try again.");
			logger.warn("invailid int returned from Admin mainSelection");
		}
		
		
	}

	private static void userApprove() {
		int i = userType();
		if (i == 1) {
			appEmp();
		} else if (i == 2) {
			appAdm();
		}else {
			System.out.println("Something went wrong. Please restart the application and try again.");
			logger.warn("invailid int returned to userApprove.");
		}
	}

	private static void appAdm() {
		System.out.println("Here are the current unapproved Admin accounts:");
		AdminDAOImp eDAO = new AdminDAOImp();
		List<Admin> list = eDAO.findApprove();
		for (Admin e: list) {
			System.out.println(e);
		}
		int userID = chooseID();
		Admin e = eDAO.findById(userID);
		e.setApproved(true);
		System.out.println("Admin " + e.getUserID() + " was approved.");
		logger.info("Admin " + e.getUserID() + " was approved.");
		mainMenu();
	}

	private static void appEmp() {
		System.out.println("Here are the current unapproved Employee accounts:");
		EmployeeDAOImp eDAO = new EmployeeDAOImp();
		List<Employee> list = eDAO.findApprove();
		for (Employee e: list) {
			System.out.println(e);
		}
		int userID = chooseID();
		Employee e = eDAO.findById(userID);
		e.setApproved(true);
		System.out.println("Employee " + e.getUserID() + " was approved.");
		logger.info("Employee " + e.getUserID() + " was approved.");
		mainMenu();
	}

	private static int chooseID() {
		System.out.println("What user would you like to approve? Type the user ID below.");
		Scanner s = new Scanner(System.in);
		int i = 0;
		try {
			i = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = accSelect();
		}
		
		return i;
	}

	private static int userType() {
		System.out.println("What type of user account are you trying to approve?");
		System.out.println("[1]: Employee.");
		System.out.println("[2]: Administrator.");
		Scanner s = new Scanner(System.in);
		int i = 0;
		try {
			i = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = mainSelection();
		}

		if (i < 1 || i > 2) {
			System.out.println("You did not enter a valid number. Please try again. Type a number 1-4.");
			i = mainSelection();
		}

		return i;
	}

	private static void closeAcc() {
		System.out.println("You are closing an account.");
		int i = accSelect();
		AccountDAOImp aDAO = new AccountDAOImp();
		Account a = aDAO.findById(i);
		a.setApproved(false);
		aDAO.update(a);
		System.out.println("You have closed account " + a.getAccID() + ".");
		logger.info("Account " + a.getAccID() + " closed.");
		
	}

	private static void accTransact() {
		int i = accSelect();
		AccountDAOImp aDAO = new AccountDAOImp();
		Account a = aDAO.findById(i);
		AccountServices.transactions(a);
	}

	private static int accSelect() {
		System.out.println("What is the account number for the account you would like to change?");
		Scanner s = new Scanner(System.in);
		int i = 0;
		try {
			i = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = accSelect();
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

		if (i < 1 || i > 7) {
			System.out.println("You did not enter a valid number. Please try again. Type a number 1-4.");
			i = mainSelection();
		}

		return i;
	}
	

}
