package day2;

public class demo123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Display hello!!");  // Vanilla
		
		int x = 100;  //Syntax: dataType variable = value; 
		
		float y = x;  // Automatic Type casting //widening type casting
		System.out.println(y);
		
		// Narrow Type casting 
		long L = 3434;
	    int myInt = (int)L;	 
	    
	    Vanilla(myInt);
	}
	
	public static void  Vanilla(int myInt) {
		System.out.println(myInt);
	} // Syntax public void methodName() { } 
	

}
 