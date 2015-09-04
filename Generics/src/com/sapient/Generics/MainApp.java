/**
 * 
 */
package com.sapient.Generics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * @author span42
 *
 */

class Data<T>{
	private T value;
	
	

	public Data(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
		
	
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
}
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Data> result = new HashMap<Integer,Data>();
		
		result.put(3, new Data(12));
		result.put(3, new Data(112));
		result.put(5, new Data(152));
		result.put(8, new Data(126));
		
		Set<Integer> keys = result.keySet();
		
		
		for(Integer i : keys){
			System.out.println(i + ":" + result.get(i));
		}
		
		
		
		
		
		/*result.add(new Data(4));
		result.add(new Data(3));
		result.add(new Data(2));
		result.add(new Data(4));
		result.add(new Data(6));
		
		
		Iterator<Data> iterator = result.iterator();
		
		Data name;
		
		while(iterator.hasNext()){
			name = iterator.next();
			System.out.println(name);
		}*/
		
		/*Data<Integer>  d = new Data<Integer>();
		  d.setValue(new Integer(864));
		System.out.println(d.getValue());*/
		

	}

}
