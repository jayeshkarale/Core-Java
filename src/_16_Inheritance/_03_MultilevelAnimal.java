package _16_Inheritance;

class Animals{       // parent class
	void info() {
		System.out.println("this is animal.");
	}
}

class Dogs extends Animals{      // child class which is parent class of another child class
	void name() {
		System.out.println("Dog is animal.");
	}
}

class BullDog extends Dogs{     // child class
	void breed() {
		System.out.println("Breed of Dog is Bulldog.");
	}
}


// Hierarchical Inheritance
class Cats{
	void sound(){
		System.out.println("Meow..Meow");
	}
}
public class _03_MultilevelAnimal {
	public static void main(String[] args) {
		BullDog d = new BullDog();
		
		d.info();
		d.name();
		d.breed();	
		
		Cats c = new Cats();
		c.sound();
	}

}
