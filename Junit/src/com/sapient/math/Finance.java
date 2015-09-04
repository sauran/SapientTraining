/**
 * 
 */
package com.sapient.math;

import com.sapient.math.Confirmed;
import com.sapient.math.Employee;

/**
 * @author span42
 *
 */
class Finance{
	
	
	public void processSalary(Employee emp){
		
		emp.netSalary();
		if(emp instanceof Confirmed){
			Confirmed conf = (Confirmed) emp;
		conf.transport();
			
		}
		if(emp instanceof Intern){
			Intern conf = (Intern) emp;
		conf.transport();
		
	}
	
	
}
}