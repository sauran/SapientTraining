package com.sapient.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MoneyTestCase {
	
	
	Money object = new Money(324,"Currency");
	@Before
	
	
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testMoney() {

		
		 new Money(123,"Check Currency");
		 new Money(45,"Check Currency");
		 
		 
		 
		 
		
	
		
		
		
		
		
		
	}

	@Test
	public final void testAmount() {
		
		
		Integer actualOutput = (object.amount());
		
		assertTrue(actualOutput instanceof Integer);
		
		
		
		
	}

	@Test
	public final void testCurrency() {
		
		
		
		assertTrue(object.currency() instanceof String);
		
		
	}

	@Test
	public final void testAdd() {
	
		
		Money mon;
		
	     mon = object.add(new Money(454,"Currency"));
		
		assertTrue(mon instanceof Money);
		
		
		
		
	}
	public final void testNull() {
		object.add(null);
	}
	

}
