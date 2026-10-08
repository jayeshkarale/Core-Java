package _16_Inheritance;

// Hierarchical Inheritance
class Vehicle{
	void info() {
		System.out.println("Vehicle is Starting...");
	}
}

class Cars extends Vehicle{
	void brand() {
		System.out.println("Morris Garrage");
	}
}

class Bike extends Vehicle{
	void brand() {
		System.out.println("Honda");
	}
}

public class _04_HierarchicalVehicle {
	public static void main(String[] args) {
		Cars c = new Cars();
		c.info();
		c.brand();
		
		Bike b = new Bike();
		b.info();
		b.brand();
	}
}
