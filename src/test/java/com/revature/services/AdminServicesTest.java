package com.revature.services;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.revature.models.Account;
import com.revature.repositories.AccountDAOImp;

public class AdminServicesTest {

	@Before
	public void setUp() throws Exception {
		Account a = new Account(1, 1, "Test Account", 2, 250520, true);
		AccountDAOImp aDAO = new AccountDAOImp();
		aDAO.update(a);
	}

	@After
	public void tearDown() throws Exception {
		Account a = new Account(1, 1, "Test Account", 2, 250520, true);
		AccountDAOImp aDAO = new AccountDAOImp();
		aDAO.update(a);
	}
	
	@Test
	public void testTruth() {
		AccountDAOImp aDAO = new AccountDAOImp();
		Account a = aDAO.findById(1);
		assertTrue(a.isApproved());	
	}

	@Test
	public void testCloseAcc() {
		assertFalse(AdminServices.closeAcc(1).isApproved());
	}

}
