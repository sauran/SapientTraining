/**
 * 
 */
package com.sapient.cui.client;

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
}

class Confirmed extends Employee {
	public void netSalary() {
		System.out.println("Confirmed Employee's Salary");

	}
	public void transport(){
		System.out.println("Transport Facility");
	}
	
}

class HR {

	public Employee recruit(String empType) {
		if (empType.equals("I")) {
			return new Intern();
		} else if (empType.equals("C")) {
			return new Confirmed();
		}
		 else if (empType.equals("T")) {
				return new Contract();
		
	}
		return null;
}
}
class Finance{
	
	
	public void processSalary(Employee emp){
		
		emp.netSalary();
		if(emp instanceof Confirmed){
			Confirmed conf = (Confirmed) emp;
		conf.transport();
			
		}
		
	}
	
	
}
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		HR hr = new HR();
		Finance finance  = new Finance();
		
		Employee employee = hr.recruit("C");
		if (employee != null) {
			finance.processSalary(employee);
		}
		employee = hr.recruit("I");
		if (employee != null) {
			finance.processSalary(employee);
		}
		employee= hr.recruit("T");
		if(employee!=null){
			finance.processSalary(employee);
		}

	}

	}


