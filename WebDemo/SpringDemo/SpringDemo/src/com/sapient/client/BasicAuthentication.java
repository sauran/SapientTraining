package com.sapient.client;

import org.apache.log4j.Logger;

public class BasicAuthentication implements Authentication{
	
	private int maxAttempts;
	
	public int getMaxAttempts() {
		return maxAttempts;
	}

	public void setMaxAttempts(int maxAttempts) {
		this.maxAttempts = maxAttempts;
	}



	public BasicAuthentication(){
		Logger log= Logger.getLogger(MainApp.class.getName());
		log.info("BasicAuthentication initialised");
	}

	public boolean validateCredentials(String username, String password) {
		// TODO Auto-generated method stub
		if((username.equalsIgnoreCase("nimi"))&&(password.equals("sri")))
		{
			return true;
		}
		
		
		return false;
	}
}
