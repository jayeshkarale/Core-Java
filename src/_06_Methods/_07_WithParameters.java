package _06_Methods;

public class _07_WithParameters {
	
//	Methods with Parameters
	
	void myName(String name) {
		System.out.println("Name --> "+ name);
	}
	
//	1) take side as parameter and display area of square
	void getSquare(int a) {    
		int b = a*a;
		System.out.println("Square is: "+b);
	}
	
	
	public static void main(String[] args) {
		
		_07_WithParameters obj = new _07_WithParameters();
		obj.myName("Jayesh");
		
		obj.getSquare(8);
		
	}

}
