
public class Test_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Selenium obj = new Test_Selenium();
		int result = obj.add(10,5);
		int result2 = obj.subtraction(10,5);
		System.out.println(result);
		System.out.println(result2);
		

	}
	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtraction(int a, int b) {
		return a-b;
	}
}
