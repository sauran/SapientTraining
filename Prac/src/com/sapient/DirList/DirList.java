/**
 * 
 */
package com.sapient.DirList;

import java.io.File;



/**
 * @author span42
 *
 */
public class DirList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dirname = "D:/sapient";
		File f1 = new File(dirname);
		if(f1.getParent()!=null){
			System.out.println("Directory of  " + dirname  );
		String s[] = f1.list();
		for(int i=0;i<s.length;i++){
			File f = new  File(dirname + "/" + s[i]);
			System.out.println(s[i] + "is a directory");
			
		}else {
			System.out.println(s[i] + "is a file");
		}
		
		}
		
		

	}else{
		System.out.println(dirname + "is not  a directory");
	}

}
}
