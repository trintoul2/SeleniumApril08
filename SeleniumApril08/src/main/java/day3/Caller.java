package day3;

import TestPractise.AnotherInterface;
import TestPractise.TestInterface;

public class Caller {

	public static void main(String[] args) {

		EdgeClass obj = new EdgeClass();
		int result = obj.add(10, 5);
		System.out.println(result);
		int result2 = obj.substraction(100, 50);
		System.out.println(result2);
		obj.accept();
		obj.declined();
		
		ChromeClass obj2 = new ChromeClass();
		obj2.declined();
		
		
		TestInterface Interface_one = new EdgeClass();
		Interface_one.add(13,1);
		Interface_one.accept();
		Interface_one.declined();
		
		AnotherInterface Interface_two = new ChromeClass();
		Interface_two.add(23,30);
		Interface_two.declined();
		Interface_two.substraction(10, 5);
		Interface_two.addThree(1,2,6);
		
	}

}
