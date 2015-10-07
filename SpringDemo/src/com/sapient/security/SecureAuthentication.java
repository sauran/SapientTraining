/**
 * 
 */
package com.sapient.security;

import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;

import com.sapient.spring.Authentication;
import com.sapient.spring.MainApp;

/**
 * @author span42
 *
 */
public class SecureAuthentication implements Authentication {
   
	
	private int maxAttempts;
	
	public int getMaxAttempts() {
	return maxAttempts;
}



public void setMaxAttempts(int maxAttempts) {
	this.maxAttempts = maxAttempts;
}


	public SecureAuthentication() {
		Logger log = Logger.getLogger(MainApp.class.getName());
		BasicConfigurator.configure();
		
		log.info("Secure Authenticator instantiated");
	}

	
	@Override
	public boolean validateCredentials(String firstName, String lastName) {
		if (firstName.equalsIgnoreCase("saurabh") && lastName.equals("pandey")) {
			return true;
		}
		return false;
	}
}
		
	