/**
 * 
 */
package com.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author user
 *
 */
class AccountTest {
	Account account;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		account = new Account();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	
	
	@Test
	void accountObjectIsNotNullTest() {
		account = new Account();
		assertNotNull(account);
		
	}
	
	@Test
	void accountObjectCanRecieveDeposit() {
		account.depositMoney(2500);
		assertEquals(2500, account.getAccountBalance());
		
		account.depositMoney(5000);
		assertEquals(7500, account.getAccountBalance());
	}
	
	@Test
	void accountWillNotTakeNegativeAmountTest() {
		account.depositMoney(5000);
		account.depositMoney(-1500);
		int accountBalance = account.getAccountBalance();
		assertEquals(5000, accountBalance);
	}
	
	@Test
	void accountObjectCanWithdrawCash() {
		account.depositMoney(9000);
		account.withdrawCash(2000);
		assertEquals(7000, account.getAccountBalance());
	}
	
	@Test
	void accountObjectCanWithdrawWithinBalance() {
		account.depositMoney(9000);
		account.withdrawCash(10000);
		assertEquals(9000, account.getAccountBalance());
	}
	
	@Test
	void accountObjectCanWithdrawWithPin() {
		account.depositMoney(9000);
		account.withdrawCash(2000);
		account.withdrawWithPin(0515);
		assertEquals(7000, account.getAccountBalance());
	}
	
	@Test
	void accountObjectHasMinimumBalance() {
		account.depositMoney(9000);
		account.withdrawCash(8000);
		account.minimumBalance();
		assertEquals(1000, account.getAccountBalance());
	}
}
	
