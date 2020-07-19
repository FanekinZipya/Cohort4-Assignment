package com.chapter3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModifiedAccountTest {
	ModifiedAccount account;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		account = new ModifiedAccount();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void accountObjectIsNotNull() {
		account = new ModifiedAccount();
		assertNotNull(account);
	}
	
	@Test
	void accountObjectCanReceiveBalance() {
		account.depositCash(5000);
		assertEquals(5000, account.getBalance());
	}
	
	@Test
	void accountObjectCanWithdraw() {
		account.depositCash(5000);
		account.withdrawCash(2500);
		assertEquals(2500, account.getBalance());
	}

}
