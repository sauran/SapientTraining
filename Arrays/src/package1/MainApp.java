/**
 * 
 */
package package1;

/**
 * @author span42
 *
 */
class Process{
	public int[] create(){
		int[] num;
		num = new int[10];
		num[3] =6;
		num[5]=486;
		return num;
	}
	
	public void display(int[] src){
		for(int data:src){
			System.out.println(data);
		}
	}

}
class Point{
	
	int num1,num2;
	Point(int value1,int value2){
		num1=value1;
		num2=value2;
	}
	
}

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 int[] src,dest;
		 src = new int[5];
		 dest = new int[10];
		 src[0]=456;
		 src[1]=123;
		 
		 
		 System.arraycopy(src, 0, dest, 5,5 );
		 for(int counter:dest){
			 System.out.println(counter);
		 }
	
		// TODO Auto-generated method stub
		
		
	  }

	}


