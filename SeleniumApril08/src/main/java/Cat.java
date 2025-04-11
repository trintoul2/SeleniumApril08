
public class Cat extends Animal {

	public void superEat() {
        super.eat();
    }

    public void superDrink() {
        super.drink();
    }

    @Override
    public void eat() {
        System.out.println("Cat Eats");
    }

    @Override
    public void drink() {
        System.out.println("Cat Drinks");
    }
	
	
	public static void main(String[] args) {
		
	    Cat myCat = new Cat();
	    myCat.eat();
	    myCat.drink();
	    myCat.superEat();
	    myCat.superDrink();

	    Animal myAnimal = new Animal();        
	    myAnimal.eat();
	    myAnimal.drink();

	}

}
