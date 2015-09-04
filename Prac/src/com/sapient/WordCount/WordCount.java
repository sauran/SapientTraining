/**
 * 
 */
package com.sapient.WordCount;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author span42
 *
 */

 class WordCount {
	 public static int words = 0,lines = 0,chars = 0;
	 public static void wc(InputStreamReader isr)throws IOException{
		 int c = 0;
		 boolean lastWhite = true;
		 String whiteSpace = "\t\n\r";
		 while((c = isr.read())!=-1){
			 chars++;
			 if(c == '\n'){
				 lines++;
				 
			 }
			 int index = whiteSpace.indexOf(c);
			 if(index==-1){
				 if(lastWhite==true){
					 ++words;
				 }
				 lastWhite = false;
			 }
			 else{
				 lastWhite = true;
			 }
		 }
		 if(chars!=0){
			 ++lines;
		 }
		 
	 }
	
	
	
	

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub
		
		FileReader fr = null;
		try{
			if(args.length ==0){
				wc(new InputStreamReader(System.in));
			}
			else{
				for(int i=0;i<args.length;i++){
					fr = new FileReader(args[i]);
					wc(fr);
				}
			}
		}
		finally{
			fr.close();
		}

	}

}
