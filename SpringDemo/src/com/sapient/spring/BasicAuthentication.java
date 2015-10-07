/**
 * 
 */
package com.sapient.spring;

/**
 * @author span42
 *
 */
public class BasicAuthentication implements Authentication {
	
	private int var;

	

	public int getVar() {
		return var;
	}



	public void setVar(int var) {
		this.var = var;
	}



	@Override
	public boolean validateCredentials(String firstName, String lastName) {
		// TODO Auto-generated method stub
		
		if (firstName.equalsIgnoreCase("saurabh") && lastName.equals("pandey")) {
			return true;
		}
		return false;
	
	}
	

	
	
}
