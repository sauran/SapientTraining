package com.sapient.client;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Parent {
	
	static Logger log= Logger.getLogger(MainApp.class.getName());
	
	private Child child;
	
	

	public Child getChild() {
		return child;
	}

	@Autowired
	@Qualifier("childBean1")
	public void setChild(Child child) {
		this.child = child;
		log.info("properties initialised");
	}
	

	public Parent(Child child){
		this.child=child;
		log.info("constructor initialised");
	}
	
	public Parent(){
		
	}

	@PreDestroy
	public void destroying() throws Exception {
		// TODO Auto-generated method stub
		log.info("bean destroyed");
		
	}

@PostConstruct
	public void init() throws Exception {
		// TODO Auto-generated method stub
		log.info("further initialised");
		
	}

}
