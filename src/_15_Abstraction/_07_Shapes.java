package _15_Abstraction;

interface Shape{
	void area();
}

class Circle implements Shape{
	@Override
	public void area() {
		int r = 6;
		System.out.println("Area of circle: "+(3.14*r*r));
	}
}

class Rect implements Shape{
	@Override
	public void area() {
		int length=5; int width=4;
		System.out.println("Area of Rectangle: "+length*width);
	}
}

public class _07_Shapes {
	public static void main(String[] args) {
		Circle a1 = new Circle();
		a1.area();
		
		Rect a2 = new Rect();
		a2.area();
	}

}
