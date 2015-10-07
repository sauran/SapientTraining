package com.sapient.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Customer {
	
	
	@NotEmpty
	String name;
	
	
  @Range(min= 18,max = 60)
  	int age; 
  
  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
  
  

}
