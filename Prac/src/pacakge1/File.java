/**
 * 
 */
package pacakge1.files;

import java.io.File;

/**
 * @author span42
 *
 */

class FileDemo{
	static void p(String s){
		System.out.println(s);
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File f1 = new File("D:/Sapient");
			p("File Name:" + f1.getName());
			
			
	}

}
