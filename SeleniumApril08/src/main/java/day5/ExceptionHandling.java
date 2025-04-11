package day5;

public class ExceptionHandling {

	public static void main(String[] args) {

		// Error: External Factors - coffee spills
		
		int x = 5;
		try {
			System.out.println(x/0); //divide by zero, unchecked exception, Runtime exceptions
		} catch(Exception e1) {
			System.out.println("Handling the error");
			e1.printStackTrace();
		} finally  {
			System.out.println("Finally Block");
		}
		System.out.println("Java continues");

	}
	
	// public void method1() { - incorrect syntax,  Compile time error or checked exception

}
