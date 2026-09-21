package _12_Polymorphism;

/* Create a Shape class with an area() method. Create Circle and Rectangle classes
   that override the area() method to calculate their respective areas.
*/

class Shape{
	double Area() {
		return 0;
	}
}

class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	double Area() {
		return radius*radius*3.14;
	}
}

class Rectangle extends Shape{
	double length,width;
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	@Override
	double Area() {
		return length*width;
	}
}

public class _04_AreaTest {
	public static void main(String[] args) {
		Shape s1 = new Circle(5);
		System.out.println("Area of circle is: "+s1.Area());
		
		Shape s2 = new Rectangle(4, 5);
		System.out.println("Area of rectangle is: "+s2.Area());
	}
}
