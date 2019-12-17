package com.revature.services;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.models.Account;
import com.revature.models.User;
import com.revature.repositories.AccountDAOImp;

public class AccountServices {
	private static Logger logger = Logger.getLogger(AccountServices.class);

	public static void manageAccounts(User user) {
		AccountDAOImp aDAO = new AccountDAOImp();
		List<Account> list = aDAO.findByOwnerId(user.getUserID());
		System.out.println("Your account(s) is/are: ");
		for (Account a : list) {
			System.out.println(a);
		}
		int i = selectAcc();
		Account a = aDAO.findById(i);
		if (a.getUserID() == user.getUserID()) {
			if (a.isApproved()) {
				transactions(a);
			} else {
				System.out.println(
						"That account has not yet been approved. Please wait for approval before trying to access that account.");
				manageAccounts(user);
				logger.info("User tried to access an unapproved account.");
			}
		} else {
			System.out.println(
					"That account is not your account. Please try again and be sure to use the account's ID number");
			logger.info("User tried to access account they do not own");
			manageAccounts(user);
		}
	}

	static void transactions(Account a) {
		System.out.println(a);
		int i = transSelect();
		if (i == 1) {
			System.out.println("Your account " + a.getName() + " has a balance of " + a.getBalance() + ".");
			deposit(a);
			transactions(a);
		} else if (i == 2) {
			System.out.println("Your account " + a.getName() + " has a balance of " + a.getBalance() + ".");
			withdraw(a);
			transactions(a);
		} else if (i == 3) {
			System.out.println("Your account " + a.getName() + " has a balance of " + a.getBalance() + ".");
			transfer(a);
			transactions(a);
		} else if (i == 4) {
			System.out.println("Thank you for chosing Her Royal Majesty's Bank of Revature. Where unicorns do their banking.");
			logger.info("User exited from accounts menu.");
		} else {
			System.out.println("Something went wrong. Please restart the application and try again.");
			logger.warn("invailid int returned from transSelect");
		}

	}

	private static void transfer(Account a) {
		System.out.println("What is the account number number you would like to transer funds to?");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		AccountDAOImp aDAO = new AccountDAOImp();
		Account ac = aDAO.findById(i);
		if (ac == null) {
			System.out.println("That is not a valid account number. Please try again");
			logger.info("User tried to transer to an account that does not exist.");
		} else {
			System.out.println("How much would you like to transfer?");
			double e = 0;
			try {
				e = s.nextDouble();

			} catch (InputMismatchException ex) {
				System.out.println("That is not a valid entry; please try again.");
				transactions(a);
			}
			transferMath(a, ac, e);
			
		}

	}

	static double transferMath(Account a, Account ac, double e) {
		AccountDAOImp aDAO = new AccountDAOImp();
		if (e >= 0) {
			double d = ac.getBalance();
			d += e;
			ac.setBalance(d);
			aDAO.update(ac);
			d = a.getBalance();
			d -= e;
			a.setBalance(d);
			aDAO.update(a);
			System.out.println(
					"Congradulations your transaction is complete. You account balance is now " + a.getBalance());
			logger.info("transfer made between accounts" + a.getAccID() + "and" + ac.getAccID());
			return a.getBalance();
		} else {
			System.out.println("You man not make a deposit of a negative amount. please try again");
			logger.info("User tried to transfer a negative amount");
			return -1.0;
		}
		
	}

	private static void withdraw(Account a) {
		System.out.println("How much would you like to withdraw?");
		Scanner s = new Scanner(System.in);
		double i = 0;
		try {
			i = s.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			transactions(a);
		}
		withdrawMath(a, i);
		

	}

	static double withdrawMath(Account a, double i) {
		if (i >= 0) {
			double d = a.getBalance();
			d -= i;
			a.setBalance(d);
			AccountDAOImp aDAO = new AccountDAOImp();
			aDAO.update(a);
			System.out.println(
					"Congradulations your transaction is complete. You account balance is now " + a.getBalance());
			logger.info("Deposit made into account");
			return a.getBalance();
		} else {
			System.out.println(
					"You man not make a withdraw of a negative amount. If you would like to make a deposit please do so now");
			logger.info("User tried to withdraw a negative amount");
			return -1;
		}
		
	}

	private static void deposit(Account a) {
		System.out.println("How much would you like to deposit?");
		Scanner s = new Scanner(System.in);
		double i = 0;
		try {
			i = s.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			transactions(a);
		}
		depositMath(a, i);
		

	}

	static double depositMath(Account a, double i) {
		if (i >= 0) {
			double d = a.getBalance();
			i += d;
			a.setBalance(i);
			AccountDAOImp aDAO = new AccountDAOImp();
			aDAO.update(a);
			System.out.println(
					"Congradulations your transaction is complete. You account balance is now " + a.getBalance());
			logger.info("Deposit made into account");
			return a.getBalance();
		} else {
			System.out.println(
					"You man not make a deposite of a negative amount. If you would like to make a withdrawl please do so now");
			logger.info("User tried to deposit a negative amount");
			return -1;
		}
		
	}

	private static int transSelect() {
		System.out.println("What would type of transaction would you like to complete?");
		System.out.println("[1]: Deposit");
		System.out.println("[2]: Withdrawl");
		System.out.println("[3]: Transfer");
		System.out.println("[4]: Exit");
		Scanner s = new Scanner(System.in);
		int i = 0;
		try {
			i = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = transSelect();
		}

		if (i != 1 && i != 2 && i != 3 && i != 4) {
			System.out.println("You did not enter a valid number.");
			i = transSelect();
		}

		return i;
	}

	private static int selectAcc() {
		System.out.println("What is the account number of the account you would like to access? Type 0 to exit");
		Scanner s = new Scanner(System.in);
		int i = 0;
		try {
			i = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = selectAcc();
		}

		if (i == 0) {
			System.out.println(
					"Thank you for chosing Her Royal Majesty's Bank of Revature. Where unicorns do their banking.");
			System.exit(0);
			logger.info("User exited while selecting bank account");
		}

		return i;
	}

	public static void apply(User user) {
		System.out.println("Thank you for apply for a new account");
		int type = accType();
		int userId = user.getUserID();
		String name = accName();
		double balance = startBalance();
		
		Account a = new Account(userId, name, type, balance);
		AccountDAOImp aDAO = new AccountDAOImp();
		if (aDAO.insert(a)) {
			System.out.println("Your new account has been created. Please take note of the account of the account number below.");
			System.out.println(a);
			System.out.println("Please note that you will not be able to access the account until it is approved.");
			logger.info("User applied for a new bank account");
		} else {
			System.out.println("Unable to create the new account. Please try again.");
			logger.warn("User application for a bank account failed.");
			apply(user);
		}

	}

	private static double startBalance() {
		System.out.println("What would you like your initial deposit to be? (Your deposit must be greater than or equal to the account types minimum balance.)");
		Scanner s = new Scanner(System.in);
		double i = 0;
		try {
			i = s.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = startBalance();
		}
		
		if (i < 0) {
			System.out.println("You may not start an account with a negative balance.");
			i = startBalance();
		}
		return i; 
		
	}

	private static String accName() {
		System.out.println("What would you like to call your account?");
		Scanner s = new Scanner(System.in);
		String[] passArr = s.nextLine().split("\\n");
		String name = passArr[0];
		while (name.length() > 50) {
			System.out.println("Your account name is too long. Please chose a new account name");
			passArr = s.nextLine().split("\\n");
			name = passArr[0];
		}
		return name;
	}

	private static int accType() {
		System.out.println("What type of bank account do you want to create?");
		System.out.println("[1]: Basic Checking (no minimum balance required. No monthly fees. Annual interest rate of 0%.)");
		System.out.println("[2]: Basic Savings ((no minimum balance required. No monthly fees. Annual interest rate of 0.2%.)");
		Scanner s = new Scanner(System.in);
		int i = 0;
		try {
			i = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = accType();
		}

		if (i != 1 && i != 2) {
			System.out.println("You did not enter a valid number.");
			i = accType();
		}

		return i;
	}

	public static void manageApplications() {
		System.out.println("These are the current unapproved account applications:");
		AccountDAOImp aDAO = new AccountDAOImp();
		List<Account> list = aDAO.findApprove();
		for (Account a: list) {
			System.out.println(a);
		}
		accountApprove();
		
		
	}

	private static void accountApprove() {
		System.out.println("What is the account number of the account would you like to approve? Type 0 to exit.");
		Scanner s = new Scanner(System.in);
		int i = 0;
		try {
			i = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			i = selectAcc();
		}

		if (i == 0) {
			System.out.println(
					"Her Royal Majesty thanks you for your dedication.");
			System.exit(0);
			logger.info("User exited from account approve screen.");
		} else {
			AccountDAOImp aDAO = new AccountDAOImp();
			Account a = aDAO.findById(i);
			a.setApproved(true);
			aDAO.update(a);
			System.out.println("You have approved account: " + i + ".");
			logger.info("Account " +i+ " approved.");
		}

		
	}

}
