/**
 * 
 */
package com.sapient.client;


import java.util.ArrayList;
import java.util.List;

/**
 * @author span42
 *
 */
public class Subject {
	
	
	private List<Observer> observers = new ArrayList<Observer>();
	protected int state;
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	

}
