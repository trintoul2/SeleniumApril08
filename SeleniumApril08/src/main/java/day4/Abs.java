package day4;

public abstract class Abs {

	public static void main(String[] args) {
 
		//declined_with_message();
		declined_with_message();
		

	}
	public abstract void accept();   // Abstract Method 
	
	public abstract void declined();  // Abstract Method


	public static void declined_with_message() {
		System.out.println("This is from abstract parent class");
		
	}
}

