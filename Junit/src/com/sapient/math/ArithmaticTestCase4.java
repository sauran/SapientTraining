package com.sapient.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArithmaticTestCase4 {

	@BeforeClass
	
	
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testIntern() {
		//fail("Not yet implemented");
		
		
		//Intern expectedIntern = new Intern();
		
		HR hr = new HR();
		
		Object result;
		result = hr.recruit("I");
		assertTrue(result instanceof Intern);
		//assertEquals(expectedIntern, result);
		
		
		
		
}

}
