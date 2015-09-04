/**
 * 
 */
package com.sapient.FileInputStreamdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author span42
 *
 */
public class FileInputStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int size;
		FileInputStream f= new FileInputStream("D:/workspace/SauranNitro/Prac/src/com/sapient/FileInputStreamdemo.java");
		System.out.println("Total available Bytes :" + (size = f.available()));
		int n = size/40;
		System.out.println("First" + n + "bytes of the one read(_ at a time");
		for(int i=0;i<n;i++){
			System.out.println(f.read());
		}
		System.out.println("\nStill Available :" + f.available());
		System.out.println("Reading the next :" + n+ "with one read(b[])");
		
		byte b[] = new byte[n];
		if(f.read(b)!=n){
			System.err.println("could not read " + n+ "bytes");
		}
		System.out.println(new String(b,0,n));
		System.out.println("Still Available : " + (size = f.available()));
		System.out.println("skipping half of the remaining bytes with skip()");
		f.skip(size/2);
		System.out.println("Still available :" + f.available());
		System.out.println("Reading " + n/2 + "int otthe end of the array");
		if(f.read(b,n/2,n/2)!=n/2){
			System.out.println("could not read " + n/2  + "bytes");
		}
		System.out.println(new String(b,0,b.length));
		System.out.println("Still available " + f.available() );
		f.close();
		
		
		
	}

}
