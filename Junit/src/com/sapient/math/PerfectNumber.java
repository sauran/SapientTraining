/**
 * 
 */
package com.sapient.math;

/**
 * @author span42
 *
 */
public class PerfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 8;
		int sum = 0;
		for(int counter=1;counter<number;counter++){
			
			if(number%counter==0){
				sum+=counter;
			}
			
			
			
		}
		if(sum==number){
			System.out.println("yes");
		}else{
			System.out.println("NO");
		}

	}

}
