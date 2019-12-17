package com.revature.services;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.revature.models.Admin;
import com.revature.models.Client;
import com.revature.models.Employee;
import com.revature.models.User;
import com.revature.repositories.AdminDAOImp;
import com.revature.repositories.ClientDAOImp;
import com.revature.repositories.EmployeeDAOImp;

public class NewUserCreation {

	public static User newUserAccount() {
		int userType = typeOfUser();
		String firstName = makeNewFirst();
		String lastName = makeNewLast();
		String logIn = makeNewLogIn();
		int password = makeNewPassword();

		User newUser = null;
		if (userType == 1) {
			newUser = constructClient(firstName, lastName, logIn, password);
		} else if (userType == 2) {
			constructEmployee(firstName, lastName, logIn, password);
		} else if (userType == 3) {
			newUser = constructAdmin(firstName, lastName, logIn, password);	
		}

		return newUser;

	}

	static Admin constructAdmin(String firstName, String lastName, String logIn, int password) {
		Admin newUser = new Admin(firstName, lastName, logIn, password);
		AdminDAOImp admDAO = new AdminDAOImp();
		if (!admDAO.insert((Admin) newUser)) {
			System.out.println("Something went wrong. Please try again.");
		} else {
			System.out.println("Your account is waiting verification by an administrator.");
		}
		return newUser;
	}

	static Employee constructEmployee(String firstName, String lastName, String logIn, int password) {
		Employee newUser = new Employee(firstName, lastName, logIn, password);
		EmployeeDAOImp empDAO = new EmployeeDAOImp();
		if (!empDAO.insert((Employee) newUser)) {
			System.out.println("Something went wrong. Please try again.");
		} else {
			System.out.println("Your account is waiting verification by an administrator.");
		}
		return newUser;
	}

	static Client constructClient(String firstName, String lastName, String logIn, int password) {
		Client newUser = new Client(firstName, lastName, logIn, password);
		ClientDAOImp cliDAO = new ClientDAOImp();
		if (!cliDAO.insert((Client) newUser)) {
			System.out.println("Something went wrong. Please try again.");
		} else {
			System.out.println("Your account has been created. Please restart the application and sign in.");
		}
		return newUser;
	}
	
	

//Determine the type of user to create
	private static int typeOfUser() {
		Scanner s = new Scanner(System.in);
		System.out
				.println("What type of user is this account for? Please type the appropiate number and press 'enter'");
		System.out.println("[1]: New Client Account");
		System.out.println("[2]: New Employeee Account");
		System.out.println("[3]: New Administrator Account");
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

	static int makeNewPassword() {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your password?");
		boolean b = false;
		String password = new String();
		int pashash = 0;
		while (b == false) {
			password = new String(s.nextLine());
			pashash = password.hashCode();
			System.out.println("please reenter your password");
			int pass2 = s.nextLine().hashCode();
			if (pashash == pass2) {
				b = true;
			} else {
				System.out.println("Passwords did not match. Please enter your password again.");
			}
		}
		return pashash;
	}

	// Gets and confirms the user's preferred login name
	static String makeNewLogIn() {
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
			EmployeeDAOImp edao = new EmployeeDAOImp();
			List<Employee> list = edao.findAll();
			for (Employee e : list) {
				if (lastName.equals(e.getUserLogIn())) {
					ans = "no";
					System.out.println("That log in name is already taken; please try another name.");
				}
			}
			if (ans.length() != 0 && ans.charAt(0) == 'y') {
				b = true;
			} else {
				System.out.println("Please enter the name again.");
			}
		}
		return lastName;
	}

	// Gets and confirms user's last name
	static String makeNewLast() {
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
			if (ans.length() != 0 && ans.charAt(0) == 'y') {
				b = true;
			} else {
				System.out.println("Please enter the name again.");
				s.nextLine();
			}
		}
		return lastName;
	}

	// Gets and confirms user's first name
	static String makeNewFirst() {
		Scanner s = new Scanner(System.in);
		System.out.println("What is the account owner's First Name?");
		String firstName = new String();
		boolean b = false;
		while (b == false) {
			firstName = s.nextLine();
			System.out.println("Is this the correct first name?");
			System.out.println(firstName);
			System.out.println("Type \"yes\" or \"no.\"");
			String ans = new String(s.nextLine());
			ans = ans.toLowerCase();
			if (ans.length() != 0 && ans.charAt(0) == 'y') {
				b = true;
			} else {
				System.out.println("Please enter the name again.");
			}
		}
		return firstName;
	}

}
