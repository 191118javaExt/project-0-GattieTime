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
			}else {
				System.out.println("That account has not yet been approved. Please wait for approval before trying to access that account.");
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

	private static void transactions(Account a) {
		System.out.println(a);
		int i = transSelect();
		if (i == 1) {
			AccountDAOImp aDAO = new AccountDAOImp();
			System.out.println("Your account " + a.getName() + " has a balance of " + a.getBalance() + ".");
			transfer(a);
			transactions(a);
		}

	}

	private static void transfer(Account a) {
		System.out.println("How much would you like to deposit?");
		Scanner s = new Scanner(System.in);
		double i = 0;
		try {
			i = s.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry; please try again.");
			transactions(a);
		}
		if (i >= 0) {
			double d = a.getBalance();
			i += d;
			a.setBalance(i);
			AccountDAOImp aDAO = new AccountDAOImp();
			aDAO.update(a);
			System.out.println(
					"Congradulations your transaction is complete. You account balance is now " + a.getBalance());
			logger.info("Deposit made into account");
		} else {
			System.out.println(
					"You man not make a deposite of a negative amount. If you would like to make a withdrawl please do so now");
			logger.info("User tried to deposit a negative amount");
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
		System.out.println("What is the number of the account you would like to access? Type 0 to exit");
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
		// TODO Auto-generated method stub

	}

}
