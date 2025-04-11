package day3;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifier object = new AccessModifier();
		object.method1();
		object.method2();
		object.method3();
		method4();

	}
	
	
	public void method1() { //public method
		System.out.println("Method1");
		
	}
	
	static void method2() { //default not allowed outside package
		System.out.println("Method2");
		
	}
	
	private void method3() {
		System.out.println("Method3");
		
	}
	
	protected static void method4() {
		System.out.println("Method4");
	}
}
