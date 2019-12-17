package com.revature.services;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.models.Admin;
import com.revature.models.Client;
import com.revature.models.Employee;

public class UserAuthentTest {


	@Test
	public void testPassConfirmationClientTrue() {
		int i = "password".hashCode();
		Client c = new Client("Test", "Client", "tclient", i);
		String[] arr = {"password", "\n"};
		assertTrue(UserAuthent.passConfirmation(arr, c));
	}
	
	@Test
	public void testPassConfirmationClientFalse() {
		int i = "wordpass".hashCode();
		Client c = new Client("Test", "Client", "tclient", i);
		String[] arr = {"password", "\n"};
		assertFalse(UserAuthent.passConfirmation(arr, c));
	}
	
	@Test
	public void testPassConfirmationEmployeeTrue() {
		int i = "password".hashCode();
		Employee c = new Employee("Test", "Employee", "tclient", i);
		String[] arr = {"password", "\n"};
		assertTrue(UserAuthent.passConfirmation(arr, c));
	}
	
	@Test
	public void testPassConfirmationEmployeeFalse() {
		int i = "wordpass".hashCode();
		Employee c = new Employee("Test", "Employee", "tclient", i);
		String[] arr = {"password", "\n"};
		assertFalse(UserAuthent.passConfirmation(arr, c));
	}
	
	@Test
	public void testPassConfirmationAdminTrue() {
		int i = "password".hashCode();
		Admin c = new Admin("Test", "Admin", "tclient", i);
		String[] arr = {"password", "\n"};
		assertTrue(UserAuthent.passConfirmation(arr, c));
	}
	
	@Test
	public void testPassConfirmationAdminFalse() {
		int i = "wordpass".hashCode();
		Admin c = new Admin("Test", "Admin", "tclient", i);
		String[] arr = {"password", "\n"};
		assertFalse(UserAuthent.passConfirmation(arr, c));
	}


}
