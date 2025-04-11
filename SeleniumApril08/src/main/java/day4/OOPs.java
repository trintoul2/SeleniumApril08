package day4;

//Java program for demonstrating the features and functionalities of OOPs concepts in Java.  
class Animal {  
	public String name = "Dummy";  

 	// Constructor  
 	public Animal(String name) {  
 		this.name = name;  
 		// this.name = "Bill";
 	}  

 	// Encapsulation: Getter method  
 	public String getName() {  
 		return name;  
 	}  

 	// Polymorphism: Overridden method  
 	public void makeSound() {  
 		System.out.println("Some sound");  
 	}
}  

//Derived class (Inheritance)  
class Dog extends Animal {  
	// Constructor  
	public Dog(String name) {  
		super(name); 
		super.name= "George";
	}  

	// Polymorphism: Overriding method  
	// @Override  
	public void makeSound() {  
		System.out.println("Woof");  
	}  
}  

	//Derived class (Inheritance)  
  class Cat extends Animal {  
	// Constructor  
	public Cat(String name) {  
		super(name);  
	}  

	// Polymorphism: Overriding method  
	@Override  
	public void makeSound() {  
		System.out.println("Meow");  
	}  
}  


public class OOPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Creating objects of Dog and Cat classes 
		Animal some_Animal = new Animal("Some Animal Name");
		System.out.println("Animal Name: " + some_Animal.getName());
		some_Animal.makeSound();
		
        Dog dog = new Dog("Buddy");  
        Cat cat = new Cat("Whiskers");  
  
        // Accessing methods of base class through objects of derived classes  
        System.out.println("Dog name: " + dog.getName());  
        dog.makeSound();  
  
        System.out.println("Cat name: " + cat.getName());  
        cat.makeSound();  
    }  
}  


