package day3;

import TestPractise.AnotherInterface;
import TestPractise.TestInterface;


public class ChromeClass implements AnotherInterface{

	public static void main(String[] args) {

		EdgeClass obj = new EdgeClass();
		obj.declined();
		
		ChromeClass obj2 = new ChromeClass();
		obj2.declined();
				
		AnotherInterface Interface_an = new ChromeClass();
		Interface_an.add(23,30);
		Interface_an.declined();
		Interface_an.addThree(1,2,3);
		
	}
	
	public int substraction(int a, int b) {
		System.out.println("This subtraction is from ChromeClass Class");
		return a-b;
	}

	public int add(int a, int b) {
		System.out.println(a+b);
		System.out.println("This add is from ChromeClass Class");
		return(a+b);
	}
	
	public void addThree(int a, int b, int c) {
		System.out.println("This addThree is from ChromeClass Class");
	}
	

	public void declined() {
		// TODO Auto-generated method stub
		System.out.println("Reject");
		System.out.println("This Reject is from ChromeClass Class");
	}


}
