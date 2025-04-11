package day4;

// package One;

public class Child extends Parent {

	public static void main(String[] args) {
		Parent object = new Parent();
		Child object_Child = new Child();
		object.Banglaw();
		Bussiness();
		object.Car(); // Method over riding or run time Polymorphism
		Car();
	}

	public static int Car() {
		System.out.println("Child Car");
		return(15);
	};
	
}
