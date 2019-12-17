package com.revature.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.revature.models.Client;
import com.revature.repositories.ClientDAOImp;

public class ClientServicesTest {

	@Before
	public void setUp() throws Exception {
		Client c = new Client (17, "Test", "Client", "tClient", 1216985755);
		ClientDAOImp cDAO = new ClientDAOImp();
		cDAO.update(c);
	}

	@Test
	public void testChangePassword() {
		ClientDAOImp cDAO = new ClientDAOImp();
		Client c = cDAO.findById(17);
		int pass = 12345;
		assertEquals(12345, ClientServices.changePassword(c, pass).getUserPassword());
		
	}
	
	@Test
	public void testChangePasswordFail() {
		ClientDAOImp cDAO = new ClientDAOImp();
		Client c = cDAO.findById(17);
		int pass = 12345;
		assertNotEquals("password".hashCode(), ClientServices.changePassword(c, pass).getUserPassword());
	}

	@Test
	public void testChangeLogIn() {
		ClientDAOImp cDAO = new ClientDAOImp();
		Client c = cDAO.findById(17);
		String logIn = "cTlient";
		assertEquals("cTlient", ClientServices.changeLogIn(c, logIn).getUserLogIn());
	}

	@Test
	public void testChangeLogInFail() {
		ClientDAOImp cDAO = new ClientDAOImp();
		Client c = cDAO.findById(17);
		String logIn = "cTlient";
		assertNotEquals("tclient", ClientServices.changeLogIn(c, logIn).getUserLogIn());
	}
	
	@Test
	public void testChangeLast() {
		ClientDAOImp cDAO = new ClientDAOImp();
		Client c = cDAO.findById(17);
		String last = "McTestFace";
		assertEquals("McTestFace", ClientServices.changeLast(c, last).getUserLastName());
	}
	
	@Test
	public void testChangeLastFail() {
		ClientDAOImp cDAO = new ClientDAOImp();
		Client c = cDAO.findById(17);
		String last = "McTestFace";
		assertNotEquals("Client", ClientServices.changeLast(c, last).getUserLastName());
	}
	
	
	@Test
	public void testChangeFirst() {
		ClientDAOImp cDAO = new ClientDAOImp();
		Client c = cDAO.findById(17);
		String first = "Testy";
		assertEquals("Testy", ClientServices.changeFirst(c, first).getUserFirstName());
	}
	
	@Test
	public void testChangeFirstFail() {
		ClientDAOImp cDAO = new ClientDAOImp();
		Client c = cDAO.findById(17);
		String first = "Testy";
		assertNotEquals("Test", ClientServices.changeFirst(c, first).getUserFirstName());
	}


}
