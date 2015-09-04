/**
 * 
 */
package pacakge1;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author span42
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			
			
		// TODO Auto-generated method stub
			
			try{
				FileReader input = new FileReader(args[0]);
				try{
					FileWriter output = new FileWriter(args[0]);
					try{
						char[] buffer = new char[128];
						int charsRead;
						charsRead = input.read(buffer);
						while(charsRead!=-1){
							output.write(buffer,0,charsRead);
							charsRead = input.read(buffer);
						}
						
						
					
						
						
						
					}finally{
					output.close();
					}
					
					
				}
				finally{
						input.close();
					}
				}
				catch(IOException e2){
					e2.printStackTrace();
					
				}
			
			
		
		
	}
			
		
}



