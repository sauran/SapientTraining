/**
 * 
 */
package com.sapient.math;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author span42
 *
 */
public class RunTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result result = JUnitCore.runClasses(ArithmaticTestCase.class);
		for(Failure failure : result.getFailures()){
		  System.out.println(failure.toString());
		  
		}
		System.out.println(result.wasSuccessful());
		

	}
	
	

}
