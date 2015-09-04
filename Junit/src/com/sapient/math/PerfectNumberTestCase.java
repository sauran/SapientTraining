package com.sapient.math;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PerfectNumberTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testPerfectNumber() throws IOException  {
		boolean expectedOutput=true;
		boolean actualOutput = false;
		BufferedReader bufferObject=new BufferedReader(new InputStreamReader(System.in));
		
		try{
			int input = Integer.parseInt(bufferObject.readLine());
		
		FindPerfectNumber object = new FindPerfectNumber();
		
	actualOutput = object.isPerfectNumber(input);
		}
		catch(NumberFormatException e)
		{
			System.err.println("Please Input A Number");
		}
		
		assertEquals(expectedOutput, actualOutput);
		
	}

}
