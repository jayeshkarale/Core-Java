package _06_Methods;

public class _01_Methods1 {
	
//	method with no return type and no parameter
	
	void greet() {
		System.out.println("Good Morning...");
	}
	
	void DisplayNumbers() { // display numbers
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	void CalculateArea() {  // calculate area of rectangle
		double length=5.6, breadth=7.9;
		double area=length*breadth;
		System.out.println("Area of Rectangle is: "+area);
	}
	
	public static void main(String[] args) {
		_01_Methods1 mm = new _01_Methods1();
		
		mm.greet();
		mm.DisplayNumbers();
		mm.CalculateArea();
		
	}

}
