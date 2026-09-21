package _12_Polymorphism;
/*  Create a Food class with a prepare() method. Create Pizza, Burger, and Pasta classes that override
    the prepare() method to describe how each food is prepared.*/

class Food{
	void prepare() {
		System.out.println("FOOD...");
	}
}

class Pizza extends Food{
	@Override
	void prepare() {
		System.out.println("Pizza is ready...");
	}
}

class Burger extends Food{
	@Override
	void prepare() {
		System.out.println("Burger is ready...");
	}
}

class Pasta extends Food{
	void prepare() {
		System.out.println("Pasta is ready...");
	}
}

public class _08_FoodTest {
	public static void main(String[] args) {
		Food f1 = new Pizza();
		f1.prepare();
		Food f2 = new Burger();
		f2.prepare();
		Food f3 = new Pasta();
		f3.prepare();
	}
}
