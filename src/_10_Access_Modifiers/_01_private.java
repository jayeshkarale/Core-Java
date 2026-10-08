package _10_Access_Modifiers;

public class _01_private {
	
//	1. Private Specifiers/Modifiers.
	
	private int age=24;
	
	private void display() {
		System.out.println("Age is: "+age);
	}
	
	public static void main(String[] args) {
		_01_private obj = new _01_private();
		
		obj.display();
	}

}
