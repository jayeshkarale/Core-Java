package _13_Abstraction;

abstract class Animal{
	private String name;
	
	Animal(String name){
		this.name=name;
	}
	
	abstract void sound();
	
	void eat() {
		System.out.println("Animal eating...");
	}
}

 class Dog extends Animal{
	 Dog(String name){
		 super(name);
	 }
	@Override
	void sound() {
		System.out.println("Dog Barks...");
	}
}

public class _01_AnimalTest {
	public static void main(String[] args) {
		Dog d = new Dog("a");
		d.eat();
		d.sound();
		
		Animal a = new Dog("b");
		a.sound();
		
	}
}