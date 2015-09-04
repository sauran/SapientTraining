 class ScopeExample{
	private int i=1;
	 void firstMethod(){
		 int i =4,j=5;
		 this.i= i+j;
		 secondMethod(7);
	 }
	 void secondMethod(int i){
		 int j=8;
		 this.i = i+j;
	 }
}


public class TestScoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ScopeExample scope = new ScopeExample();
scope.firstMethod();
	}

}
