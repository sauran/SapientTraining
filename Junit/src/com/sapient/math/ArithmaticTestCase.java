package com.sapient.math;

import junit.framework.TestCase;

public class ArithmaticTestCase extends TestCase {
	
	int firstNumber,secondNumber;
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		
		firstNumber =2;
		secondNumber= 4;
		super.setUp();
	}

	public final void testSum() {
		//fail("Not yet implemented");
		int expectedResult =6;
		Arithmatic arithmaticObjectRef = new Arithmatic();
		int actualResult  = arithmaticObjectRef.sum(firstNumber, secondNumber);
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		
		firstNumber=0;
		secondNumber=0;
		super.tearDown();
	}

}
