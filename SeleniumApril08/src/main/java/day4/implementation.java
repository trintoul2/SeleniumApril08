package day4;

public class implementation extends Abs {

	public static void main(String[] args) {
		implementation object = new implementation();
		Abs objA = new implementation();
		object.accept();
		objA.accept();
		object.declined_with_message();
		objA.declined_with_message();
		declined_with_message();
	}

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		System.out.println("Accept");
		
	}

	@Override
	public void declined() {
		// TODO Auto-generated method stub
		
	}

	public static void declined_with_message() {
		System.out.println("This is from Child class");
	}
	
}