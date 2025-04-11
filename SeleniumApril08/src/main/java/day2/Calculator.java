package day2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator Toms_calculator = new Calculator();
		
		System.out.println(Toms_calculator.name());
		Toms_calculator.add(5,6);
		Toms_calculator.Substract(100, 200);
		Toms_calculator.devide(40, 6);
		Toms_calculator.multiply(4,6);
	}

	public int add(int x, int y) {
		int z = x+y;
		System.out.println(z);
		return z;
	}
			
	public String name() {
		return "Thomas Calculator";
	}
			
		
	public void Substract(int x, int y) {
		int z = y-x;
		System.out.println(z);
	}
			
			
	public void devide(int x, int y) {
		int z = x/y;
		System.out.println(z);
	}
			
	public void multiply(int x, int y) {
		int z = x*y;
		System.out.println(z);
	}
			
			
}


