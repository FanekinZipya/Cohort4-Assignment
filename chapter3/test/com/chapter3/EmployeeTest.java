package com.chapter3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	Employee employee;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	employee = new Employee();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void objectCanRejectNegativeNumber() {
		employee.setMonthlySalary(-1.1);
		assertEquals(0.0, employee.getMonthlySalary());
	}
	
	@Test
	void objectCanGetYearlySalary() {
		employee.setMonthlySalary(10.0);
		assertEquals(120.0, employee.yearlySalary());
	}

}
