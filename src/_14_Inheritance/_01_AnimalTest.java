package _14_Inheritance;          // 18/07/2026

/* Inheritance: it is oops concept where one class (child class) Acquires the 
 * properties (fields) and behaviours (methods) of another class (parent class). */

class Animal{    // parent class
	void eat() {
		System.out.println("animal is eating..");
	}
}

class Dog extends Animal {   // child class
	void Sound() {
		System.out.println("Dog Barks...");
	}
}

class Cat extends Animal{
	void Sound() {
		System.out.println("Meow....");
	}
}

public class _01_AnimalTest {
	public static void main(String[] args) {
		
		Dog a = new Dog();
		a.eat();   // inherited method
		a.Sound();   // own method
		
		Cat c = new Cat();
		c.eat();
		c.Sound();
	}
}
