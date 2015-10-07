/**
 * 
 */
package com.sapient.spring;



import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author span42
 *
 */


import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sapient.security.SecureAuthentication;


public class MainApp {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(MainApp.class.getName());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		log.info("Spring IoC instantiated");
		Authentication authentication = (Authentication) context.getBean("parentBean");
		log.info("Authenticator obtained");
	//	log.info()
		/*
		if(authentication instanceof SecureAuthentication) {
            log.info(((SecureAuthentication) authentication).getMaxAttempts());
        }
		boolean status = authentication.validateCredentials("saurabh", "pandey");
		log.info(status);
		BasicAuthentication  basicauth= (BasicAuthentication) context.getBean("authBean1");
		log.info(basicauth.getVar());
		log.info("Authenticator obtained");
*/
	}

}
