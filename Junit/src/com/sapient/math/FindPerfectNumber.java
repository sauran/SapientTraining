/**
 * 
 */
package com.sapient.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author span42
 *
 */
public class FindPerfectNumber{
	
	public boolean  isPerfectNumber(int input) {
		
		
		
		
		int sum = 0;  //initial sum of divisors
		for(int counter=1;counter<input;counter++){
			
			if(input%counter==0){   //checking whether sum of divisors is equal to the number or not
				sum = sum +counter;  
			}
		}
		if(sum==input){
			return true;
		}else{
			return false;
		}
		
		
	}

}
