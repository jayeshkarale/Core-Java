package _13_Abstraction;

abstract class Shapes{
	abstract void DisplayShape();
	abstract void CalPerimeter();
	abstract void CalcArea();
}

 class Rectangle extends Shapes{
	private int length = 7;
	private int width = 4;
	@Override
	void CalcArea() {
		System.out.println(length*width);
	}
	@Override
	void DisplayShape() {
		System.out.println("Rectangle");
	}
	@Override
	void CalPerimeter() {
		System.out.println(2*(length+width));
	}
}

class Square extends Shapes{
	private int side = 7;
	@Override
	void CalcArea() {
		System.out.println(side*side);
	}
	@Override
	void DisplayShape() {
		System.out.println("Square");
	}
	@Override
	void CalPerimeter() {
		System.out.println(side*4);
	}
}

public class _02_ShapeTest {
	public static void main(String[] args) {
		Shapes s1 = new Rectangle();
		s1.CalcArea();
		s1.DisplayShape();
		s1.CalPerimeter();
		
		Shapes s = new Square();
		s.CalcArea();
		s.DisplayShape();
		s.CalPerimeter();
	}

}
