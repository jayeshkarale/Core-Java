package _12_Polymorphism;         // 16/07/2026

class Animal {
	String name = "ANIMAL";
	void sound() {
		System.out.println("animal makes sound...");
	   }
}
	
class Dog extends Animal {
    String name = "DOG";
	
	@Override
	void sound() {
		System.out.println("barkk...");
	}
}

class Cat extends Animal {
	String name = "CAT";
	
	@Override
	void sound() {
		System.out.println("meoww...");
	}
}

class Cow extends Animal {
    String name = "COW";
	
	@Override
	void sound() {
		System.out.println("mooo...");
	}
}

public class _01_AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.name);
		a.sound();
		System.out.println("-----------------------");
		
		Dog b=new Dog();
		System.out.println(b.name);
		b.sound();
		System.out.println("-----------------------");
		
		Cat c=new Cat();
		System.out.println(c.name);
		c.sound();
		System.out.println("-----------------------");
		
		Cow w = new Cow();
		System.out.println(w.name);
		w.sound();
		System.out.println("-----------------------");
	}

}
