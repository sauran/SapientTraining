/**
 * 
 */
package com.sapient.math;

/**
 * @author span42
 *
 */
public class OrderConversion {

	
	String[] unitsPlaceArray = { "One", "Two", "Three", "Four", "Five", "Six",
			"Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
			"Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	String[] tensPlaceArray = { "Twenty", "Thirty", "Fourty", "Fifty", "Sixty",
			"Seventy", "Eighty", "Ninty" };
	String[] namesToAppend = { "Hundred", "Thousand", "Lacs" };
	
	public String twoDigits(int number){
		
		if(number<20){
			return unitsPlaceArray[number-1];
		}
		
		int unitPlace = number%10;
		int tensPlace = number/10;
		
	    String 	strOutput  = "";
	    
	    
	    
	   if(unitPlace==0){
		   strOutput = tensPlaceArray[tensPlace -2];
	   }else{
		   strOutput = tensPlaceArray[tensPlace-2] + unitsPlaceArray[unitPlace-1];
	   }
	   return strOutput;
		
		
	}
	
	public String threeDigits(int number){
		
		String strOutput = "";
		
		if(number%100==0){
			return unitsPlaceArray[number/100-1] + "  hundred ";
		}
		
		
	int hundredsPlace = number/100;
	strOutput = unitsPlaceArray[hundredsPlace-1] +  " hundred " + " and " + twoDigits(number%100);
	
	return strOutput;
	
	
	}
	
	public String fourDigits(int number){
		String strOuput = "";
		
		if(number%1000==0){
			return unitsPlaceArray[number/1000-1] +  " Thousand ";
		}
		int thousandsPlace = number/1000;
		strOuput = unitsPlaceArray[number/1000-1] + " Thousand " + threeDigits(number%1000);
		
		return strOuput;
		
		
	}
	
	public String fiveDigits(int number){
		String strOutput = "";
		if(number %1000==0){
			return twoDigits(number/1000) + "  thousand ";
		}
		
		strOutput = twoDigits(number/1000) + "  thousand " + threeDigits(number%1000);
		
		return strOutput;
		
		
	}
	
	public String sixDigits(int number){
		String strOutput = "";
		strOutput = unitsPlaceArray[number/100000-1] + " Lacs " + fiveDigits(number%100000);
		
		return strOutput;
	}
	
	
	
	
	
	
	
	}