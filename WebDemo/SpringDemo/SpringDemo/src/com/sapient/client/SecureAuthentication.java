package com.sapient.client;

public class SecureAuthentication implements Authentication {

	@Override
	public boolean validateCredentials(String username, String password) {
		// TODO Auto-generated method stub
		if((username.equalsIgnoreCase("nimi"))&&(password.equals("sri")))
		{
			return true;
		}
		
		
		return false;
	}

}
