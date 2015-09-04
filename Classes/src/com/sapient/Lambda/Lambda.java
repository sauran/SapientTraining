/**
 * 
 */
package com.sapient.Lambda;

/**
 * @author span42
 *
 */

interface Test{
public void testing(int i);	
	
}

class Execution{
	public void call(Test test,int value){
		test.testing(value);
		
	}
}
public class Lambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Execution exec = new Execution();
		exec.call((value)->{;
		System.out.println("Testing1  " + value);
		},3);
		
		exec.call((value)->{System.out.println("testing2  " + value);},9);
		exec.call((value)->{System.out.println("testing3   " + value);},546);
		
		
		
		

	}

}
