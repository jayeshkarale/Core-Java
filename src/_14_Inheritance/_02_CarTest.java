package _14_Inheritance;

class CarBrand{   // parent class
	String name = "Toyota";
	void CarBrand() {
		System.out.println("Car Brand: "+name);
	}
}

class Car extends CarBrand{  // child class
	String model="Fortuner Legender";
	void CarModel() {
		System.out.println("Car Model: "+model);
	}
}

public class _02_CarTest {
	public static void main(String[] args) {
		Car a = new Car();
		a.CarBrand();  // inherited method
		a.CarModel();  // own method
	}
}
