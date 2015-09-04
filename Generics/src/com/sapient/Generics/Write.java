/**
 * 
 */
package com.sapient.Generics;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author span42
 *
 */
public class Write {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address();
		address.setStreet("  Park Street");
		address.setCountry("India");
		try{
			FileOutputStream fout = new FileOutputStream("D:\\address.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(address);
			oos.close();
			System.err.println("Done");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		

	}

}
