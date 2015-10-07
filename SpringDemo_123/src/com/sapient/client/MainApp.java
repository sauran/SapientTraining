package com.sapient.client;



import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	
	
	public static void main(String[] args){
		
		
		Logger log= Logger.getLogger(MainApp.class.getName());
		BasicConfigurator.configure();
	    AbstractApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		log.info("Spring IoC instantiated");
		Parent parent=(Parent)context.getBean("parentBean");
		//Employee employee= (Employee)context.getBean("empBean");
		log.info("Authenticator obtained");
		/*log.info(employee.getAddress());
		log.info(employee.getId());
		log.info(employee.getName());*/
		
		
		log.info(parent.getChild().getName());
		
		((AbstractApplicationContext)context).registerShutdownHook();
		
		
		
		
		//if(authentication instanceof BasicAuthentication){
			//log.info ((((BasicAuthentication) authentication).getMaxAttempts()));
			
		}
	
		
		
		
	}


