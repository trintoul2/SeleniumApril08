
public class Selenium_IClass implements Test_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selenium_IClass object = new Selenium_IClass();
		int result = object.add(10,5);
		int result2 = object.subtract(100, 50);
		System.out.println(result);
		System.out.println(result2);
		object.accept();
		object.decline();
	}

	public int add(int a, int b) {
		return a+b;   //Method Body
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}

	public void accept() {
		System.out.println("Incoming Call");
		
	}
	
	public void decline() {
		System.out.println("Decline Call");
		
	}
	

}



