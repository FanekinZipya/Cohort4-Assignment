package com.chapter3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvoiceTest {
	Invoice invoice;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		invoice = new Invoice();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void invoiceObjectCanCalculateInvoice() {
		invoice.setItemQuantity(3);
		invoice.setPricePerItem(5.0);
		
		assertEquals(15.0, invoice.getInvoiceAmount());
	}
	
	@Test
	void accountObjectCanDebug() {
//		invoice.setItemQuantity(-1);
//		assertEquals(0, invoice.getItemQuantity());
		
		invoice.setPricePerItem(-1.1);
		assertEquals(0.0, invoice.getPricePerItem());
	}
	
}
