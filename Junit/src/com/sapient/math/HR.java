/**
 * 
 */
package com.sapient.math;

import com.sapient.math.Confirmed;
import com.sapient.math.Contract;
import com.sapient.math.Employee;
import com.sapient.math.Intern;

/**
 * @author span42
 *
 */
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