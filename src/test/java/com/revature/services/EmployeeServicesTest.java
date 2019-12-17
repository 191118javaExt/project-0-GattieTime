package com.revature.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeServicesTest {


	@Test
	public void testAccountInfo() {
		assertEquals(2, EmployeeServices.accountInfo(2).getAccID());
	}
	
	@Test
	public void testAccountInfoFalse() {
		assertNotEquals(3, EmployeeServices.accountInfo(2).getAccID());
	}


	@Test
	public void testClientInfo() {
		assertEquals(17, EmployeeServices.clientInfo(17).getUserID());
	}
	
	@Test
	public void testClientInfoFalse() {
		assertNotEquals(16, EmployeeServices.clientInfo(17).getUserID());
	}


}
