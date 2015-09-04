/**
 * 
 */

/**
 * @author span42
 *
 */
class IllegalAgeException extends Exception{
	public String getMessage(){
		return "You are not eligible for voting!!!!";
	}
	
	
	
	
	
	
}



class Vote{
	public void register(int age ) throws IllegalAgeException{
		if(age<18){
			throw new IllegalAgeException();
		}
		System.out.println("Eligible for Voting!!!");
	}
}
public class AddArguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vote vote = new Vote();
		try{
			vote.register(19);
		}
		catch(IllegalAgeException e){
			
			e.printStackTrace();
			
		}
		
		
			
		}

			
		// TODO Auto-generated method stub

	}


