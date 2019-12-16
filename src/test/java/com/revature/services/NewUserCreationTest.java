package com.revature.services;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.models.Admin;
import com.revature.models.Client;
import com.revature.models.Employee;

public class NewUserCreationTest {


	@Test
	public void testConstructAdmin() {
		Admin aTest = new Admin("test", "admin", "atest", 3000);
		Admin a = NewUserCreation.constructAdmin("test", "admin", "atest", 3000);
		assertEquals(aTest, a);
	}
	
	@Test
	public void testConstructAdminFirstFalse() {
		Admin aTest = new Admin("test", "admin", "atest", 3000);
		Admin a = NewUserCreation.constructAdmin("nope", "admin", "atest", 3000);
		assertNotEquals(aTest, a);
	}
	
	@Test
	public void testConstructAdminLastFalse() {
		Admin aTest = new Admin("test", "admin", "atest", 3000);
		Admin a = NewUserCreation.constructAdmin("test", "haha", "atest", 3000);
		assertNotEquals(aTest, a);
	}
	
	@Test
	public void testConstructAdminNameFalse() {
		Admin aTest = new Admin("test", "admin", "atest", 3000);
		Admin a = NewUserCreation.constructAdmin("test", "admin", "blah", 3000);
		assertNotEquals(aTest, a);
	}
	
	
	@Test
	public void testConstructAdminPassFalse() {
		Admin aTest = new Admin("test", "admin", "atest", 3000);
		Admin a = NewUserCreation.constructAdmin("test", "admin", "atest", 8675309);
		assertNotEquals(aTest, a);
	}

	@Test
	public void testConstructEmployee() {
		Employee eTest = new Employee("test", "employee", "etest", 2000);
		Employee e = NewUserCreation.constructEmployee("test", "employee", "etest", 2000);
		assertEquals(eTest, e);
	}
	
	@Test
	public void testConstructEmployeeFirstFalse() {
		Employee eTest = new Employee("test", "employee", "etest", 2000);
		Employee e = NewUserCreation.constructEmployee("emp", "employee", "etest", 2000);
		assertNotEquals(eTest, e);
	}
	
	@Test
	public void testConstructEmployeeLastFalse() {
		Employee eTest = new Employee("test", "employee", "etest", 2000);
		Employee e = NewUserCreation.constructEmployee("test", "fake", "etest", 2000);
		assertNotEquals(eTest, e);
	}
	
	@Test
	public void testConstructEmployeeNameFalse() {
		Employee eTest = new Employee("test", "employee", "etest", 2000);
		Employee e = NewUserCreation.constructEmployee("test", "employee", "t", 2000);
		assertNotEquals(eTest, e);
	}
	
	@Test
	public void testConstructEmployeePassFalse() {
		Employee eTest = new Employee("test", "employee", "etest", 2000);
		Employee e = NewUserCreation.constructEmployee("test", "employee", "etest", 9999);
		assertNotEquals(eTest, e);
	}
	
	

	@Test
	public void testConstructClient() {
		Client cTest = new Client("test", "client", "ctest", 1000);
		Client c = NewUserCreation.constructClient("test", "client", "ctest", 1000);
		assertEquals(cTest, c);
	}
	
	@Test
	public void testConstructClientFirstFalse() {
		Client cTest = new Client("test", "client", "ctest", 1000);
		Client c = NewUserCreation.constructClient("client", "client", "ctest", 1000);
		assertNotEquals(cTest, c);
	}
	
	@Test
	public void testConstructClientLastFalse() {
		Client cTest = new Client("test", "client", "ctest", 1000);
		Client c = NewUserCreation.constructClient("test", "test", "ctest", 1000);
		assertNotEquals(cTest, c);
	}
	
	@Test
	public void testConstructClientNameFalse() {
		Client cTest = new Client("test", "client", "ctest", 1000);
		Client c = NewUserCreation.constructClient("test", "client", "est", 1000);
		assertNotEquals(cTest, c);
	}
	
	@Test
	public void testConstructClientPasswordFalse() {
		Client cTest = new Client("test", "client", "ctest", 1000);
		Client c = NewUserCreation.constructClient("test", "client", "ctest", 67);
		assertNotEquals(cTest, c);
	}
}
