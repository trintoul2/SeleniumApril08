package day3;

import TestPractise.AnotherInterface;
import TestPractise.TestInterface;


public class EdgeClass implements TestInterface, AnotherInterface {

	public static void main(String[] args) {

		EdgeClass obj = new EdgeClass();
		int result = obj.add(10, 5);
		System.out.println(result);
		int result2 = obj.substraction(100, 50);
		System.out.println(result2);		
		obj.accept();
		obj.declined();
	}
	
	public int add(int a, int b) {     // method paramters
		System.out.println("This add is from EdgeClass Class");
		return a+b;            //method body
		
	}
	
	public void addThree(int a, int b, int c) {
		System.out.println(a+b+c);
		System.out.println("This addThree is from EdgeClass Class");
	}	
	
	public int substraction(int a, int b) {
		System.out.println("This subtraction is from EdgeClass Class");
		return a-b;
	}

	public void accept() {
		System.out.println("This accept is from EdgeClass Class");
		System.out.println("Accepted");
		
	}

	public void declined() {
		System.out.println("This reject is from EdgeClass Class");
		System.out.println("Reject");
	}


}
