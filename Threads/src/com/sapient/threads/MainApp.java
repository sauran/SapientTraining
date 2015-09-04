/**
 * 
 */
package com.sapient.threads;

/**
 * @author span42
 *
 */


class Data1{
	private int firstNumber,secondNumber;

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	 public boolean equals(Object obj){
		 boolean result = false;
		 
		 
		 if(( obj!=null) && (obj instanceof Data1)){
		 
		 Data1 d = (Data1)obj;
		 
		 
		 if(this.firstNumber==d.getFirstNumber() && this.secondNumber == d.getSecondNumber()){
			 result = true;
		 }
		 }
		 return result;
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }

	

	
	
	
}
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1= new Data1();
		Data1 d2  = new Data1();
		
		d1.setFirstNumber(2);
		d1.setSecondNumber(4);
		d2.setFirstNumber(2);
		d2.setSecondNumber(45);
		
		
		System.out.println(d1.equals(d2));
	
		
		
		

	}

}
