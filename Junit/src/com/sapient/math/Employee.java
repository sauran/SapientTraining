/**
 * 
 */
package com.sapient.math;

import com.sapient.math.Employee;

/**
 * @author span42
 *
 */
class Employee {
	public void netSalary() {
		System.out.println("Employees salary");
	}
}

class Contract extends Employee {
	public void netSalary() {
		System.out.println("Contract Employees's Salary");
	}
	public void transport(){
		System.out.println("Transport Facility");
	}
}

class Intern extends Employee {
	public void netSalary() {
		System.out.println("Intern's Salary");
	}
	public void transport(){
		System.out.println("Transport Facility");
	}
}

class Confirmed extends Employee {
	public void netSalary() {
		System.out.println("Confirmed Employee's Salary");

	}
	public void transport(){
		System.out.println("Transport Facility");
	}
	
}

