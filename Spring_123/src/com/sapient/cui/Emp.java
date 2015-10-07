package com.sapient.cui;

public class Emp {
	
	
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	private Integer employee_id;
	private String first_name;
	private Integer salary;

	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return employee_id+" : " +first_name+" : "+salary;
	}
}
