package com.revature.services;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.models.Account;

public class AccountServicesTest {

	@Test
	public void testTransferMath() {
		Account a = new Account(2001, "savings", 1, 20000);
		Account ac = new Account(2002, "checking", 1, 30000);
		double d = 3000;
		double e = 17000.0;
		assertEquals(e, AccountServices.transferMath(a, ac, d), 0.1);
	}

	@Test
	public void testTransferMathFail() {
		Account a = new Account(2001, "savings", 1, 20000);
		Account ac = new Account(2002, "checking", 1, 30000);
		double d = 3000;
		double e = 17001.0;
		assertNotEquals(e, AccountServices.transferMath(a, ac, d), 0.1);
	}

	@Test
	public void testTransferMathNegative() {
		Account a = new Account(2001, "savings", 1, 20000);
		Account ac = new Account(2002, "checking", 1, 30000);
		double d = -3000;
		double e = -1;
		assertEquals(e, AccountServices.transferMath(a, ac, d), 0);
	}

	@Test
	public void testTransferMathNegativeFail() {
		Account a = new Account(2001, "savings", 1, 20000);
		Account ac = new Account(2002, "checking", 1, 30000);
		double d = -3000;
		double e = -2;
		assertNotEquals(e, AccountServices.transferMath(a, ac, d), 0);
	}

	@Test
	public void testTransferMathOtherAcc() {
		Account a = new Account(2001, "savings", 1, 20000);
		Account ac = new Account(2002, "checking", 1, 30000);
		double d = 3000;
		double e = 33000.0;
		AccountServices.transferMath(a, ac, d);
		assertEquals(e, ac.getBalance(), 0.1);
	}
	
	@Test
	public void testTransferMathOtherAccFails() {
		Account a = new Account(2001, "savings", 1, 20000);
		Account ac = new Account(2002, "checking", 1, 30000);
		double d = 3000;
		double e = 33001.0;
		AccountServices.transferMath(a, ac, d);
		assertNotEquals(e, ac.getBalance(), 0.1);
	}

	@Test
	public void testWithdrawMath() {
		Account a = new Account(2001, "savings", 1, 20000);
		double d = 3000;
		double e = (20000 - 3000);
		assertEquals(e, AccountServices.withdrawMath(a, d), 0.1);
	}

	@Test
	public void testWithdrawMathFail() {
		Account a = new Account(2001, "savings", 1, 20000);
		double d = 3000;
		double e = 17001.0;
		assertNotEquals(e, AccountServices.withdrawMath(a, d), 0.1);
	}

	@Test
	public void testWithdrawMathNeg() {
		Account a = new Account(2001, "savings", 1, 20000);
		double d = -3000;
		double e = -1;
		assertEquals(e, AccountServices.withdrawMath(a, d), 0);
	}

	@Test
	public void testWithdrawMathNegFail() {
		Account a = new Account(2001, "savings", 1, 20000);
		double d = -3000;
		double e = -2;
		assertNotEquals(e, AccountServices.withdrawMath(a, d), 0);
	}

	@Test
	public void testDepositMath() {
		Account a = new Account(2001, "savings", 1, 20000);
		double d = 3000;
		double e = 23000.0;
		assertEquals(e, AccountServices.depositMath(a, d), 0.1);
	}

	@Test
	public void testDepositMathFail() {
		Account a = new Account(2001, "savings", 1, 20000);
		double d = 3000;
		double e = 23001.0;
		assertNotEquals(e, AccountServices.depositMath(a, d), 0.1);
	}

	@Test
	public void testDepositMathNeg() {
		Account a = new Account(2001, "savings", 1, 20000);
		double d = -3000;
		double e = -1;
		assertEquals(e, AccountServices.depositMath(a, d), 0);
		
	}
	
	@Test
	public void testDepositMathNegFail() {
		Account a = new Account(2001, "savings", 1, 20000);
		double d = -3000;
		double e = -2;
		assertNotEquals(e, AccountServices.depositMath(a, d), 0);
		
	}

}
