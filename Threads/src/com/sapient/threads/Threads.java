/**
 * 
 */
package com.sapient.threads;

/**
 * @author span42
 *
 */
class Data{
	private int value;
	public void getValue(){
		System.out.println(value);
	}
	public void setValue(int value){
		this.value  =value;
	}
}
class Runner implements Runnable {
	
	Data data;
	private Thread secondThread;
	public  Runner(){
		data = new Data();
	}
	
	public void run(){
		
		Thread curThread;
		curThread = Thread.currentThread();
		for(int counter=0;counter<10;counter++){
			if(curThread.getName().equals("Producer")){
				System.out.println(curThread);
				synchronized (data) {
					
				
				data.setValue(counter+1);
				try{
					data.notify();
					if(!secondThread.isAlive()){
						secondThread.start();
					}
					data.wait();
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			}
			else if(curThread.getName().equals("Consumer"))  {
				System.out.println(curThread);
				synchronized (data) {
				
				
				data.getValue();
				try{
				data.notify();
				
					data.wait(500);
				} catch(InterruptedException e){
					e.printStackTrace();
				}
				
				}
				
			}
		}
		
	
}

	public void setSecondThread(Thread secondThread)  {
		
		this.secondThread = secondThread;
		// TODO Auto-generated method stub
		
	}
}

public class Threads {

	/**
	 * @param args
	 */
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
	Runner runner = new Runner();
	Thread firstThread = new Thread(runner,"Producer");
	Thread secondThread = new Thread(runner,"Consumer");
	
	firstThread.start();
	runner.setSecondThread(secondThread);	
	System.out.println("END");	

}

}


