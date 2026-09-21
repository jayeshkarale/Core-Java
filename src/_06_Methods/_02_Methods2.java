package _06_Methods;

public class _02_Methods2 {
	
	String getName() {
		String name = "JAYESH";
		return name;
	}
	
	float getCircumference() {
		float r = 6.24f;
		float c = 2*3.14f*r;   //   circumference = 2* pi * r
		return c;
	}
	
	float AraaofCircle() {
		float r1 = 5.64f;
		float a = 3.14f * r1 * r1;  // area = pi*r*r
		return a;
	}
	
	
	
	public static void main(String[] args) {
		_02_Methods2 obj = new _02_Methods2();
		
		String result = obj.getName();
		System.out.println(result);
		
		float r = obj.getCircumference();
		System.out.println("Circumference of circle: "+r);
		
		float a = obj.AraaofCircle();
		System.out.println("Area of circle is: "+a);
	}

}
