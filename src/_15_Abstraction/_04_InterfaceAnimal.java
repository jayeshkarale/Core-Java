package _15_Abstraction;

// Abstraction using Interface (100 %)

interface Animals{
	int eyes =2;
	void eats();
}

class Monkey implements Animals{
	@Override
	public void eats() {
		System.out.println("Monkey eats Banana..");
	}
}

public class _04_InterfaceAnimal {
	public static void main(String[] args) {
		
		Monkey m = new Monkey();
		m.eats();
		
		Animals m1 = new Monkey();   // Dynamic Dispatch
		m1.eats();
	}
}
