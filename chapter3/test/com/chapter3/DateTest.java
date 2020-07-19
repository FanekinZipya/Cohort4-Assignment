package com.chapter3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateTest {
	Date date;

	@BeforeEach
	void setUp() throws Exception {
	date = new Date(7, 15, 2020);
	}


	@Test
	void dateObjectCanDisplayDate() {
		assertEquals("15/7/2020", date.displayDate());
	}
}
