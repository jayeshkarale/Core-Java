package _12_Polymorphism;

//  Create a Vehicle class with a start() method. Create Car and Bike classes that override
//  the start() method with their own implementation.

class Vehicle{
	void start() {
		System.out.println("Vehicle is starting...");
	}
}

class car extends Vehicle{
	@Override
	void start() {
		System.out.println("Car Starting...");
	}
}

class bike extends Vehicle{
	@Override
	void start() {
		System.out.println("Bike Starting...");
	}
}

public class _02_VehicleTest {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new car();
		Vehicle v3 = new bike();
		
		v1.start();
		v2.start();
		v3.start();
	}

}
